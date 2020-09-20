package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    //below looks like method but it is called constructor
    // constructor is used to initialise object
    //we just making sure our driver goes from one page to another
    // for every page we write the below will be there

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // below we telling selenium we want to find an element by id
    // remember we went into zoopla, in search location field we right click, chose inspect element
    // and then copied the element id
    @FindBy(id = "search-input-location")
    private WebElement locationField;

    // we have 4 step process here
    // in order to interact with an element we need to locate/identify the element
    // copy it, declare it on your framework (above), then perform an with it
    // and to perform an action we need to write a method then use the method in (stepDefinition)
    // our action = When I enter "<Location>" into the search field. see below

    @FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large")
    private WebElement cookieButton;
    // if we run this test, it will fail because there is a space between className (primary & ui)
    // this means we cannot use it as class. to make it work we change className to css
    // if we inspect element and there is a space in between the element then we cannot use
    // this: className = "ui-button-primary ui-cookie-accept-all-medium-large" will turn to
    // @FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large"). this will
    // make test pass

    @FindBy(name = "price_min")
    private WebElement minPrice;
    @FindBy(name = "price_max")
    private WebElement maxPrice;
    @FindBy(name = "property_type")
    private WebElement property;
    @FindBy(name = "beds_min")
    private WebElement noOfBeds;
    @FindBy(css = ".button.button--primary")
    private WebElement searchButton;
    @FindBy(css = "[href='/for-sale/']")
    private WebElement forSaleTab;
    @FindBy(css = "[href='/for-sale/commercial/']")
    private WebElement commercialLink;





    public void enterLocation(String location)
    {
        locationField.sendKeys(location);
        locationField.click();

    // click in selenium = click()
    // Type/Enter (a value) = sendKeys()
    // select = selectByVisibleText, selectByIndex, selectByValue
    // verify = Assert

     //we can also tell selenium to wait for e.g. 5 seconds just so we can see every when
     // the web browsers pop up during our test see below:


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        // the above can be deleted, basically we just saying to selenium when you open
        // browser and perform test actions wait for 5 seconds - demonstration purpose
        // In the location field when we type in Manchester we get loads of options therefore
        // we can get rid of all those options by doing a click after typing manchester see below
        // for my notes = locationField.click(); now see this action above (after you finished typing
        // the location then click on that element

    }

    public void clickOnCookieButton()
    {
        cookieButton.click();
    }

    public void selectMinPrice(String miniPrice)
    {
        selectElementByText(minPrice, miniPrice);
    }

    public void selectMaxPrice(String maxiPrice)
    {
        selectElementByText(maxPrice, maxiPrice);
    }

    public void selectPropertyType(String prop)
    {
        selectElementByText(property, prop);
    }

    public void selectNoOfBeds(String beds)
    {
        selectElementByText(noOfBeds, beds);
    }

    public SearchResultPage clickOnSearchButton()
    {
        searchButton.click();
        return new SearchResultPage(driver);
        // above we saying when you click on this button, expect a new page back
    }

    public void hoverOverForSaleTab()
    {
        moveToElement(forSaleTab);
    }

    public CommercialSearchPage clickOnCommercialLink()
    {
        commercialLink.click();
        return new CommercialSearchPage(driver);
    }
}
