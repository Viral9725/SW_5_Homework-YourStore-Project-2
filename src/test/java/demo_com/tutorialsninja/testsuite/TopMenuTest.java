package demo_com.tutorialsninja.testsuite;

import demo_com.tutorialsninja.basetest.BaseTest;
import demo_com.tutorialsninja.customlisteners.CustomListeners;
import demo_com.tutorialsninja.pages.ComponentsPage;
import demo_com.tutorialsninja.pages.DesktopsPage;
import demo_com.tutorialsninja.pages.HomePage;
import demo_com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
    HomePage homePage;
    DesktopsPage deskTops;
    LaptopsAndNoteBooksPage laptopsAndNoteBooks;
    ComponentsPage componentsPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        deskTops = new DesktopsPage();
        laptopsAndNoteBooks = new LaptopsAndNoteBooksPage();
        componentsPage = new ComponentsPage();
    }

    @Test (groups = {"Sanity" , "Smoke", "Regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        deskTops.mouseHoverOnDesktopsAndClick();
        homePage.selectMenuBar("Show AllDesktops");
        // homePage.clickOnShowAllDeskTops();
        laptopsAndNoteBooks.mouseHoverOnLaptopsAndNoteBooksAndClick();
        laptopsAndNoteBooks.clickOnShowAllLaptopsAndNotebooks();
        componentsPage.mouseHoverOnComponentsAndClick();
        componentsPage.clickOnShowAllComponents();


    }


}