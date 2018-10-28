package org.chens.core.exception;


import org.chens.core.enums.IBaseEnum;

/**
 * 基本错误枚举
 *
 * @author songchunlei@qq.com
 * @since 2018/3/8
 */
public enum BaseExceptionEnum implements IBaseEnum {


    /**
     * 请求反馈
     */
    NO_DATA(300,"查询不到数据"),
    QUERY_ERROR(301,"查询异常"),
    NO_UPDATE(302,"更新失败"),
    NO_DELETE(303,"删除失败"),
    NO_SAVE(304,"保存失败"),
    VALIDATE_FAILED(305, "校验不通过"),
    TIMEOUT(306, "请求超时"),

    /**
     * 请求异常
     */
    REQUEST_NULL(600, "请求有错误或请求数据为空"),
    DATA_REQUEST_ERROR(601, "数据传输失败"),
    SERVER_ERROR(602, "服务器异常");

    private Integer code;

    private String message;

    BaseExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }


}
