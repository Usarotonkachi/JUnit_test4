package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(xpath = "//span[contains(text(), 'Next')]")
    private WebElement nextButton;

    @FindBy(id = "day")
    private WebElement dayField;

    @FindBy(id = "month")
    private WebElement monthDropdown;

    @FindBy(id = "year")
    private WebElement yearField;

    @FindBy(id = "gender")
    private WebElement genderDropdown;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(name = "Passwd")
    private WebElement passwordField;

    @FindBy(name = "ConfirmPasswd")
    private WebElement confirmPasswordField;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void clickNext() {
        nextButton.click();
    }

    public void enterBirthday(String day, String month, String year) {
        dayField.sendKeys(day);
        new Select(monthDropdown).selectByVisibleText(month);
        yearField.sendKeys(year);
    }

    public void selectGender(String gender) {
        new Select(genderDropdown).selectByVisibleText(gender);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void confirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }
}
