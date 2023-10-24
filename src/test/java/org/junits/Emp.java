package org.junits;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.BookHotel;
import org.pages.LoginPage;
import org.pages.SearchHotel;
import org.pages.SelectHotel;

public class Emp extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		launchBrowser();
		maximizeWnd();
		implicitWait(20);
		implicitWait1(20);
		loadurl("http://adactinhotelapp.com/");
		}
	@AfterClass
	public static void afterclass() {
		//closeBrowser();

	}
	@Before
	public void before() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

	}
	@After
	public void after() {
		long endTime = System.currentTimeMillis();
System.out.println(endTime);
	}
	@Test
	public void test() throws IOException {
		LoginPage lp = new LoginPage();
		SearchHotel sh = new SearchHotel();
		SelectHotel sel = new SelectHotel();
		BookHotel bh = new BookHotel();
		
	enterValue(lp.getTxtUserName(), "MIRUDUBHASHINI");
	enterValue(lp.getTxtPassword(), "Maha@123");
	elementClick(lp.getBtnLogin());
	selectOption(sh.getBtnRadio1(), "Sydney");
	selectOption1(sh.getBtnRadio2(), "Hotel Creek");
	selectOption2(sh.getBtnRadio3(), "Double");
	selectOption3(sh.getBtnRadio4(), "4 - Four");
	clearIndate(sh.getDatePickin1());
	enterValue(sh.getDatePickin2(), "24-08-2023");
	clearIndate(sh.getDatePickout1());
	enterValue(sh.getDatePickout2(), "26-08-2023");
	selectOption4(sh.getBtnRadio5(), "2 - Two");
	selectOption5(sh.getBtnRadio6(), "1 - One");
	elementSearch(sh.getBtnSearch());
	radioButton(sel.getBtnRadio7());
	elementCont(sel.getBtnCont());
	enterFname(bh.getfName(), "Maha");
	enterLname(bh.getLName(), "Kumar");
	enterAdd(bh.getAddr(), "Ram nagar, Madipakkam, Chennai");
	enterCCno(bh.getCardNo(), "2165468456541278");
	selectTypeption(bh.getDropDown(), "VISA");
	selectEdate(bh.getDropDown1(), "May");
	selectYear(bh.getDropDown2(), "2028");
	enterCVV(bh.getCvv(), "532");
	elementCont(bh.getBtnBook());

	}
	
	
	
	
}

