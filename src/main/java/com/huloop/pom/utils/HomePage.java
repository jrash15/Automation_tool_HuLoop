package com.huloop.pom.utils;

public interface HomePage {
    boolean isLogoDisplayed();
    boolean isOnHomePage();
    boolean isCompanyTabDisplayed();
    boolean isProductTabDisplayed();
    boolean isSolutionTabDisplayed();
    boolean isResourcesTabDisplayed();
    boolean isCareersTabDisplayed();
    boolean isPartnersTabDisplayed();
    boolean isContactUsTabDisplayed();
    boolean isRequestDemoButtonDisplayed();
    void selectCompanyTab();
    void selectProductTab();
    void selectSolutionTab();
    void selectResourcesTab();
    void selectCareersTab();
    void selectPartnersTab();
    void selectContactUsTab();
    void selectRequestDemoButton();
}
