package org.chens.core.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果集
 *
 * @author songchunlei
 * @since 2018/10/5
 */
@Data
public class PageResult<T> implements Serializable {
    private static final long serialVersionUID = -272668299989366611L;

    /**
     * 总数
     */
    private int total;

    /**
     * 每页显示条数，默认 10
     */
    private int size = 10;

    /**
     * 总页数
     */
    private int pages;

    /**
     * 当前页
     */
    private int current = 1;

    /**
     * 记录列表
     */
    private List<T> records;

}
