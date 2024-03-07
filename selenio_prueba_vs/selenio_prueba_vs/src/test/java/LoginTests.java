import driverConfiguracion.Inicio;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import org.openqa.selenium.Dimension;

import static org.testng.Assert.assertTrue;

public class LoginTests extends Inicio {

//HomePage homePage;
    //Datos correctos para loggin
    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }


    //    usuario incorrecto
    @Test
    public void wrongUser() throws InterruptedException {
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("otroUsuario");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        assertTrue(secureAreaPage.getAlertText()
                        .contains("Your username is invalid!"),
                "Alert text is incorrect");
    }

    @Test
    public void wrongPassword() throws InterruptedException {

        LoginPage login = homepage.clickFormAuthentication();
        login.setUsername("tomsmith");
        login.setPassword("exampleOtherpass!"); // password incorrect
        SecureAreaPage secureAreaPage = login.clickLoginButton();

        assertTrue(secureAreaPage.getAlertText()
                        .contains("Your password is invalid!"),
                "Alert text is incorrect");
    }




}
