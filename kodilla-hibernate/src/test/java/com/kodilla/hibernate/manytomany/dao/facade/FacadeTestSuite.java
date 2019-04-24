package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.facade.Facade;
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

        System.out.println(temporaryList.size());
        //System.out.println(temporaryList.get(0).getName());




    }
}
