package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Database {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private List<Integer> employeeId = new ArrayList<>();
    private List<Integer> companyId = new ArrayList<>();

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

    public void cleanUpData(){
        for(Integer integer : companyId)
            companyDao.deleteById(integer);

        for(Integer integer : employeeId)
            employeeDao.deleteById(integer);

        companyId.clear();
        employeeId.clear();
    }

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }
}
