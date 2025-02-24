package com.huloop.pom.implementation;

import com.huloop.pom.utils.CompanyPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompanyPageImpl extends MSBasePage implements CompanyPage {
    private static final Logger LOGGER = LogManager.getLogger(CompanyPageImpl.class);
    private final WebDriverWait wait;
    private final WebDriver driver;
    private final By companyPage = By.xpath("//h2[normalize-space()='Who We Are']");

    public CompanyPageImpl(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Ensure wait is initialized
    }

    @Override
    public boolean isOnCompanyPage() {
        LOGGER.info("Verifying if on Company page...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(companyPage));
            return true;
        } catch (Exception e) {
            LOGGER.error("Company page didn't displayed: " + e.getMessage());
            return false;
        }
    }
}
