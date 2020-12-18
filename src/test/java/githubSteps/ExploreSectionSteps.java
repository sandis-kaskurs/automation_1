package githubSteps;

import githubPages.GitHubRepositoryViewPage;
import io.cucumber.java8.En;
import githubPages.GitHubHomePage;
import githubPages.GitHubSearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class ExploreSectionSteps implements En {

    public ExploreSectionSteps() {

        // Step 1:
        Given("User opens github page", () -> {
            open("https://github.com/");
        });

        // Step 2:
        Given("User hovers over Explore", () -> {
            new GitHubHomePage().checkDropdown("");
        });

        // Step 3:
        Given("User sees all button", () -> {
            open("https://github.com/");
        });


    }
}