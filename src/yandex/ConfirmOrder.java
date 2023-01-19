package yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmOrder {
    public ConfirmOrder(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;


    private By yesButton = By.xpath(".//*[text()='Да']");

    public void clickYesButton(){
        webDriver.findElement(yesButton).click();
    }
}
