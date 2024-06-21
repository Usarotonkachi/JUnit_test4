package stepdefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignUpPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSignUpSteps {
    WebDriver driver;
    SignUpPage signUpPage;
    HomePage homePage;

    @Given("I open the Google Sign Up page")
    public void i_open_the_google_sign_up_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/SignUp");
        signUpPage = new SignUpPage(driver);
    }

    @When("I enter first name as {string}")
    public void i_enter_first_name_as(String firstName) {
        signUpPage.enterFirstName(firstName);
    }

    @When("I enter last name as {string}")
    public void i_enter_last_name_as(String lastName) {
        signUpPage.enterLastName(lastName);
    }

    @When("I click Next on the name page")
    public void i_click_next_on_the_name_page() {
        signUpPage.clickNext();
    }

    @When("I enter birthday as {string}, {string}, {string}")
    public void i_enter_birthday_as(String day, String month, String year) {
        signUpPage.enterBirthday(day, month, year);
    }

    @When("I select gender as {string}")
    public void i_select_gender_as(String gender) {
        signUpPage.selectGender(gender);
    }

    @When("I enter username as {string}")
    public void i_enter_username_as(String username) {
        signUpPage.enterUsername(username);
    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String password) {
        signUpPage.enterPassword(password);
    }

    @When("I confirm password as {string}")
    public void i_confirm_password_as(String confirmPassword) {
        signUpPage.confirmPassword(confirmPassword);
    }

    @When("I click Next on the password page")
    public void i_click_next_on_the_password_page() {
        signUpPage.clickNext();
    }

    @Then("I should be redirected to the Google Home page")
    public void i_should_be_redirected_to_the_google_home_page() {
        homePage = new HomePage(driver);
        assertTrue(homePage.isWelcomeMessageDisplayed());
        driver.quit();
    }
}
