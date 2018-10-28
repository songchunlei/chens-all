package org.chens.core.vo;

import lombok.Data;
import org.chens.core.enums.IBaseEnum;

import java.io.Serializable;

/**
 * 反馈结果集
 *
 * @author songchunlei@qq.com
 * @since 2018/3/5
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 5375579517756081365L;

    private static final int ERROR_CODE = 0;

    private static final int SUCCESS_CODE = 1;

    private static final String EMPTY_MSG = "";

    /**
     * 反馈编码
     */
    private Integer code;

    /**
     * 反馈消息
     */
    private String msg;

    /**
     * 反馈数据
     */
    private T data;

    private Result() {
    }

    private Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 枚举转结果集
     *
     * @param baseEnum
     */
    private Result(IBaseEnum baseEnum) {
        this.code = baseEnum.getCode();
        this.msg = baseEnum.getMessage();
        this.data = null;
    }

    private Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 判断是否成功
     * 
     * @return Boolean
     */
    public Boolean isSuccess() {
        if (code == SUCCESS_CODE) {
            return true;
        } else {
            return false;
        }
    }

    public static Result getInstance() {
        return new Result();
    }

    public static <T> Result<T> getSuccess(String msg, T data) {
        if (msg == null) {
            msg = EMPTY_MSG;
        }
        return new Result(SUCCESS_CODE, msg, data);
    }

    public static <T> Result<T> getSuccess(T data) {
        return getSuccess(EMPTY_MSG, data);
    }

    public static Result getSuccess(String msg) {
        return getSuccess(msg, null);
    }

    public static Result getSuccess() {
        return getSuccess(EMPTY_MSG, null);
    }

    public static Result getError(IBaseEnum baseEnum) {
        return new Result(baseEnum);
    }

    public static Result getError(Integer code, String msg) {
        return new Result(code, msg);
    }

    public static Result getError(String msg) {
        return new Result(ERROR_CODE, msg);
    }
}
