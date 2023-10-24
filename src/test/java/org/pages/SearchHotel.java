package org.pages;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
	PageFactory.initElements(driver, this);
	}
	
@FindBy(id = "location")
private WebElement btnRadio1;

@FindBy(id = "hotels")
private WebElement btnRadio2;

@FindBy(id = "room_type")
private WebElement btnRadio3;

@FindBy(id = "room_nos")
private WebElement btnRadio4;

@FindBy(id = "datepick_in")
private WebElement datePickin1;

@FindBy(id = "datepick_in")
private WebElement datePickin2;

@FindBy(id = "datepick_out")
private WebElement datePickout1;

@FindBy(id = "datepick_out")
private WebElement datePickout2;

@FindBy(id = "adult_room")
private WebElement btnRadio5;

@FindBy(id = "child_room")
private WebElement btnRadio6;

@FindBy(id = "Submit")
private WebElement btnSearch;

public WebElement getBtnRadio1() {
	return btnRadio1;
}

public WebElement getBtnRadio2() {
	return btnRadio2;
}

public WebElement getBtnRadio3() {
	return btnRadio3;
}

public WebElement getBtnRadio4() {
	return btnRadio4;
}

public WebElement getDatePickin1() {
	return datePickin1;
}

public WebElement getDatePickin2() {
	return datePickin2;
}

public WebElement getDatePickout1() {
	return datePickout1;
}

public WebElement getDatePickout2() {
	return datePickout2;
}

public WebElement getBtnRadio5() {
	return btnRadio5;
}

public WebElement getBtnRadio6() {
	return btnRadio6;
}

public WebElement getBtnSearch() {
	return btnSearch;
}

}

