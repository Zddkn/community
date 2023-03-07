package cn.hunit.community.mapper;

import cn.hunit.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}