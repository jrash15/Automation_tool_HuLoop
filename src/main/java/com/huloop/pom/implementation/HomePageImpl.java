package com.huloop.pom.implementation;

import com.huloop.pom.utils.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageImpl extends MSBasePage implements HomePage {
    private static final Logger LOGGER = LogManager.getLogger(HomePageImpl.class);
    private WebDriver driver;
    private WebDriverWait wait;
    private final By homePageLogo = By.id("site-logo"); //
    private final By homePage = By.xpath("//h3[contains(text(),'Human-in-the-Loop Intelligent Automation Is Radica')]");
    private final By companyTab = By.id("menu-item-606");
    private final By productTab = By.id("menu-item-165");
    private final By solutionTab = By.id("menu-item-166");
    private final By careersTab = By.id("menu-item-1238");
    private final By resourcesTab = By.id("menu-item-406");
    private final By partnersTab = By.id("menu-item-17002");
    private final By contactUsTab = By.id("menu-item-168");
    private final By requestADemoIcon = By.id("site-header-flex-aside-inner");


    public HomePageImpl(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Ensure wait is initialized
    }

    @Override
    public boolean isLogoDisplayed() {
        LOGGER.info("Verifying if Logo on home page is Displayed...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homePageLogo));
            return true;
        } catch (Exception e) {
            LOGGER.error("Logo didn't displayed: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isOnHomePage() {
        LOGGER.info("Verifying if on home page...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homePage));
            return true;
        } catch (Exception e) {
            LOGGER.error("Home page didn't displayed: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isCompanyTabDisplayed() {
        LOGGER.info("Verifying if Navigation Company Tab Displayed...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(companyTab));
            return true;
        } catch (Exception e) {
            LOGGER.error("Navigation Company Tab icon not found: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isProductTabDisplayed() {
        LOGGER.info("Verifying if Navigation Product Tab Displayed...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(productTab));
            return true;
        } catch (Exception e) {
            LOGGER.error("Navigation Product Tab icon not found: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isSolutionTabDisplayed() {
        LOGGER.info("Verifying if Navigation Solution Tab Displayed...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(solutionTab));
            return true;
        } catch (Exception e) {
            LOGGER.error("Navigation Solution Tab icon not found: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isResourcesTabDisplayed() {
        LOGGER.info("Verifying if Navigation Resources Tab Displayed...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(resourcesTab));
            return true;
        } catch (Exception e) {
            LOGGER.error("Navigation Resources Tab icon not found: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isCareersTabDisplayed() {
        LOGGER.info("Verifying if Navigation Careers Tab Displayed...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(careersTab));
            return true;
        } catch (Exception e) {
            LOGGER.error("Navigation Careers Tab icon not found: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isPartnersTabDisplayed() {
        LOGGER.info("Verifying if Navigation Partners Tab Displayed...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(partnersTab));
            return true;
        } catch (Exception e) {
            LOGGER.error("Navigation Partners Tab icon not found: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isContactUsTabDisplayed() {
        LOGGER.info("Verifying if Navigation Contact Tab Displayed...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(contactUsTab));
            return true;
        } catch (Exception e) {
            LOGGER.error("Navigation Contact Tab icon not found: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isRequestDemoButtonDisplayed() {
        LOGGER.info("Verifying if Request a Demo Button Displayed...");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(requestADemoIcon));
            return true;
        } catch (Exception e) {
            LOGGER.error("Request a Demo Button not found: " + e.getMessage());
            return false;
        }
    }

    @Override
    public void selectLogo() {
        LOGGER.info("Selecting Logo...");
        WebElement companyTab = driver.findElement(By.id("site-logo"));
        companyTab.click();
    }

    @Override
    public void selectCompanyTab() {
        LOGGER.info("Selecting Navigation Company Tab...");
        WebElement companyTab = driver.findElement(By.id("menu-item-606"));
        companyTab.click();
    }

    @Override
    public void selectProductTab() {
        LOGGER.info("Selecting Navigation Product Tab...");
        WebElement companyTab = driver.findElement(By.id("menu-item-165"));
        companyTab.click();
    }

    @Override
    public void selectSolutionTab() {
        LOGGER.info("Selecting Navigation Solution Tab...");
        WebElement companyTab = driver.findElement(By.id("menu-item-166"));
        companyTab.click();
    }

    @Override
    public void selectResourcesTab() {
        LOGGER.info("Selecting Navigation Resources Tab...");
        WebElement companyTab = driver.findElement(By.id("menu-item-1238"));
        companyTab.click();
    }
    @Override
    public void selectCareersTab() {
        LOGGER.info("Selecting Navigation Careers Tab...");
        WebElement companyTab = driver.findElement(By.id("menu-item-406"));
        companyTab.click();
    }
    @Override
    public void selectPartnersTab() {
        LOGGER.info("Selecting Navigation Partners Tab...");
        WebElement companyTab = driver.findElement(By.id("menu-item-17002"));
        companyTab.click();
    }
    @Override
    public void selectContactUsTab() {
        LOGGER.info("Selecting Navigation Contact Us Tab...");
        WebElement companyTab = driver.findElement(By.id("menu-item-168"));
        companyTab.click();
    }
    @Override
    public void selectRequestDemoButton() {
        LOGGER.info("Selecting Request Demo Button...");
        WebElement companyTab = driver.findElement(By.id("site-header-flex-aside-inner"));
        companyTab.click();
    }
}