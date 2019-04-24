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

    public List<Employee> findEmployeeByTextFragment(String text){
        LOGGER.info("Looking for data...");
        List<Employee> result = employeeDao.searchByTextFragment(text);

        return result;
    }

    public List<Company> findCompanyByTextFragment(String text){
        LOGGER.info("Looking for data...");
        List<Company> result = companyDao.retrieveByTextFragment(text);

        return result;
    }







}
