package org.chens.core.tree;


import org.chens.core.exception.BaseException;
import org.chens.core.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 树工具
 *
 * @author songchunlei@qq.com
 * @create 2018/3/5
 */
public class TreeUtil {
    /**
     * 两层循环实现建树
     *
     * @param treeNodes 传入的树节点列表
     * @return
     */
    public static <T extends BaseTree> List<T> build(List<T> treeNodes, String rootId) {
        if (StringUtils.isEmpty(rootId)) {
            throw new BaseException(TreeExceptionEnum.NO_ROOT_ID);
        }

        List<T> trees = new ArrayList<T>();

        for (T treeNode : treeNodes) {

            if (rootId.equals(treeNode.getPId())) {
                trees.add(treeNode);
            }

            for (T it : treeNodes) {
                if (it.getPId().equals(treeNode.getId())) {
                    treeNode.add(it);
                }
            }
        }
        return trees;
    }

    /**
     * 获取树map
     *
     * @param treeNodes
     * @param <T>
     * @return
     */
    public static <T extends BaseTree> Map<String, T> getTreeMap(List<T> treeNodes) {
        if (treeNodes == null || treeNodes.isEmpty()) {
            return null;
        }
        Map<String, T> map = new HashMap<String, T>();
        for (T it : treeNodes) {
            map.put(it.getId(), it);
        }
        return map;
    }


}
