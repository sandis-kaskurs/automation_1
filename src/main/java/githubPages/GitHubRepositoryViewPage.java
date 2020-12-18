package githubPages;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GitHubRepositoryViewPage {

    private static final String GITHUB_REPOSITORY_TITLE = "//strong[@itemprop='name']/a";

    public void checkIfRepositoryOpened() {
        $(byXpath(GITHUB_REPOSITORY_TITLE)).waitUntil(Condition.appear, 2000).click();
    }
}
