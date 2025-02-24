package com.huloop.pom.implementation;

import com.huloop.pom.utils.SolutionPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SolutionPageImpl extends MSBasePage implements SolutionPage {
    private static final Logger LOGGER = LogManager.getLogger(SolutionPageImpl.class);
    private final WebDriverWait wait;
    private final WebDriver driver;
    private final By solutionPage = By.xpath("//h2[normalize-space()='Intelligent Process Automation']");

    public SolutionPageImpl(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Ensure wait is initialized
    }

    @Override
    public boolean isOnSolutionPage() {
        LOGGER.info("Verifying if on Solution page...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(solutionPage));
            return true;
        } catch (Exception e) {
            LOGGER.error("Solution page didn't displayed: " + e.getMessage());
            return false;
        }
    }

}
