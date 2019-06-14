package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select daySelect = new Select(day);
        daySelect.selectByIndex(22);

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthSelect = new Select(month);
        monthSelect.selectByIndex(5);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearSelect = new Select(year);
        yearSelect.selectByIndex(23);




    }
}
