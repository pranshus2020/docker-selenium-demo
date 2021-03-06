package com.rahullfo.demo.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rahullfo.demo.pages.HomePage;

public class SearchTest extends BaseTest {

    private HomePage hp;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        super.setUp();
        hp = new HomePage(driver);
    }

    @Test
    public void submitTest() {
        hp.goTo();
       Assert.assertTrue(driver.getTitle().contains("Cats"));
       Assert.assertTrue(driver.getTitle().contains("vs"));
       Assert.assertTrue(driver.getTitle().contains("Dogs"));
      // Assert.assertEquals("Vodka", driver.findElement(By.tagName("body")).getText());
       
    }
   
    }
