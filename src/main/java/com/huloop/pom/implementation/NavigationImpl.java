package com.huloop.pom.implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigationImpl {
    private static final Logger LOGGER = LogManager.getLogger(NavigationImpl.class);
    private WebDriver driver;

    public NavigationImpl(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {
        // Step 1: Open the browser
        // Step 2: Navigate to the URL
    }

    public void navigateToProductPage() {
        // Step 1: Open the browser
        // Step 2: Navigate to the URL
    }

    public void navigateToSolutionPage() {
        // Step 1: Open the browser
        // Step 2: Navigate to the URL
    }

    public void navigateToResourcesPage() {
        // Step 1: Open the browser
        // Step 2: Navigate to the URL
    }

    public void navigateToCareersPage() {
        // Step 1: Open the browser
        // Step 2: Navigate to the URL
    }

    public void navigateToPartnersPage() {
        // Step 1: Open the browser
        // Step 2: Navigate to the URL
    }

    public void navigateToContactUsPage() {
        // Step 1: Open the browser
        // Step 2: Navigate to the URL
    }

    public void navigateToRequestDemoPage() {
        // Step 1: Open the browser
        // Step 2: Navigate to the URL
    }


    public void navigateBackToPreviousPage() {
        LOGGER.info("Navigating Back to previous page...");
        driver.navigate().back();
    }

}
