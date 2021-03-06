package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.Facade;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private Facade facade;

    private List<Integer> employeeId = new ArrayList<>();
    private List<Integer> companyId = new ArrayList<>();

    @Before
    public void initData(){
        //Given
        Company softwareMachine = new Company("Data Software Machine");
        Company dataMaesters = new Company("Data Maesters");

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee edwardSmith = new Employee("Edward", "Smith");

        //When
        employeeDao.save(edwardSmith);
        employeeId.add(edwardSmith.getId());
        employeeDao.save(johnSmith);
        employeeId.add(johnSmith.getId());

        companyDao.save(softwareMachine);
        companyId.add(softwareMachine.getId());
        companyDao.save(dataMaesters);
        companyId.add(dataMaesters.getId());
    }

    @After
    public void cleanUpData(){
        for(Integer integer : companyId)
            companyDao.deleteById(integer);

        for(Integer integer : employeeId)
            employeeDao.deleteById(integer);

        companyId.clear();
        employeeId.clear();
    }

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
