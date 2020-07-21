package stepsdefsmail;

import cucumber.api.java.en.Then;
import cucumber.api.java8.En;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import pages.MailLogingPage;


@ContextConfiguration(locations = {"/spring.xml"})
public class MailStepdefs implements En {
    @Autowired
    MailLogingPage mailLogingPage;

    public MailStepdefs() {
        Given("^Passing login data to a login text filed and pressing Next button", (String login) -> {
            mailLogingPage.enterLoginData(login);
            mailLogingPage.clickNextButton();
        });

        Then("^Passing password data to a login text filed and pressing Next button",(String password) ->{
            mailLogingPage.enterPasswordData(password);
            mailLogingPage.clickNextButton();
        });

    }

}
