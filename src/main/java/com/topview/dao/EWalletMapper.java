package com.topview.dao;

import com.topview.domain.EWallet;

public interface EWalletMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_wallet
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int deleteByPrimaryKey(String eWalletId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_wallet
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int insert(EWallet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_wallet
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int insertSelective(EWallet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_wallet
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    EWallet selectByPrimaryKey(String eWalletId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_wallet
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int updateByPrimaryKeySelective(EWallet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_wallet
     *
     * @mbggenerated Mon Jan 22 00:11:46 CST 2018
     */
    int updateByPrimaryKey(EWallet record);
}