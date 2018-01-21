package com.topview.domain;

import java.util.Date;

public class WorkOrderStatus {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order_status.work_order_status_id
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String workOrderStatusId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order_status.status
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order_status.description
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order_status.update_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order_status.work_order_id
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String workOrderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order_status.work_order_status_id
     *
     * @return the value of work_order_status.work_order_status_id
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getWorkOrderStatusId() {
        return workOrderStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order_status.work_order_status_id
     *
     * @param workOrderStatusId the value for work_order_status.work_order_status_id
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setWorkOrderStatusId(String workOrderStatusId) {
        this.workOrderStatusId = workOrderStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order_status.status
     *
     * @return the value of work_order_status.status
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order_status.status
     *
     * @param status the value for work_order_status.status
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order_status.description
     *
     * @return the value of work_order_status.description
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order_status.description
     *
     * @param description the value for work_order_status.description
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order_status.update_time
     *
     * @return the value of work_order_status.update_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order_status.update_time
     *
     * @param updateTime the value for work_order_status.update_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order_status.work_order_id
     *
     * @return the value of work_order_status.work_order_id
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getWorkOrderId() {
        return workOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order_status.work_order_id
     *
     * @param workOrderId the value for work_order_status.work_order_id
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }
}