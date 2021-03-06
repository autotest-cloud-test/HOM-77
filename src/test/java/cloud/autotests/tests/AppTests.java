package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Test on github noo war")
    void generatedTest() {
        step("i open page https://github.com", () -> {
            // todo
        });

        step("make tests", () -> {
            // todo
        });

        step("make more", () -> {
            // todo
        });

        step("sgrerwegw", () -> {
            // todo
        });
    }

    @Test
    @Description("Autogenerated, because your test steps contain text 'http...' and the page has <title>")
    @DisplayName("Page title test")
    void titleTest() {
        step("Open url 'https://github.com'", () ->
            open("https://github.com"));

        step("Checking that the page title has is 'GitHub: Where the world builds software · GitHub'", () -> {
            String expectedTitle = "GitHub: Where the world builds software · GitHub";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}