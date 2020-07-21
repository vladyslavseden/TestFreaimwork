package pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;


import static com.codeborne.selenide.Selenide.$;

@Component
public class MailPage {

    private By LOGINTEXTFIELD = By.xpath("//input[@id='identifierId']");
    private By NEXTBUTTON = By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']");
    private By PASSWORDTEXTFIELD = By.xpath("//input[@name='password']");

    public void enterLoginData (String login){ $(LOGINTEXTFIELD).val(login); }

    public void clickNextButton(){ $(NEXTBUTTON).click();}

    public void enterPasswordData(String password){ $(PASSWORDTEXTFIELD).val(password);}
}
