package com.person.mail.pojo;

import java.util.Date;



/**
 * po （persistent object）
 * pojo （plian ordinary java object）
 * @Author popeye
 * @Date 2020/05/20
 * @Version V1.0
 **/
public class Category {
    // 类别Id
    private Integer id;
    // 父类别id当id=0时说明是根节点,一级类别
    private Integer parentId;
    // 类别名称
    private String name;
    // 类别状态1-正常,2-已废弃
    private Integer status;
    // 排序编号,同类展示顺序,数值相等则自然排序
    private Integer sortOrder;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date updateTime;


    public Category() {
    }

    public Category(Integer id, Integer parentId, String name, Integer status, Integer sortOrder, Date createTime, Date updateTime) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.status = status;
        this.sortOrder = sortOrder;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取
     * @return sortOrder
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置
     * @param sortOrder
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取
     * @return updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Category{id = " + id + ", parentId = " + parentId + ", name = " + name + ", status = " + status + ", sortOrder = " + sortOrder + ", createTime = " + createTime + ", updateTime = " + updateTime + "}";
    }
}
