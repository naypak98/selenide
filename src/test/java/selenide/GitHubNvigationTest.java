package selenide;

//import com.codeborne.selenide.Configuration;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GitHubNvigationTest {

//    @BeforeAll
//    static void beforeAll () {
//        Configuration.holdBrowserOpen = true;
//    }
    @Test
    void navigateToSolutions () {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $("ul [aria-labelledby=solutions-by-company-size-heading]").$$("li").findBy(text("Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }
}
