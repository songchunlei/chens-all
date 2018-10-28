package org.chens.core.base;

import org.chens.core.vo.PageResult;
import org.chens.core.vo.QueryPageEntity;
import org.chens.core.vo.Result;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 基础后台增删改查服务
 *
 * @author songchunlei
 * @since 2018/10/6
 */
public interface BaseBackgroundFacade<T> {

    /**
     * 新增
     * @param obj
     * @return
     */
    Result<Boolean> insert(T obj);

    /**
     * 删除
     * @param id
     * @return
     */
    Result<Boolean> deleteById(Serializable id);

    /**
     * 更新
     * @param obj
     * @return
     */
    Result<Boolean> updateById(T obj);

    /**
     * 新增或更新(根据是否有id判断)
     * @param obj
     * @return
     */
    Result<Boolean> insertOrUpdate(T obj);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Result<T> selectById(Serializable id);

    /**
     * 数量
     * @param obj
     * @return
     */
    Result<Integer> selectCount(T obj);

    /**
     * 查询
     * @param obj
     * @return
     */
    Result<List<T>> selectList(T obj);

    /**
     * 查询
     * @param page
     * @return
     */
    Result<PageResult<T>> selectPage(QueryPageEntity<T> page);

    /**
     * 批量删除
     * @param idList
     * @return
     */
    Result<Boolean> deleteBatchIds(Collection<? extends Serializable> idList);
}
