package cn.hunit.community.mapper;

import cn.hunit.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Insert({"insert into user(id,account_id,name,token,gmt_create,gmt_modified) values(#{id},#{accountId},#{name},#{token},#{gmtCreate},#{gmtModified})"})
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}
