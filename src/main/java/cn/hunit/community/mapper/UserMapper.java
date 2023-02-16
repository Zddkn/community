package cn.hunit.community.mapper;

import cn.hunit.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Insert({"insert into user(id,account_id,name,token,gmt_create,gmt_modified) values(#{id},#{accountId},#{name},#{token},#{gmtCreate},#{gmtModified})"})
    void insert(User user);
}
