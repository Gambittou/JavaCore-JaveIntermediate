package com.qa.MyMavenG.carina.demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qa.MyMavenG.carina.demo.mobile.gui.pages.ios.PreferencesPage;

public class IOSPreferencesTest implements IAbstractTest, IMobileUtils {
    
    @Test
    public void nativePreferencesTest() {
        WebDriver driver = getDriver();
        PreferencesPage preferencesPage = new PreferencesPage(driver);
        preferencesPage.clickGeneralBtn();
        driver.navigate().back();
    }

}