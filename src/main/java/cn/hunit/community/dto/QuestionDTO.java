package cn.hunit.community.dto;

import cn.hunit.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String description;
    private String title;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
    private User user;
}
