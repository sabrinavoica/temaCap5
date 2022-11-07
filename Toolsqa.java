import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Toolsqa {
    public static void main(String[] args) {
      //  TextBox ();
       // CheckBox ();
      //  RadioButton ();


    }

    public static void TextBox() {
        ChromeDriver driver = WebDriver.createChromeDriver ();
        driver.get ("https://demoqa.com/text-box");

        WebElement name = driver.findElement (By.cssSelector ("label#userName-label"));
        System.out.println (name.getText ());

        WebElement fullName = driver.findElement (By.cssSelector ("input#userName"));
        fullName.clear ();
        fullName.sendKeys ("Sabrina");
        fullName.clear ();
        fullName.sendKeys ("Anamaria");

        WebElement mail = driver.findElement (By.cssSelector ("label#userEmail-label"));
        System.out.println (mail.getText ());

        WebElement insertMail = driver.findElement (By.cssSelector ("input#userEmail"));
        insertMail.sendKeys ("voicasabrina@yahoo.com");


        WebElement address = driver.findElement (By.cssSelector ("label#currentAddress-label"));
        System.out.println (address.getText ());

        WebElement insertAddress = driver.findElement (By.cssSelector ("textarea#currentAddress"));
        insertAddress.sendKeys ("strada.Aviatiei, nr.6, Sector1");

        WebElement permanent = driver.findElement (By.cssSelector ("label#permanentAddress-label"));
        System.out.println (permanent.getText ());

        WebElement insertPermanent = driver.findElement (By.cssSelector ("textarea#permanentAddress"));
        insertPermanent.sendKeys ("--");

        WebElement button = driver.findElement (By.cssSelector ("button#submit"));
        button.click ();

        WebElement result = driver.findElement (By.cssSelector ("button#submit"));
        System.out.println (result.getText ());



        driver.quit ();
    }

    public static void CheckBox() {
        ChromeDriver driver = WebDriver.createChromeDriver ();
        driver.get ("https://demoqa.com/checkbox");

        WebElement folderHome = driver.findElement (By.cssSelector ("span.rct-text"));
        System.out.println (folderHome.getText ());

        WebElement selectFolderHome = driver.findElement (By.cssSelector ("svg.rct-icon.rct-icon-uncheck"));
        selectFolderHome.click ();

        WebElement openFolderHome = driver.findElement (By.cssSelector ("svg.rct-icon.rct-icon-expand-close"));
        openFolderHome.click ();

        WebElement openfolderDesktop = driver.findElement (By.linkText (""));
        openfolderDesktop.click ();



        driver.quit ();

    }

    public static void RadioButton() {
        ChromeDriver driver = WebDriver.createChromeDriver ();
        driver.get ("https://demoqa.com/radio-button");

        WebElement question = driver.findElement (By.cssSelector ("div.mb-3"));
        System.out.println (question.getText ());

        WebElement buttonYes = driver.findElement (By.cssSelector ("input#yesRadio"));
        buttonYes.click ();

        WebElement buttonImpressive = driver.findElement (By.cssSelector ("input#impressiveRadio"));
        buttonImpressive.click ();

        WebElement answer = driver.findElement (By.cssSelector ("p.mt-3"));
        System.out.println (answer.getText ());

        driver.quit ();




    }
}
