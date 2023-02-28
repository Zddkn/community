package cn.hunit.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUNT(2001, "你找的问题不在了，换一个试试"),
    TARGET_PARAM_NOT_FOUNT(2002, "未选中任何问题进行回复"),
    NOT_LOGIN(2003, "当前操作需要登录，请登录后重试"),
    SYS_ERROR(2004, "别急，稍后再试试"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUNT(2006, "回复的评论不在了，换一个试试"),
    CONTENT_IS_EMPTY(2007, "输入内容不能为空");

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}