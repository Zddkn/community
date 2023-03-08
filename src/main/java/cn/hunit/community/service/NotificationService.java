package cn.hunit.community.service;

import cn.hunit.community.dto.NotificationDTO;
import cn.hunit.community.dto.PaginationDTO;
import cn.hunit.community.mapper.NotificationMapper;
import cn.hunit.community.mapper.UserMapper;
import cn.hunit.community.model.Notification;
import cn.hunit.community.model.NotificationExample;
import cn.hunit.community.model.User;
import cn.hunit.community.model.UserExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class NotificationService {
    @Autowired(required = false)
    private NotificationMapper notificationMapper;
    @Autowired(required = false)
    private UserMapper userMapper;

    public PaginationDTO list(Long userId, Integer page, Integer size) {
        PaginationDTO<NotificationDTO> paginationDTO = new PaginationDTO<>();
        Integer totalPage;
        NotificationExample notificationExample = new NotificationExample();
        notificationExample.createCriteria()
                .andReceiverEqualTo(userId);
        Integer totalCount = (int)notificationMapper.countByExample(notificationExample);

        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        } else {
            totalPage = totalCount / size + 1;
        }

        //限制页数
        if (page < 1) {
            page = 1;
        }
        if (page > totalPage) {
            page = totalPage;
        }
        paginationDTO.setPagination(totalPage, page);

        //offset偏移量
        //mysql提供limit函数实现分页
        Integer offset = size * (page - 1);
        NotificationExample example = new NotificationExample();
        example.createCriteria()
                .andReceiverEqualTo(userId);

        List<Notification> notifications = notificationMapper.selectByExampleWithRowbounds(example, new RowBounds(offset, size));

        if (notifications.size() == 0){
            return paginationDTO;
        }
        Set<Long> disUserIds = notifications.stream().map(notify -> notify.getNotifier()).collect(Collectors.toSet());
        List<Long> userIds = new ArrayList<>(disUserIds);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIn(userIds);
        List<User> users = userMapper.selectByExample(userExample);
        users.stream().collect(Collectors.toMap(u->u.getId(),u->u));

        List<NotificationDTO> notificationDTOList = new ArrayList<>();
        paginationDTO.setData(notificationDTOList);
        return paginationDTO;
    }
}
