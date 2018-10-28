package org.chens.core.vo;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 *
 * @author songchunlei@qq.com
 * @since 2018/3/6
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 4018322190219282262L;


    /**
     * 用户id
     */
    private String id;

    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 姓名
     */
    private String name;

    /*
     * 用户名
     */
    private String username;

    /**
     * token
     */
    private String token;

    public UserInfo(String id, String name, String username, String tenantId, String token) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.tenantId = tenantId;
        this.token = token;
    }

    public UserInfo() {

    }
}
