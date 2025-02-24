package com.huloop.pom.implementation;

import com.huloop.pom.utils.ProductPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPageImpl extends MSBasePage implements ProductPage {
    private static final Logger LOGGER = LogManager.getLogger(ProductPageImpl.class);
    private final WebDriverWait wait;
    private final WebDriver driver;
    private final By productPage = By.xpath("//h2[contains(text(),'HuLoop’s AI-Powered, Intelligent Automation Platfo')]");


    public ProductPageImpl(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Ensure wait is initialized
    }

    @Override
    public boolean isOnProductPage() {
        LOGGER.info("Verifying if on Product page...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(productPage));
            return true;
        } catch (Exception e) {
            LOGGER.error("Product page didn't displayed: " + e.getMessage());
            return false;
        }
    }
}
