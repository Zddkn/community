package cn.hunit.community.mapper;

import cn.hunit.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}