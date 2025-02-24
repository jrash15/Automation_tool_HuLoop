package com.huloop.automation;

import com.huloop.BrowserFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class MSBaseTest {
    protected WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(MSBaseTest.class);

    @BeforeTest
    protected void SetUpClass(ITestContext ctx) {
        String testName = ctx.getCurrentXmlTest().getName();
        LOGGER.info("*** Test: {} has Started!  ***", testName);
    }

    @Parameters({"browser"})
    @BeforeMethod
    public void beforeMethod(@Optional("chrome") String browser) {
        LOGGER.info("*** Before Method ***");
        driver = BrowserFactory.getDriver(browser);
        driver.get("https://www.huloop.ai/");
    }

    @AfterMethod
    public void afterMethod() {
        LOGGER.info("*** Quit from Browser! ***");
        driver.quit();
    }
}
