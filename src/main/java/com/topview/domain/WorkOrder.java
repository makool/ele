package com.topview.domain;

import java.util.Date;

public class WorkOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.work_order_id
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String workOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.address
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.longitude
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.latitude
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.quoted_price
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private Double quotedPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.titile
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String titile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.description
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.pic
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.create_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.after_sale_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private Date afterSaleTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.update_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.over_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private Date overTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.client_mobile_phone
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String clientMobilePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_order.ele_mobile_phone
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    private String eleMobilePhone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.work_order_id
     *
     * @return the value of work_order.work_order_id
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getWorkOrderId() {
        return workOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.work_order_id
     *
     * @param workOrderId the value for work_order.work_order_id
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.address
     *
     * @return the value of work_order.address
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.address
     *
     * @param address the value for work_order.address
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.longitude
     *
     * @return the value of work_order.longitude
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.longitude
     *
     * @param longitude the value for work_order.longitude
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.latitude
     *
     * @return the value of work_order.latitude
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.latitude
     *
     * @param latitude the value for work_order.latitude
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.quoted_price
     *
     * @return the value of work_order.quoted_price
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public Double getQuotedPrice() {
        return quotedPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.quoted_price
     *
     * @param quotedPrice the value for work_order.quoted_price
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setQuotedPrice(Double quotedPrice) {
        this.quotedPrice = quotedPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.titile
     *
     * @return the value of work_order.titile
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getTitile() {
        return titile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.titile
     *
     * @param titile the value for work_order.titile
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setTitile(String titile) {
        this.titile = titile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.description
     *
     * @return the value of work_order.description
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.description
     *
     * @param description the value for work_order.description
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.pic
     *
     * @return the value of work_order.pic
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.pic
     *
     * @param pic the value for work_order.pic
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.create_time
     *
     * @return the value of work_order.create_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.create_time
     *
     * @param createTime the value for work_order.create_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.after_sale_time
     *
     * @return the value of work_order.after_sale_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public Date getAfterSaleTime() {
        return afterSaleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.after_sale_time
     *
     * @param afterSaleTime the value for work_order.after_sale_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setAfterSaleTime(Date afterSaleTime) {
        this.afterSaleTime = afterSaleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.update_time
     *
     * @return the value of work_order.update_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.update_time
     *
     * @param updateTime the value for work_order.update_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.over_time
     *
     * @return the value of work_order.over_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public Date getOverTime() {
        return overTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.over_time
     *
     * @param overTime the value for work_order.over_time
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.client_mobile_phone
     *
     * @return the value of work_order.client_mobile_phone
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getClientMobilePhone() {
        return clientMobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.client_mobile_phone
     *
     * @param clientMobilePhone the value for work_order.client_mobile_phone
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setClientMobilePhone(String clientMobilePhone) {
        this.clientMobilePhone = clientMobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_order.ele_mobile_phone
     *
     * @return the value of work_order.ele_mobile_phone
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public String getEleMobilePhone() {
        return eleMobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_order.ele_mobile_phone
     *
     * @param eleMobilePhone the value for work_order.ele_mobile_phone
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    public void setEleMobilePhone(String eleMobilePhone) {
        this.eleMobilePhone = eleMobilePhone;
    }
}