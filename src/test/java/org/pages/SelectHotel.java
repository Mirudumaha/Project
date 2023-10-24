package org.pages;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
	PageFactory.initElements(driver, this);
	}
@FindBy(id = "radiobutton_0")
private WebElement btnRadio7;

@FindBy(id = "continue")
private WebElement btnCont;

public WebElement getBtnRadio7() {
	return btnRadio7;
}

public WebElement getBtnCont() {
	return btnCont;
}

}
