package org.pages;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	public BookHotel() {
	PageFactory.initElements(driver, this);
	}
	
@FindBy(id = "first_name")
private WebElement fName;

@FindBy(id = "last_name")
private WebElement LName;

@FindBy(id = "address")
private WebElement addr;

@FindBy(id = "cc_num")
private WebElement cardNo;

@FindBy(id = "cc_type")
private WebElement dropDown;

@FindBy(id = "cc_exp_month")
private WebElement dropDown1;

@FindBy(id = "cc_exp_year")
private WebElement dropDown2;

@FindBy(id = "cc_cvv")
private WebElement Cvv;

@FindBy(id = "book_now")
private WebElement btnBook;

public WebElement getfName() {
	return fName;
}

public WebElement getLName() {
	return LName;
}

public WebElement getAddr() {
	return addr;
}

public WebElement getCardNo() {
	return cardNo;
}

public WebElement getDropDown() {
	return dropDown;
}

public WebElement getDropDown1() {
	return dropDown1;
}

public WebElement getDropDown2() {
	return dropDown2;
}

public WebElement getCvv() {
	return Cvv;
}

public WebElement getBtnBook() {
	return btnBook;
}
}
