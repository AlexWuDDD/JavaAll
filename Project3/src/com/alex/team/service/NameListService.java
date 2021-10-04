package com.alex.team.service;

import com.alex.team.domain.Employee;
import com.alex.team.domain.Equipment;
import com.alex.team.domain.NoteBook;
import com.alex.team.domain.PC;
import com.alex.team.domain.Printer;
import com.alex.team.domain.Programmer;
import com.alex.team.domain.Designer;
import com.alex.team.domain.Architect;

public class NameListService {
    
    private Employee[] employees;

    public NameListService(){
        employees = new Employee[Data.EMPLOYEES.length];

        for(int i = 0;  i < employees.length; ++i){
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);

            //获取Employee的4个基本信息
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            int salary = Integer.parseInt(Data.EMPLOYEES[i][4]);

            switch(type){
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:{
                    Equipment equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                }
                case Data.DESIGNER:{
                    Equipment equipment = createEquipment(i);
                    double bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                }
                case Data.ARCHITECT:{
                    Equipment equipment = createEquipment(i);
                    double bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
                }
                default:
                    employees[i] = null;
                    break;
            }
        }   
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for(int i = 0; i < employees.length; ++i){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }

    private Equipment createEquipment(int id){
        int type = Integer.parseInt(Data.EQUIPMENTS[id][0]);
        switch(type){
            case Data.PC:
                return new PC(Data.EQUIPMENTS[id][1], Data.EQUIPMENTS[id][2]);
            case Data.NOTEBOOK:
                double price = Double.parseDouble(Data.EQUIPMENTS[id][2]);
                return new NoteBook(Data.EQUIPMENTS[id][1], price);
            case Data.PRINTER:
                return new Printer(Data.EQUIPMENTS[id][1], Data.EQUIPMENTS[id][2]);
            default:
                return null;
        }
    }
}
