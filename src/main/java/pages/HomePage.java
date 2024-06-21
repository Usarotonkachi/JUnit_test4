package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    // Элементы на главной странице после входа
    @FindBy(xpath = "//*[contains(text(), 'Welcome')]")
    private WebElement welcomeMessage;

    // Другие элементы могут быть добавлены по необходимости
    // Например, ссылки на почту, иконки профиля и т.д.

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Метод для проверки наличия приветственного сообщения
    public boolean isWelcomeMessageDisplayed() {
        return welcomeMessage.isDisplayed();
    }

    // Примеры других методов для взаимодействия с главной страницей
    // public void clickProfileIcon() { ... }
    // public void navigateToGmail() { ... }
}
