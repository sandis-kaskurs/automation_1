package githubPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GitHubHomePage {

    // Elements:
    private static final SelenideElement GITHUB_SEARCH_BAR = $(byName("q"));
    private static final String GITHUB_COLLECTIONS_BUTTON = "//a[starts-with(@href, '/collections')]";

    // Functions:
    public void inputTextInSearchBar(String text) {
        GITHUB_SEARCH_BAR.setValue(text);
    }

    public void clickSearchButton() {
        GITHUB_SEARCH_BAR.contextClick().pressEnter();
    }




    public void checkDropdown(String language)
    {
        final SelenideElement ExploreButton = $(byXpath("//summary[contains(normalize-space(text()),\"Explore\")]"));
        ExploreButton.hover();

        final ElementsCollection ExploreButtonCollection = $$(byXpath("//details[contains(@class,'HeaderMenu-details')][descendant::summary[normalize-space(text())=\"Explore\"]]//a"));

        String[] ExpectedCollectionButtons = new String[10];
        ExpectedCollectionButtons[0] = "Explore";
        ExpectedCollectionButtons[1] = "Topics";
        ExpectedCollectionButtons[2] = "Collections";
        ExpectedCollectionButtons[3] = "Trending";
        ExpectedCollectionButtons[4] = "Learning Lab";
        ExpectedCollectionButtons[5] = "Open source guides";
        ExpectedCollectionButtons[6] = "Events";
        ExpectedCollectionButtons[7] = "Community forum";
        ExpectedCollectionButtons[8] = "GitHub Education";
        ExpectedCollectionButtons[9] = "GitHub Stars Program";

        for (int index = 0; index < ExploreButtonCollection.size(); index++)
        {
            SelenideElement CurrentExploreCollectionButton = ExploreButtonCollection.get(index);
            CurrentExploreCollectionButton.hover();
        }
    }
}