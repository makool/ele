package com.topview.dao;

import com.topview.domain.WorkOrderStatus;

public interface WorkOrderStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order_status
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int deleteByPrimaryKey(String workOrderStatusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order_status
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int insert(WorkOrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order_status
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int insertSelective(WorkOrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order_status
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    WorkOrderStatus selectByPrimaryKey(String workOrderStatusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order_status
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int updateByPrimaryKeySelective(WorkOrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work_order_status
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int updateByPrimaryKey(WorkOrderStatus record);
}