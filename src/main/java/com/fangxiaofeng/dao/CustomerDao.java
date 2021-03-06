package com.fangxiaofeng.dao;

import com.fangxiaofeng.model.Customer;
import org.apache.ibatis.annotations.Param;

public interface CustomerDao {

    /**
     * 通过ID查找客户
     * @param customerID
     */
    Customer findCustomerByID(@Param("customerID") int customerID);

    /**
     * userName查找用户
     * @param userName
     * @return
     */
    Customer findCustomerByName(@Param("userName") String userName);

    /**
     * 插入新的customer
     * @param customer
     */
    void insertNewCustomer(Customer customer);

    /**
     * 更新customer
     * @param customer
     */
    void updateCustomer(Customer customer);
}
