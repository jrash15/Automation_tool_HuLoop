package com.huloop.pom.implementation;

import com.huloop.pom.utils.ResourcesPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResourcesPageImpl extends MSBasePage implements ResourcesPage {
    private static final Logger LOGGER = LogManager.getLogger(ResourcesPageImpl.class);
    private final WebDriverWait wait;
    private final WebDriver driver;
    private final By resourcesPage = By.xpath("//h1[@class='page-header-title wpex-block wpex-m-0 wpex-text-7xl wpex-text-white']");

    public ResourcesPageImpl(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Ensure wait is initialized
    }

    @Override
    public boolean isOnResourcesPage() {
        LOGGER.info("Verifying if on Resources page...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(resourcesPage));
            return true;
        } catch (Exception e) {
            LOGGER.error("Resources page didn't displayed: " + e.getMessage());
            return false;
        }
    }
}
