package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterElements {
    private WebDriver driver = null;

    public RegisterElements(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement singUpText() {//metoda returneaza un web element ce nu are parametru de intrare
        //si acesta e un body si logica ce o face
        return driver.findElement(By.xpath("//h2"));
    }

    public WebElement firstName() {
        return driver.findElement(By.cssSelector("#firstName"));
    }

    public WebElement lasName() {
        return driver.findElement(By.cssSelector("#lastName"));
    }

    public WebElement phoneNumber() {
        return driver.findElement(By.cssSelector("#phoneNumber"));
    }

    public WebElement email() {
        return driver.findElement(By.cssSelector("#email"));
    }

    public WebElement password() {
        return driver.findElement(By.cssSelector("#password"));
    }

    public WebElement city() {
        return driver.findElement(By.cssSelector("#city"));
    }

    public WebElement customer() {
        return driver.findElement(By.cssSelector("#customer"));

    }

    public WebElement trainer() {
        return driver.findElement(By.cssSelector("#trainer"));
    }

    public WebElement submit() {
        return driver.findElement(By.cssSelector("#submit"));
    }
}
