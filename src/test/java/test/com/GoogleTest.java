



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Lenovo
 */
public class GoogleTest {

    private static WebDriver driver;
    private String baseUrl = "https://www.google.com";

    /**
     *
     * @author itexps
     * @throws java.lang.Throwable
     */
    @Given("^user is already on Home Page$")
    public void user_is_already_on_Home_Page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "c:\\data1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }
@When("^title of Home Page is google$")
public void title_of_home_page_is_google() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}
    @Then("^user enters data search$")

    public void user_enters_data_search() throws Throwable {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("basketball");

        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^user click on Google Search$")

    public void user_click_on_Google_Search() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
    }
    // Write code here that turns the phrase above into concrete actions
    // throw new PendingException();}

    @Then("^user is on SearchRsults Page$")
public void user_is_on_SearchRsults_Page() throws Throwable {

        Assert.assertEquals("basketball - Google Search", driver.getTitle());
        // Write code here that turns the phrase above into concrete actions
        //  throw new PendingException();
    }

    @Then("^user close the browser$")
    public void user_close_the_browser() throws Throwable {
        driver.close();
        // Write code here that turns the phrase above into concrete actions
        //  throw new PendingException();
    }

}
