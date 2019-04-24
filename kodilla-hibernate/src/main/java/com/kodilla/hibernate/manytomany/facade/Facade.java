package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Facade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    private List<Integer> employeeId = new ArrayList<>();
    private List<Integer> companyId = new ArrayList<>();

    public List<Employee> findEmployeeByTextFragment(String text){
        LOGGER.info("Database init...");
        initData();

        LOGGER.info("Looking for data...");
        List<Employee> result = employeeDao.searchByTextFragment(text);
        LOGGER.info("Cleaning up data...");
        cleanUpData();

        return result;
    }

    public List<Company> findCompanyByTextFragment(String text){
        LOGGER.info("Database init...");
        initData();

        LOGGER.info("Looking for data...");
        List<Company> result = companyDao.retrieveByTextFragment(text);

        LOGGER.info("Cleaning up data...");
        cleanUpData();

        return result;
    }

    private void initData(){
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

    private void cleanUpData(){
        for(Integer integer : companyId)
            companyDao.deleteById(integer);

        for(Integer integer : employeeId)
            employeeDao.deleteById(integer);

        companyId.clear();
        employeeId.clear();
    }





}
