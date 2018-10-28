package org.chens.core.tree;


import org.chens.core.enums.IBaseEnum;

/**
 * 树节点错误枚举
 *
 * @author songchunlei@qq.com
 * @since 2018/3/8
 */
public enum TreeExceptionEnum implements IBaseEnum {


    NO_ROOT_ID(10001,"没有根节点");

    private Integer code;

    private String message;

    TreeExceptionEnum(Integer code, String message) {
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
