package com.UrbanLadderC.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadderC.UiStore.HomePageUi;

public class HomePageObjects {
	WebDriver driver;
	HomePageUi h=new HomePageUi();
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//a
	public WebElement clickingSearchBox()
	{
		return driver.findElement(h.clicksearchBox);
	}
	public WebElement clickingSearchButton()
	{
		return driver.findElement(h.clicksearchButton);
	}
	
	//1
	public WebElement CheckingBed1()
	{
		return driver.findElement(h.BedCheck1);
	}
	
	//a
	public WebElement ClosingPopup()
	{
		return driver.findElement(h.closingpopup);
	}
	//2
	public WebElement GetHelp()
	{
		return driver.findElement(h.Help);
	}
	public WebElement GetHelpSearch()
	{
		return driver.findElement(h.HelpSearch);
	}
	public List<WebElement> GetHelpSearchQuestions()
	{
		return driver.findElements(h.HelpQs);
	}
	
	//3
	public WebElement Morecities()
	{
		return driver.findElement(h.more);
	}
	public List<WebElement> GetCities()
	{
		return driver.findElements(h.cities);
	}
	
	//4 twitter following
	public WebElement ClickInsta()
	{
		return driver.findElement(h.insta);
	}
	public WebElement GetPosts()
	{
		return driver.findElement(h.posts);
	}
	
	//5 chat
	public WebElement ChatFrame()
	{
		return driver.findElement(h.chat);
	}
	public WebElement ClickChatFrame()
	{
		return driver.findElement(h.cchat);
	}
	public WebElement ChatWithBot()
	{
		return driver.findElement(h.chatwithus);
	}
	public WebElement ChattextBox()
	{
		return driver.findElement(h.chattext);
	}
	
	//6 product count
	public WebElement GetCheckBox()
	{
		return driver.findElement(h.Checkbox);
	}
	public WebElement GetProductsCount()
	{
		return driver.findElement(h.productCount);
	}
	
	//7 GiftCards
	public WebElement GiftCards()
	{
		return driver.findElement(h.gift);
	}
	public WebElement NoExpirys()
	{
		return driver.findElement(h.dc);
	}
	
	//8track order
	public WebElement Orderid()
	{
		return driver.findElement(h.orderid);
	}
	public WebElement PhoneNumber()
	{
		return driver.findElement(h.phno);
	}	
	public WebElement TrackOrder()
	{
		return driver.findElement(h.track);
	}
	public WebElement Submit()
	{
		return driver.findElement(h.submit);
	}
	
	//9 recomended l 2 h
	
	public WebElement Recommended()
	{
		return driver.findElement(h.rec1);
	}
	public WebElement RecommendedLow2High()
	{
		return driver.findElement(h.rec2);
	}
	
	//10 links in stores
	public WebElement Stores()
	{
		return driver.findElement(h.store);
	}
	
}
