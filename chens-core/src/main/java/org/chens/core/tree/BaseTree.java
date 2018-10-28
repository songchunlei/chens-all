package org.chens.core.tree;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 通用树节点
 *
 * @author songchunlei
 * @since 2018/3/12
 */
@Data
public abstract class BaseTree<T extends BaseTree> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4252766469774648992L;

    /**
     * 根节点
     */
    public static final String BASE_TREE_ROOT="-1";
    public static final String BASE_TREE_ROOT_NAME="根节点";

    /**
     * id
     */
    protected String id;
    /**
     * 父id
     */
    protected String pId;
    /**
     * 名称
     */
    protected String name;
    /**
     * 分类
     */
    protected String codeType;
    /**
     * 是否选中
     */
    protected boolean checked;
    /**
     * 子列表
     */
    protected List<T> children;

    public BaseTree() {

    }

    public BaseTree(String id, String pId, String name, String codeType, boolean checked) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.codeType = codeType;
        this.checked = checked;
    }

    /**
     * 重构等于
     */
    @Override
    public boolean equals(Object obj) {
        //如果是引用同一个实例
        if (this == obj) {
            return true;
        }
        if (obj != null && obj instanceof BaseTree) {
            //当id一样，就认为树结构一致
            BaseTree temp = (BaseTree) obj;
            return this.id.equals(temp.id);
        } else if (obj != null && obj instanceof String) {
            return this.id.equals((String) obj);
        } else {
            return false;
        }
    }

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }

    /**
     * 加入子列表
     *
     * @param node
     */
    public void add(T node) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(node);
    }
}
