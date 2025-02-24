package com.huloop.pom.implementation;

import com.huloop.pom.utils.RequestADemoPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RequestADemoPageImpl extends MSBasePage implements RequestADemoPage {
    private static final Logger LOGGER = LogManager.getLogger(RequestADemoPageImpl.class);
    private final WebDriverWait wait;
    private final WebDriver driver;
    private final By requestADemoPage = By.xpath("//span[normalize-space()='Request Information About HuLoop']");

    public RequestADemoPageImpl(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Ensure wait is initialized
    }

    @Override
    public boolean isOnRequestADemoPage() {
        LOGGER.info("Verifying if on Company page...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(requestADemoPage));
            return true;
        } catch (Exception e) {
            LOGGER.error("Company page didn't displayed: " + e.getMessage());
            return false;
        }
    }
}
