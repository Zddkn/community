package cn.hunit.community.dto;

import cn.hunit.community.model.User;
import lombok.Data;

import javax.print.attribute.IntegerSyntax;

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
