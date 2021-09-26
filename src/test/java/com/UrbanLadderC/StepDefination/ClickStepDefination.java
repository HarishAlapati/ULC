package com.UrbanLadderC.StepDefination;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.UrbanLadderC.PageObjects.HomePageObjects;
import com.UrbanLadderC.ResuableComponents.Base;
import com.UrbanLadderC.ResuableComponents.ReusableMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClickStepDefination extends Base{
	
	

	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
	}

	@Given("^navigate to given url and close popup$")
	public void navigate_to_given_url_and_close_popup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePageObjects hpgo= new HomePageObjects(driver);
		OpenUrl();
		hpgo.ClosingPopup().click();
	}

	@When("^Enter \"([^\"]*)\" in searchbox and search$")
	public void enter_in_searchbox_and_search(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePageObjects hpgo= new HomePageObjects(driver);
		Thread.sleep(5000);
		hpgo.clickingSearchBox().sendKeys(arg1);
		//hpgo.clickingSearchButton().click();
		hpgo.clickingSearchBox().sendKeys(Keys.ENTER);
	}

	@Then("^Check item is present or not$")
	public void check_item_is_present_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePageObjects hpgo= new HomePageObjects(driver);
		if(hpgo.CheckingBed1().isDisplayed()) {
			System.out.println("item is  Present"+hpgo.CheckingBed1().getText());
			logger.info("item is  Present"+hpgo.CheckingBed1().getText());
			}
			else
			{
				System.out.println("item is not present");
				logger.warn("item is not present");
			}
	}
    
	
	//2
	   @When("^click on the help and navigate$")
	    public void click_on_the_help_and_navigate() throws Throwable {
		   HomePageObjects hpo= new HomePageObjects(driver);
		   Thread.sleep(5000);
			hpo.GetHelp().click();
	    }
	   	@And("^Enter your query  here \"([^\"]*)\" and click enter$")
	    public void enter_your_query_here_something_and_click_enter(String strArg1) throws Throwable {
	   	 HomePageObjects hpo= new HomePageObjects(driver);
	   	hpo.GetHelpSearch().sendKeys(strArg1);
		hpo.GetHelpSearch().sendKeys(Keys.ARROW_DOWN.ENTER);
	    }

	   	@Then("^Check reponse questions are getting$")
	   	public void check_reponse_questions_are_getting() throws Throwable {
	   	    // Write code here that turns the phrase above into concrete actions
	   		HomePageObjects hpo= new HomePageObjects(driver);
	   		int s=hpo.GetHelpSearchQuestions().size();
			System.out.println("No of Suggestions : "+s);
	        List<WebElement> allLinks=hpo.GetHelpSearchQuestions();
	        for(WebElement link:allLinks) {
	        	System.out.println(link.getText());
	        	logger.info(link.getText());
	        }
	   	}

	   	//3
	    @When("^Click on the more in footer page for delevering cities$")
	    public void click_on_the_more_in_footer_page_for_delevering_cities() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
			Thread.sleep(5000);
			hpo.Morecities().click();

	    }

	    @Then("^Get Cities list that delivering$")
	    public void get_cities_list_that_delivering() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();
	        for(String handle: allWindowHandles)
	        {
	            if(!handle.equals(mainWindowHandle)) 
	            {
	            driver.switchTo().window(handle);
	            System.out.println(" "+driver.getTitle());
	          int ss=hpo.GetCities().size();
	            System.out.println("No of delivering  states : "+ss);
	            List<WebElement> allLinks=hpo.GetCities();
	            for(WebElement link:allLinks) {
	            	System.out.print(link.getText()+",");
	            	logger.info(link.getText()+",");
	            }
	            }
		}
	    }
	    //4
	    @When("^Click on the Twitter in footer page from contact us$")
	    public void click_on_the_twitter_in_footer_page_from_contact_us() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	//Thread.sleep(5000);
			hpo.ClickInsta().click();
	    }

	    @Then("^Get Twitter following numbers$")
	    public void get_twitter_following_numbers() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();
	        for(String handle: allWindowHandles)
	        {
	            if(!handle.equals(mainWindowHandle)) 
	            {
	            driver.switchTo().window(handle);
	            System.out.println(" "+driver.getTitle());
	            System.out.println("Twitter Following Count : "+hpo.GetPosts().getText());
	            logger.info("Twitter Following Count : "+hpo.GetPosts().getText());
	            }
	        }
	    }
	    
	    //5

	    @When("^Shit to Frames for chat$")
	    public void shit_to_frames_for_chat() throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	Thread.sleep(5000);
			driver.switchTo().frame(hpo.ChatFrame());
	    }

	    @Then("^Click on chat logo and send \"([^\"]*)\" in chat box$")
	    public void click_on_chat_logo_and_send_something_in_chat_box(String strArg1) throws Throwable {
	    	HomePageObjects hpo= new HomePageObjects(driver);
	    	Thread.sleep(15000);
			hpo.ClickChatFrame().click();
			Thread.sleep(15000);
			hpo.ChatWithBot().click();
			hpo.ChattextBox().sendKeys("Hello");
			hpo.ChattextBox().sendKeys(Keys.ENTER);
			logger.info("Chat Completed");
			driver.switchTo().defaultContent();
	    }
	 
	    
	    //6
	    @When("^search \"([^\"]*)\" item$")
	    public void search_item(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	HomePageObjects hpgo= new HomePageObjects(driver);
			Thread.sleep(5000);
			hpgo.clickingSearchBox().sendKeys(arg1);
			hpgo.clickingSearchButton().click();
	    }

	    @Then("^Display number of products with and without Stock$")
	    public void display_number_of_products_with_and_without_Stock() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	HomePageObjects hpgo= new HomePageObjects(driver);
	    	System.out.println("All Stocks: "+hpgo.GetProductsCount().getText());
	    	logger.info("All Stocks: "+hpgo.GetProductsCount().getText());
			hpgo.GetCheckBox().click();
			Thread.sleep(5000);
				System.out.println("All in-Stocks: "+hpgo.GetProductsCount().getText());
				logger.info("All in-Stocks: "+hpgo.GetProductsCount().getText());
	    }
	    
	    //7
	    @When("^Click on Gift Cards$")
	    public void click_on_Gift_Cards() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	HomePageObjects hpgo= new HomePageObjects(driver);
	    	hpgo.GiftCards().click();
	    }

	    @Then("^Verify is No Expiry Date is displayed$")
	    public void verify_is_No_Expiry_Date_is_displayed() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	HomePageObjects hpgo= new HomePageObjects(driver);
	    	if(hpgo.NoExpirys().isDisplayed())
			{
				System.out.println("No Expiry date is present");
				logger.info("No Expiry date is present");
			}
			else
			{
				System.out.println("No Expiry date is not present");
				logger.info("No Expiry date is not present");
			}
	    }
	    
	    //8
	    
	    @When("^click on the Track order button in the HomePage$")
	    public void click_on_the_Track_order_button_in_the_HomePage() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	HomePageObjects hpgo= new HomePageObjects(driver);
	    	Thread.sleep(5000);
	    	hpgo.TrackOrder().click();
	    }
	    @Then("^Then Enter (.+) and (.+)$")
	    public void then_enter_and(String ordi, String phno) throws Throwable {
	    	HomePageObjects hpgo= new HomePageObjects(driver);
	    	hpgo.Orderid().sendKeys(ordi);
			hpgo.PhoneNumber().sendKeys(phno);
			hpgo.Submit().click();
			logger.info("Track Order Checked");
	    }
	    
	    //9
	    
	    @When("^Search for some item \"([^\"]*)\"$")
	    public void search_for_some_item(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	HomePageObjects hpgo= new HomePageObjects(driver);
	    	Thread.sleep(5000);
	    	hpgo.clickingSearchBox().sendKeys(arg1);
			//hpgo.clickingSearchButton().click();
	    	hpgo.clickingSearchBox().sendKeys(Keys.ENTER);
	    }

	    @Then("^Set Recommeded to low to high$")
	    public void set_Recommeded_to_low_to_high() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	HomePageObjects hpgo= new HomePageObjects(driver);
	    	Actions action = new Actions(driver);
			  action.moveToElement(hpgo.Recommended()).perform();
			  action.moveToElement(hpgo.RecommendedLow2High()).click().perform();
			  logger.info("Recommended set to low to high");
	    }
	    
	    
	    //10
	    
	    @When("^Click on Stores$")
	    public void click_on_Stores() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	HomePageObjects hpgo= new HomePageObjects(driver);
	    	Thread.sleep(5000);
	    	hpgo.Stores().click();
	    }

	    @Then("^get number of images and print$")
	    public void get_number_of_images_and_print() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	
	    	System.out.println("No of links in stores page : "+driver.findElements(By.tagName("img")).size());
	    	logger.info("No of links in stores page : "+driver.findElements(By.tagName("img")).size());
	    }
	    
}
