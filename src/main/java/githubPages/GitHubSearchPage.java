package githubPages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GitHubSearchPage {

    // Elements:
    private static final String FIRST_REPOSITORY_PATH = "//ul[@class='repo-list']/li/div[@class='mt-n1']/div/a";
    private static final String LANGUAGE_PATH_START;

    static {
        LANGUAGE_PATH_START = "//ul/li/a[text()[normalize-space(.)='";
    }

    private static final String LANGUAGE_PATH_END;

   static {
        LANGUAGE_PATH_END = "']]";
    }

    // Functions:
    public void clickFirstRepository() {
        $(byXpath(FIRST_REPOSITORY_PATH)).waitUntil(Condition.appear, 2000).click();
    }

    public void clickSelectedLanguage(String language) {
        $(byXpath(LANGUAGE_PATH_START + language + LANGUAGE_PATH_END))
                .waitUntil(Condition.appear, 2000).click();
    }
}