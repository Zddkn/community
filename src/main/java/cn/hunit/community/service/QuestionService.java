package cn.hunit.community.service;

import cn.hunit.community.dto.PaginationDTO;
import cn.hunit.community.dto.QuestionDTO;
import cn.hunit.community.mapper.QuestionMapper;
import cn.hunit.community.mapper.UserMapper;
import cn.hunit.community.model.Question;
import cn.hunit.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionMapper questionMapper;

    public PaginationDTO list(Integer page, Integer size) {
        PaginationDTO paginationDTO = new PaginationDTO();
        //totalCount总问题数
        Integer totalCount = questionMapper.count();
        paginationDTO.setPagination(totalCount, page, size);

        //限制页数
        if (page < 1) {
            page = 1;
        }
        if (page > paginationDTO.getTotalPage()) {
            page = paginationDTO.getTotalPage();
        }
        //offset偏移量
        //mysql提供limit函数实现分页
        Integer offset = size * (page - 1);
        List<Question> questions = questionMapper.list(offset,size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();


        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        paginationDTO.setQuestions(questionDTOList);
        return paginationDTO;
    }
}
