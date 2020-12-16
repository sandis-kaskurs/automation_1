package githubPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GitHubHomePage {

    // Elements:
    private static final SelenideElement GITHUB_SEARCH_BAR = $(byName("q"));

    // Functions:
    public void inputTextInSearchBar(String text) {
        GITHUB_SEARCH_BAR.setValue(text);
    }

    public void clickSearchButton() {
        GITHUB_SEARCH_BAR.contextClick().pressEnter();
    }
}