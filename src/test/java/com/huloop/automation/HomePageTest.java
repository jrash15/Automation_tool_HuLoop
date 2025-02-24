package com.huloop.automation;

import com.huloop.pom.implementation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class HomePageTest extends MSBaseTest {
    private static final Logger LOGGER = LogManager.getLogger(HomePageTest.class);
    private Object Groups;

    /***************************************************************************************
     * @author: Rashad Jafarzade
     * @testCase: TestCase-001
     * @Description: Main Navigation Tabs: Home Page
     ***************************************************************************************/
    @Test(dataProviderClass = DataProvider.class)
    public void verifyHomePageMainNavigationTabs() {
        //Step 1: Open Home page
        HomePageImpl homePageImp = new HomePageImpl(driver);
        // Select Logo
        homePageImp.selectLogo();
        // Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");
        // Verify if Logo is displayed
        Assert.assertTrue(homePageImp.isLogoDisplayed(), "Unable to verify Logo on Home page.");
        // Step 2: Verify Main Navigation Company Tab is displayed
        Assert.assertTrue(homePageImp.isCompanyTabDisplayed(), "Unable to verify Navigation Company Tab.");
        // Step 3: Verify Main Navigation Product Tab is displayed
        Assert.assertTrue(homePageImp.isProductTabDisplayed(), "Unable to verify Navigation Product Tab.");
        // Step 4: Verify Main Navigation Solution is displayed
        Assert.assertTrue(homePageImp.isSolutionTabDisplayed(), "Unable to verify Navigation Solution Tab.");
        // Step 5: Verify Main Navigation Resources is displayed
        Assert.assertTrue(homePageImp.isResourcesTabDisplayed(), "Unable to verify Navigation Resources Tab.");
        // Step 6: Verify Main Navigation Careers displayed
        Assert.assertTrue(homePageImp.isCareersTabDisplayed(), "Unable to verify Navigation Careers Tab.");
        // Step 7: Verify Main Navigation Partners displayed
        Assert.assertTrue(homePageImp.isPartnersTabDisplayed(), "Unable to verify Navigation Partners Tab.");
        // Step 8: Verify Main Navigation ContactUs displayed
        Assert.assertTrue(homePageImp.isContactUsTabDisplayed(), "Unable to verify Navigation ContactUs Tab.");
        // Step 9: Verify Main Navigation Request a Demo displayed
        Assert.assertTrue(homePageImp.isRequestDemoButtonDisplayed(), "Unable to verify Navigation Request a Demo Button.");
    }

    /***************************************************************************************
     * @author: Rashad Jafarzade
     * @testCase: TestCase-002
     * @Description: Main Navigation Tabs: Functionality of Main Navigation Tabs
     ***************************************************************************************/
    @Test(dataProviderClass = DataProvider.class)
    public void verifyHomePageMainNavigationTabsFunction() {
        HomePageImpl homePageImp = new HomePageImpl(driver);
        NavigationImpl navigationPageImpl = new NavigationImpl(driver);
        CompanyPageImpl companyPageImpl = new CompanyPageImpl(driver);
        ProductPageImpl productPageImpl = new ProductPageImpl(driver);
        SolutionPageImpl solutionPageImpl = new SolutionPageImpl(driver);
        ResourcesPageImpl  resourcesPageImpl = new ResourcesPageImpl(driver);
        CareersPageImpl careersPageImpl = new CareersPageImpl(driver);
        PartnersPageImpl partnersPageImpl = new PartnersPageImpl(driver);
        ContactUsPageImpl contactUsPageImpl = new ContactUsPageImpl(driver);
        RequestADemoPageImpl requestADemoPageImpl = new RequestADemoPageImpl(driver);

        //Step 1: Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");
        // Step 2: Select Main Navigation Company Tab.
        homePageImp.selectCompanyTab();
        //Verify Company page is displayed
        Assert.assertTrue(companyPageImpl.isOnCompanyPage(), "Unable to go to the Company page.");
        //Navigate Back
        navigationPageImpl.navigateBackToPreviousPage();
        //Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");

        //Step 3: Select Main Navigation Product Tab.
        homePageImp.selectProductTab();
        //Verify Product page is displayed
        Assert.assertTrue(productPageImpl.isOnProductPage(), "Unable to go to the Product page.");
        //Navigate Back
        navigationPageImpl.navigateBackToPreviousPage();
        //Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");

        // Step 4: Select Main Navigation Solution Tab.
        homePageImp.selectSolutionTab();
        // Verify Solution page is displayed
        Assert.assertTrue(solutionPageImpl.isOnSolutionPage(), "Unable to go to the Solution page.");
        //Navigate Back
        navigationPageImpl.navigateBackToPreviousPage();
        // Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");

        //Step 5: Select Main Navigation Resources Tab.
        homePageImp.selectResourcesTab();
        //Verify Resources page is displayed
        Assert.assertTrue(resourcesPageImpl.isOnResourcesPage(), "Unable to go to the Resources page.");
        //Navigate Back
        navigationPageImpl.navigateBackToPreviousPage();
        //Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");

        //Step 6: Select Main Navigation Careers Tab.
        homePageImp.selectCareersTab();
        //Verify Careers page is displayed
        Assert.assertTrue(careersPageImpl.isOnCareersPage(), "Unable to go to the Resources page.");
        //Navigate Back
        navigationPageImpl.navigateBackToPreviousPage();
        //Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");

        //Step 7: Select Main Navigation Partners Tab.
        homePageImp.selectPartnersTab();
        //Verify Partners page is displayed
        Assert.assertTrue(partnersPageImpl.isOnPartnersPage(), "Unable to go to the Partners page.");
        //Navigate Back
        navigationPageImpl.navigateBackToPreviousPage();
        //Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");

        // Step 8: Select Main Navigation ContactUs Tab.
        homePageImp.selectContactUsTab();
        // Verify ContactUs page is displayed
        Assert.assertTrue(contactUsPageImpl.isOnContactUsPage(), "Unable to go to the Contact Us page.");
        //Navigate Back
        navigationPageImpl.navigateBackToPreviousPage();
        // Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");

        //Step 9: Select Main Navigation Request a Demo Button.
        homePageImp.selectRequestDemoButton();
        //Verify Request a Demo page is displayed
        Assert.assertTrue(requestADemoPageImpl.isOnRequestADemoPage(), "Unable to go to the Request a Demo page.");
        //Navigate Back
        navigationPageImpl.navigateBackToPreviousPage();
        //Verify if on Home page is displayed
        Assert.assertTrue(homePageImp.isOnHomePage(), "Unable to go to the Home page.");
    }

}
