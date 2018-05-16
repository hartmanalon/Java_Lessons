import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.DriverPropertyInfo;
import java.util.Scanner;

public class SeleniumDemo {

    public static void main(String[] args) {
        WebDriver driver = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a browser from the list by it's number: \n" +
                "1: Chrome\n" +
                "2: FireFox (32bit)\n" +
                "3: FireFox (64bit)\n" +
                "4: IE (32bit)\n" +
                "5: IE (64bit)\n" +
//                "6: Edge\n" +
                "7: HtmlUnit");
        int browserType = scanner.nextInt();

        switch (browserType) {
            case 1:
                System.setProperty("webdriver.chrome.driver", DriversPaths.Chrome.getPath());
                driver = new ChromeDriver();
                break;
            case 2:
                System.setProperty("webdriver.geko.driver", DriversPaths.FireFox32.getPath());
                driver = new FirefoxDriver();
                break;
            case 3:
                System.setProperty("webdriver.geko.driver", DriversPaths.FireFox64.getPath());
                driver = new FirefoxDriver();
                break;
            case 4:
                System.setProperty("webdriver.ie.driver", DriversPaths.IE32.getPath());
                driver = new InternetExplorerDriver();
                break;
            case 5:
                System.setProperty("webdriver.ie.driver", DriversPaths.IE64.getPath());
                driver = new InternetExplorerDriver();
                break;
//            case 6:
//                driver = new EdgeDriver();
//                break;
            case 7:
                driver = new HtmlUnitDriver(true);
                break;
        }


        driver.get("http://www.google.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
