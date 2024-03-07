package pages;

import driverConfiguracion.Inicio;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class InputPage {

    protected WebDriver driver;

    private By input = By.xpath("//*[@id=\"content\"]/div/div/div/input");

    public InputPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickInput() {
        driver.findElement(input).click();

    }

    public void clickUp() {
        driver.findElement(input).sendKeys(Keys.ARROW_UP);
    }

    public void multipleClickUp(int presinarVeces) {
        for (int i = 0; i < presinarVeces; i++) {
            clickUp();
        }
    }

    public void multipleClickDown(int presinarVeces) {
        for (int i = 0; i < presinarVeces; i++) {
            clickDown();
        }
    }

    public void clickDown() {
        driver.findElement(input).sendKeys(Keys.ARROW_DOWN);

    }

    public void clear() {
        driver.findElement(input).clear();

    }
    public void enterNegativeNumber(String number){
        driver.findElement(input).sendKeys(number);

    }

    public void tearDown() {
//
        driver.quit();
    }
}
