package com.Recall;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    WebDriver driver;
    @Before
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saif\\Downloads\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://my5.tv");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.manage().deleteAllCookies();
    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }

    @Given("^User is in homepage$")
    public void user_is_in_homepage(){

        driver.get("https://my5.tv");
        waitForSomeTime();
}

    @When("^User click the login link$")
    public void user_click_the_login_link() {
        driver.findElement(By.xpath("//div[contains(text(),'SIGN IN')]")).click();
    }

    @When("^enter username and password$")
    public void enter_username_and_password() {
        driver.findElement(By.xpath("dfdfdfdf")).sendKeys("funmi@gmail.com");

    }

    @When("^click the login button$")
    public void click_the_login_button() {

    }

    @Then("^User enter home screen$")
    public void user_enter_home_screen() {

    }

    public void waitForSomeTime()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
