package com.topview.dao;

import com.topview.domain.Client;

public interface ClientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int deleteByPrimaryKey(String mobliephone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int insert(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int insertSelective(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    Client selectByPrimaryKey(String mobliephone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int updateByPrimaryKeySelective(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int updateByPrimaryKey(Client record);
}