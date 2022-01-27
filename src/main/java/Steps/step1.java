package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class step1 {


    @Given("the user has logged in")
    public void the_user_has_logged_in() {

    }
    @Given("the user selects GFMP")
    public void the_user_selects_gfmp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
    }
    @Given("the user selects Practice Maintenance")
    public void the_user_selects_practice_maintenance() {

    }
    @Given("the user selects territory NAM")
    public void the_user_selects_territory_nam() {

    }
    @When("the user clicks Add")
    public void the_user_clicks_add() {

    }
    @Then("the user verifies practice number is present")
    public void the_user_verifies_practice_number_is_present() {

    }


}
