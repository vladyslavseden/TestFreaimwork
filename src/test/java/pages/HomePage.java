package pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Component
public class HomePage {

    private By GLOBAL_SEARCH_FIELD = By.xpath("//input[@name='q']");
    private By GLOBAL_SEARCH_DROP_DOWN= By.xpath(" //ul[@class='erkvQe");
    private By GLOBAL_SEARCH_DROP_DOWN_VALUES = By.xpath("//body[@id='gsr']/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div/div[@class='A8SBwf emcav']/div[@class='UUbT9']/div[@class='aajZCb']/ul[@class='erkvQe']/li");
    private By GLOBAL_SEARCH_BUTTON = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");


    public void clickOnGlobalSearchButton() {
        $(GLOBAL_SEARCH_BUTTON).click();
    }

    public void enterIntoGlobalSearchField(String text) {
        $(GLOBAL_SEARCH_FIELD).val(text);
    }


    public void ensureThatGlobalSearchDropDownValuesStartsWith(String expectedText) {
        $$(GLOBAL_SEARCH_DROP_DOWN_VALUES).get(0).waitUntil(visible,5000);
        $$(GLOBAL_SEARCH_DROP_DOWN_VALUES).stream().forEach(element->{
                element.should(text(expectedText));
                System.out.println(element.getText());
        });

    }
}


