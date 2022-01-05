package steps;


import POM.SearchPage;
import api.ApiCall;
import config.ReadProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AmazonSteps extends AmazonBase {

    private WebDriver driver = Hooks.getDriver();

    float priceProduct;

    @Given("^Go to https://www\\.amazon\\.com/$")
    public void go_to_https_www_amazon_com() throws Throwable {
        driver.get(ReadProperties.getProperty("amazon.url"));
        driver.manage().window().maximize();
    }

    @Then("^Validate all menu items are present \\(the ones in black with black backgorund\\)$")
    public void validate_all_menu_items_are_present_the_ones_in_black_with_black_backgorund() throws Throwable {
        Assert.assertTrue(homePage.topMenuIsDisplayed());
    }
    @Then("^Go to All$")
    public void go_to_All() throws Throwable {
        homePage.clickOnLeftMenu();
    }

    @Then("^Go to Best sellers$")
    public void go_to_Best_sellers() throws Throwable {
        homePage.clickOnelectronicMenuButton();
        homePage.clickOncomputerAccessories();
    }

    @When("^Print all Elements in the left menu$")
    public void print_all_Elements_in_the_left_menu() throws Throwable {
        searchPage.printElementsLeftMenu();
    }

    @When("^Go to the search box$")
    public void go_to_the_search_box() throws Throwable {
        homePage.clickSearchButton();
    }

    @When("^Search for notebook (\\d+)$")
    public void search_for_notebook(int arg1) throws Throwable {
        homePage.typeSearch();
    }

    @When("^Print the price for the (\\d+) first elements listed$")
    public void print_the_price_for_the_first_elements_listed(int arg1) throws Throwable {
        searchPage.printPriceFirstElement();
    }

    @When("^Store the price of the first one$")
    public void store_the_price_of_the_first_one() throws Throwable {
        priceProduct = searchPage.getPrice();
    }

    @When("^Click on the first one to go to the details page$")
    public void click_on_the_first_one_to_go_to_the_details_page() throws Throwable {
        searchPage.selectFirstProduct();
    }

    @Then("^Once in the details page, validate both prices are the same$")
    public void once_in_the_details_page_validate_both_prices_are_the_same() throws Throwable {
        Assert.assertEquals(priceProduct,searchPage.getPrice());
    }

    @Then("^Click Add To Cart$")
    public void click_Add_To_Cart() throws Throwable {
        productPage.addToCart();
    }

    @Then("^Verify all (\\d+) price amounts are the same$")
    public void verify_all_price_amounts_are_the_same(int arg1) throws Throwable {

    }

    @Then("^Go to the cart$")
    public void go_to_the_cart() throws Throwable {
    productPage.goToCart();
    }

    @Then("^On the number of items dropdown select (\\d+) and validate the Total amount is Unit Price \\* (\\d+) and cost after savings is correct$")
    public void on_the_number_of_items_dropdown_select_and_validate_the_Total_amount_is_Unit_Price_and_cost_after_savings_is_correct(int arg1, int arg2) throws Throwable {
        Assert.assertTrue(cartPage.setQuantity());
    }


}
