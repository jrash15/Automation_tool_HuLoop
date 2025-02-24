package com.huloop.pom.implementation;

import com.huloop.pom.utils.ContactUsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsPageImpl extends MSBasePage implements ContactUsPage {
    private static final Logger LOGGER = LogManager.getLogger(ContactUsPageImpl.class);
    private final WebDriverWait wait;
    private final WebDriver driver;
    private final By contactUsPage = By.xpath("//h1[@class='page-header-title wpex-block wpex-m-0 wpex-text-7xl wpex-text-white']//span[contains(text(),'Contact Us')]");

    public ContactUsPageImpl(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Ensure wait is initialized
    }

    @Override
    public boolean isOnContactUsPage() {
        LOGGER.info("Verifying if on Company page...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(contactUsPage));
            return true;
        } catch (Exception e) {
            LOGGER.error("Company page didn't displayed: " + e.getMessage());
            return false;
        }
    }
}
