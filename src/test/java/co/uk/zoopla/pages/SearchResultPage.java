package co.uk.zoopla.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage
{
    // same code we wrote in HomePage class also written here
    // meaning for every page we write this code must be present

    public SearchResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    private WebElement pageTitle;
    // above java go into the page there's a tag called h1 and you only going to find 1 of them
    @FindBy(css = ".listing-results-price.text-price")
    private List<WebElement> results;
    //here we telling java go into the page and find me a class that has this name and you will
    //find a lot of them

    public void isPageTitleDisplayed()
    {
        Assert.assertTrue(pageTitle.isDisplayed());
    }

    public void isResultsDisplayed()
    {
        Assert.assertTrue(results.size() > 0);
    }
}
