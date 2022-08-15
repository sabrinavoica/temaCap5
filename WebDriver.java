import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    public static ChromeDriver createChromeDriver() {
        System.setProperty ("webdriver.chrome.driver" ,".idea/chromedriver.exe");
        return new ChromeDriver ();
    }

}

