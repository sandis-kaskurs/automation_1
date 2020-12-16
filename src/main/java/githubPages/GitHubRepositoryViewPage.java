package githubPages;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GitHubRepositoryViewPage {

    // Elements:
    private static final String GITHUB_REPOSITORY_TITLE = "//strong[@itemprop='name']/a";

    // Functions:
    public void checkIfRepositoryOpened() {
        $(byXpath(GITHUB_REPOSITORY_TITLE)).waitUntil(Condition.appear, 2000).click();
    }
}
