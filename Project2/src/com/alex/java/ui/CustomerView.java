package com.alex.java.ui;

import com.alex.java.bean.Customer;
import com.alex.java.service.CustomerList;
import com.alex.java.util.CMUtility;

public class CustomerView {

    private CustomerList customerList;
    private int listMax = 10;

    public CustomerView(){
        this.customerList = new CustomerList(listMax);
    }

    public void enterMainMenu(){

        boolean isFlag = true;

        while(isFlag){
            System.out.println("\n--------------客户信息管理软件----------------\n");
            System.out.println("\t\t1.添加客户");
            System.out.println("\t\t2.修改客户");
            System.out.println("\t\t3.删除客户");
            System.out.println("\t\t4.客户列表");
            System.out.println("\t\t5.退出\n");
            System.out.print("请选择（1~5)：");
            char menuselection =  CMUtility.readMenuSelection();
            switch(menuselection){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认退出吗？（Y/N)：");
                    char confirmChar = CMUtility.readConfirmSelection();
                    if(confirmChar == 'Y'){
                        isFlag = false;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private void addNewCustomer(){
        Customer newCustomer = new Customer();
        System.out.println("---------------添加客户--------------");
        System.out.print("姓名：");
        newCustomer.setName(CMUtility.readString(10));
        System.out.print("性别（M/F）：");
        newCustomer.setGender(CMUtility.readChar());
        System.out.print("年龄：");
        newCustomer.setAge(CMUtility.readInt());
        System.out.print("电话：");
        newCustomer.setPhone(CMUtility.readString(20));
        System.out.print("邮箱：");
        newCustomer.setEmail(CMUtility.readString(30));

        if(customerList.addCustomer(newCustomer)){
            System.out.println("---------------添加成功-------------");
        }
        else{
            System.out.println("---------添加失败，客户列表已满--------");
        }
    }

    private void modifyCustomer(){
        Customer cust;
        for(;;){
            System.out.println("---------------修改客户--------------");
            System.out.print("请选择待修改客户编号（-1退出）：");
            int num = CMUtility.readInt();
            if(num == -1){
                return;
            }
            else{
                cust = customerList.getCustomer(num-1);
                if(cust == null){
                    System.out.println("无法找到指定客户！");
                }
                else{
                    break;
                }
            }
        }
        //修改客户信息
        System.out.print("姓名（" + cust.getName() + "）：");
        cust.setName(CMUtility.readString(10, cust.getName()));
        System.out.print("性别（" + cust.getGender() + "）：");
        cust.setGender(CMUtility.readChar(cust.getGender()));
        System.out.print("年龄（" + cust.getAge() + "）：");
        cust.setAge(CMUtility.readInt(cust.getAge()));
        System.out.print("电话（" + cust.getPhone() + "）：");
        cust.setPhone(CMUtility.readString(20, cust.getPhone()));
        System.out.print("邮箱（" + cust.getEmail() + "）：");
        cust.setEmail(CMUtility.readString(30, cust.getEmail()));
        System.out.println("--------------修改客户成功-------------");
    }

    private void deleteCustomer(){
        for(;;){
            System.out.println("---------------删除客户--------------");
            System.out.print("请选择待修改客户编号（-1退出）：");
            int num = CMUtility.readInt();
            if(num == -1){
                return;
            }
            else{
                if(!customerList.deleteCustomer(num-1)){
                    System.out.println("无法找到指定客户！");
                }
                else{
                    System.out.println("--------------删除客户成功-------------");
                    return;
                }
            }
        }
    }

    private void listAllCustomers(){
        System.out.println("-----------------------客户列表-------------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t\t邮箱");
        if(customerList.getTotal() == 0){
            System.out.println("\n没有客户记录！");
        }
        else{
            for(int i = 0 ; i < customerList.getTotal(); ++i){
                Customer cust = customerList.getCustomer(i);
                System.out.print((i+1) + "\t");
                System.out.print(cust.getName() + "\t");
                System.out.print(cust.getGender() + "\t");
                System.out.print(cust.getAge() + "\t\t");
                System.out.print(cust.getPhone() + "\t\t");
                System.out.print(cust.getEmail() + "\n");
            }
        }
        System.out.println("---------------------客户列表完成------------------------");

    }

    public static void main(String[] args){
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
