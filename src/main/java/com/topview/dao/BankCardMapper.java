package com.topview.dao;

import com.topview.domain.BankCard;

public interface BankCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_card
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int deleteByPrimaryKey(String bankCradId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_card
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int insert(BankCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_card
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int insertSelective(BankCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_card
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    BankCard selectByPrimaryKey(String bankCradId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_card
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int updateByPrimaryKeySelective(BankCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_card
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int updateByPrimaryKey(BankCard record);
}