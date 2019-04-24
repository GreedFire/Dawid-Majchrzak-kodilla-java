package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.Facade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Test
    public void testFindCompanyByTextFragment(){

        List<Company> temporaryList = facade.findCompanyByTextFragment("Data");

        Assert.assertEquals(2, temporaryList.size());

    }

    @Test
    public void testFindEmployeeByTextFragment(){
        List<Employee> temporaryList = facade.findEmployeeByTextFragment("Smith");

        Assert.assertEquals(2, temporaryList.size());
    }
}
