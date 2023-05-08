package demo_com.tutorialsninja.pages;

import demo_com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllComponents')]")
    WebElement showAllComponents;

    public void mouseHoverOnComponentsAndClick(){
        clickOnElement(components);

    }
    public void clickOnShowAllComponents(){
        clickOnElement(showAllComponents);

    }






















}
