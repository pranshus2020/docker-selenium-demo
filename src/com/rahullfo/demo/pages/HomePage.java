package com.rahullfo.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(name = "Type")
    private WebElement dropDown;

    @FindBy(xpath = "input[type=\"submit\" i]")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/center/h1")
    private WebElement body;

    public HomePage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 30);
    }

    public void goTo() {
        this.driver.get("http://ec2-34-227-109-125.compute-1.amazonaws.com:5000/");
        System.out.println("Browser launched and navigated to the Test WebSite");
    }

    public void submit() {
    	wait.until(ExpectedConditions.elementToBeClickable(this.submitButton));
        this.submitButton.click();      
        System.out.println("Search button clicked");
      // wait.until(ExpectedConditions.presenceOfElementLocated(By.className("rc")));
      //  System.out.println("Results appeared");
    }


}
