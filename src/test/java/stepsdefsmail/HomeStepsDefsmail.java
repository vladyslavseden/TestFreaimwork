package stepsdefsmail;

import cucumber.api.java8.En;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import pages.HomePage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;


import cucumber.api.java8.En;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import pages.HomePage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

    @ContextConfiguration(locations = {"/spring.xml"})
    public class HomeStepsDefsmail implements En {

        @Autowired
        HomePage homePage;


        public HomeStepsDefsmail() {

            Given("^Home page is opened$", () -> {
//            baseUrl = "https://google.com";
                open(baseUrl, HomePage.class);
            });

            When("^Click on Google menu button", () -> {
                homePage.clickOnMailButton();
            });
        }
    }
