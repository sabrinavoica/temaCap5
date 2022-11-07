import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Cap5 {
    public static void main(String[] args) {
      //  PrimulLink ();
      //  alDoileaLink ();
      //  alTreileaLink ();
      //  alPatruleaLink ();
        ChromeDriver driver = WebDriver.createChromeDriver ();
        driver.get("https://demoqa.com/alerts");

        //   WebElement firstButton = driver.findElement (By.id ("alertButton"));
        //   firstButton.click ();
        WebElement thirdButton = driver.findElement (By.cssSelector ("#confirmButton"));
//        thirdButton.click ();
        WebElement fourButton = driver.findElement (By.cssSelector ("#promtButton"));
        fourButton.click ();

        Alert alert = driver.switchTo ().alert ();
        alert.sendKeys ("Sabrina");
        alert.accept ();
        //  fourButton.click ();
        //   alert.sendKeys ("Text123456");
        //   alert.dismiss ();
        //   alert.accept();
        //  alert.dismiss ();

        driver.close ();


    }

    public static void PrimulLink () {
        ChromeDriver driver = WebDriver.createChromeDriver ();
        driver.get ("https://testpages.herokuapp.com/styled/basic-web-page-test.html");

        WebElement explanation = driver.findElement (By.cssSelector ("div.explanation"));
        System.out.println (explanation.getText ());

        WebElement para1 = driver.findElement (By.cssSelector ("p#para1.main"));
        System.out.println (para1.getText ());

        WebElement para2 = driver.findElement (By.cssSelector ("p#para2.sub"));
        System.out.println (para2.getText ());




        driver.quit ();



    }

    public static void alDoileaLink() {
        ChromeDriver driver = WebDriver.createChromeDriver ();
        driver.get ("https://testpages.herokuapp.com/styled/attributes-test.html");

        WebElement custom = driver.findElement (By.cssSelector ("h2"));
        System.out.println (custom.getText ());

        WebElement inline = driver.findElement (By.cssSelector ("p.inline-explanation"));
        System.out.println (inline.getText ());

        WebElement paara1 = driver.findElement (By.cssSelector ("p#domattributes"));
        System.out.println (paara1.getText ());

        WebElement inline2 = driver.findElement (By.cssSelector ("inline-explanation"));
        System.out.println(inline2.getText());

        WebElement jsattributes = driver.findElement (By.id ("p#jsattributes"));
        System.out.println(jsattributes.getText());

        WebElement button = driver.findElement (By.cssSelector ("button.styled-click-button"));
        button.click ();

        driver.quit ();

    }

    public static void alTreileaLink() {
        ChromeDriver driver = WebDriver.createChromeDriver ();
        driver.get ("https://testpages.herokuapp.com/styled/find-by-playground-test.html#pName8");

        WebElement title = driver.findElement (By.cssSelector ("h1"));
        System.out.println (title.getText ());

        WebElement explanation = driver.findElement (By.cssSelector ("div.explanation"));
        System.out.println (explanation.getText ());

        WebElement paragraph = driver.findElement (By.id ("p#p1"));
        System.out.println (paragraph.getText ());

        WebElement paragraph2 = driver.findElement (By.id ("p#p25"));
        System.out.println (paragraph2.getText ());

        WebElement nested = driver.findElement (By.id ("p#p26"));
        System.out.println (nested.getText ());

        WebElement nested2 = driver.findElement (By.id ("p#p41"));
        System.out.println (nested2.getText ());

        WebElement jump0 = driver.findElement (By.id ("a#a26"));
        System.out.println (jump0.getText ());
        jump0.click ();

        WebElement jump24 = driver.findElement (By.id ("a#a50"));
        System.out.println (jump24.getText ());
        jump24.click ();

        driver.quit ();

    }


    public static void alPatruleaLink() {
        ChromeDriver driver = WebDriver.createChromeDriver ();
        driver.get ("https://testpages.herokuapp.com/styled/tag/table.html");

        WebElement title = driver.findElement (By.cssSelector ("h1"));
        System.out.println (title.getText ());

        WebElement titleTable = driver.findElement (By.cssSelector ("caption"));
        System.out.println (titleTable.getText ());


     /*   List<WebElement> tableRows = driver.findElements (By.cssSelector ("#tablehere table tr"));
        for (int i = 0; i< tableRows.size (); i++){
            WebElement currentRow = tableRows.get (1);
            if(i == 0){
                List<WebElement> firstRowColumns = currentRow.findElements (By.cssSelector ("th"));
                System.out.println ("Header din prima coloana:" + firstRowColumns.get (0).getText ());
                System.out.println ("Header din a doua coloana:" + firstRowColumns.get (1).getText ());
                System.out.println ("");

            }else {
                List<WebElement> currentColumn = currentRow.findElements (By.cssSelector ("td"));
                System.out.println ("Text din randul " + (i + 1) + ", coloana 1:" + currentColumn.get (0).getText ());
                System.out.println ("Text din randul " + (i + 1) + ", coloana 2:" + currentColumn.get (1).getText ());
            }
        }*/

        List<WebElement> tableRows = driver.findElements (By.cssSelector ("#tablehere table tr"));
        WebElement firstRow = tableRows.get (0);
        List<WebElement> firstRowColumns = firstRow.findElements (By.cssSelector ("th"));
        System.out.println ("Header din prima coloana:" + firstRowColumns.get (0).getText ());
        System.out.println ("Header din a doua coloana:" + firstRowColumns.get (1).getText ());
        System.out.println ("");


        WebElement secondRow = tableRows.get (1);
        List<WebElement> secondRowColumns = secondRow.findElements (By.cssSelector ("td"));
        System.out.println ("Text din randul 2, coloana 1:" + secondRowColumns.get (0).getText ());
        System.out.println ("Text din randul 2, coloana 2:" + secondRowColumns.get (1).getText ());

        WebElement thirdRow = tableRows.get (2);
        List<WebElement> thirdRowColumns = thirdRow.findElements (By.cssSelector ("td"));
        System.out.println ("Text din randul 3, coloana 1:" + thirdRowColumns.get (0).getText ());
        System.out.println ("Text din randul 3, coloana 2:" + thirdRowColumns.get (1).getText ());

        WebElement fourRow = tableRows.get (3);
        List<WebElement> fourRowColumns = fourRow.findElements (By.cssSelector ("td"));
        System.out.println ("Text din randul 4, coloana 1:" + fourRowColumns.get (0).getText ());
        System.out.println ("Text din randul 4, coloana 2:" + fourRowColumns.get (1).getText ());

        WebElement fiveRow = tableRows.get (4);
        List<WebElement> fiveRowColumns = fiveRow.findElements (By.cssSelector ("td"));
        System.out.println ("Text din randul 5, coloana 1:" + fiveRowColumns.get (0).getText ());
        System.out.println ("Text din randul 5, coloana 2:" + fiveRowColumns.get (1).getText ());


        driver.quit ();




    }

}
