package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps extends BaseUtil{

    private BaseUtil base;

    public BaseSteps(BaseUtil base){
        this.base = base;
    }

    @Before
    public void initializeTests(){
        System.out.println("Opening the browser");
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        base.driver = new ChromeDriver();
    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            System.out.println("Test failed");
        }

        System.out.println("Closing the browser");
        base.driver.quit();
    }

}
