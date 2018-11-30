package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='UserName']")
    private WebElement userName;

    @FindBy(css = "input[name='Password']")
    private WebElement passwordInput;

    @FindBy(css = "form[id='userName'] input[name='UserName']")
    private WebElement loginButton;

    public LoginPage setLogin(String login){
        waitForElementToBeClickable(userName);
        userName.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password){
        waitForElementToBeClickable(passwordInput);
        passwordInput.sendKeys(password);
        return this;
    }

    public void clickLoginButotn(){

        waitForElementToBeClickable(loginButton);
        loginButton.click();

    }

}
