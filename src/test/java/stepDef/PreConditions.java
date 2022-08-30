package stepDef;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import static com.codeborne.selenide.Selenide.open;

public class PreConditions {

    @Before
    public void openMainPageUrl(){
        open("http://automationpractice.com");
    }
    @After
    public void closeBrowser(){
        Selenide.closeWindow();
    }
}
