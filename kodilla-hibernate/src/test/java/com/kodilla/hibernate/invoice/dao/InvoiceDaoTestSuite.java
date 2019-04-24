package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product = new Product("Water");
        Product product2 = new Product("Vodka");
        Item item = new Item(new BigDecimal(2), 50, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(10), 5, new BigDecimal(50));
        item.setProduct(product);
        item2.setProduct(product2);

        Invoice invoice = new Invoice("12345");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        product.getItems().add(item);
        product2.getItems().add(item2);

        //When

        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        invoiceDao.deleteById(id);
    }
}
