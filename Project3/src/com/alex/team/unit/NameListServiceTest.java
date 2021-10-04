package com.alex.team.unit;

import static org.junit.Assert.assertEquals;

import com.alex.team.domain.Employee;
import com.alex.team.service.NameListService;
import com.alex.team.service.TeamException;

import org.junit.Test;

public class NameListServiceTest {
 
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        assertEquals(12, employees.length);
        for(int i = 0; i < employees.length; ++i){
            System.out.println(employees[i]) ;
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 1;
        try{
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        }
        catch(TeamException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("1");
        }

        id =100;
        try{
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        }
        catch(TeamException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("2");
        }
    }
     
}
