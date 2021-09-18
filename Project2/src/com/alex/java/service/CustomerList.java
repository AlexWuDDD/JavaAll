package com.alex.java.service;

import com.alex.java.bean.Customer;

/**
 * @Description: CustomerList为Customer对象的管理模块
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历的方法
 * @author Alex
 * @date Sep 18, 2021 8:04 a.m.
 */

public class CustomerList {

    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
        total = 0;
    }

    public boolean addCustomer(Customer customer) {
        if(total < customers.length){
            customers[total] = customer;
            total++;
            return true;
        }
        return false;
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if(index >= 0 && index < total){
            customers[index] = cust;
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int index) {
        if(index < 0 || index >= total){
            return false;
        }

        for(int i = index; i < total-1; ++i){
            customers[i] = customers[i+1];
        }
        customers[total-1] = null;
        --total;
        return true;
    }

    public Customer[] getAllCustomers() {
        // return customers;
        Customer[] copy = new Customer[total];
        for(int i=0;i < total; ++i){
            copy[i] = customers[i];
        }
        return copy;
    }

    public Customer getCustomer(int index) {
        if(index >=0 && index < total){
            return customers[index];
        }
        return null;
    }

    public int getTotal() {
        return total;
    }
    
}
