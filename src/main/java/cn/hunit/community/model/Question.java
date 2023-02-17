package cn.hunit.community.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String description;
    private String title;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
}
