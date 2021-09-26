package com.UrbanLadderC.UiStore;

import org.openqa.selenium.By;

public class HomePageUi {
	public By clicksearchBox=By.id("search");
	public By clicksearchButton=By.id("search_button");
	
	public By closingpopup=By.cssSelector("a[data-gaaction=\"popup.auth.close\"]");
	
	public By BedCheck1=By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a/img");
	
	public By Help=By.cssSelector("[href=\"/help?src=g_footer\"]");
	public By HelpSearch=By.id("help-center-search-input");
	public By HelpQs=By.cssSelector(".col-sm-11.col-md-11.col-lg-11.text");
	
	public By more=By.cssSelector("[href=\"/locations?src=footer\"]");
	public By cities=By.cssSelector(".col-lg-3.col-sm-6.location__taxon__state");
	
	public By insta=By.className("icofont-social-twitter");
	public By posts=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[5]/div[1]/a/span[1]/span");
	
	public By chat=By.id("fc_widget");
	public By cchat=By.className("icon-ic_chat_icon");
	public By chatwithus=By.className("channel-name");
	public By chattext=By.id("app-conversation-editor");
	
	public By Checkbox=By.cssSelector("[id=\"filters_availability_In_Stock_Only\"]");
	public By productCount=By.cssSelector("[class=\"results-count\"]");
	
	public By gift=By.cssSelector("a[href=\"../../gift-cards?src=header\"]");
	public By dc=By.xpath("//h5[normalize-space()='No expiry date']");
	
	public By track=By.cssSelector("[href=\"/orders?src=track-order\"]");
	public By orderid=By.name("orderNumber");
	public By phno=By.name("phoneNumber");
	public By submit=By.cssSelector("[type=\"submit\"]");
	
	public By rec1=By.xpath("//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]");
	public By rec2=By.xpath("//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[2]");
	
	public By store=By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a");
	
	
	
}
