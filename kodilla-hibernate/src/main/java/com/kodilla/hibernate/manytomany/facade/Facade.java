package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    Database database;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Employee> findEmployeeByTextFragment(String text){
        LOGGER.info("Database init...");
        database.initData();

        LOGGER.info("Looking for data...");
        List<Employee> result = database.getEmployeeDao().searchByTextFragment("%" + text + "%");
        LOGGER.info("Cleaning up data...");
        database.cleanUpData();

        return result;
    }

    public List<Company> findCompanyByTextFragment(String text){
        LOGGER.info("Database init...");
        database.initData();

        LOGGER.info("Looking for data...");
        List<Company> result = database.getCompanyDao().retrieveByTextFragment("%" + text + "%");

        LOGGER.info("Cleaning up data...");
        database.cleanUpData();

        return result;
    }

}
