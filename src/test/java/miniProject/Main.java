package miniProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FbAccount fb=new FbAccount();
		System.out.println("Enter the Browser:");
		Scanner sc=new Scanner(System.in);
		String browser=sc.next();
		sc.close();
		fb.driverConfig(browser);
		FbAccount.testCaseReadExcel();
		FbAccount.clickOnCreateNewAccount();
		FbAccount.textToFirstName();
		FbAccount.textToSurName();
		FbAccount.textToMobNum();
		FbAccount.selectDateOfDob();
		FbAccount.selectMonthOfDob();
		FbAccount.selectYearOfDob();
		FbAccount.clickOnGender();
		FbAccount.clickOnSignUp();
		FbAccount.displayPasswordErrorMsg();
		FbAccount.verifyPasswordErrorMsg();
		FbAccount.clickOnNavigateError();
		FbAccount.displayMobileNumberErrorMsg();
		FbAccount.verifyMobileNumberErrorMsg();
		FbAccount.closingBrowser();
	}

}
