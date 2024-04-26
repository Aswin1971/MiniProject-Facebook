package miniProject;
import java.io.File;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class FbAccount extends DriverSetup {
	public static WebElement day;
	public static WebElement month;
	public static WebElement year;
	public static Select dropDate;
	public static Select dropMonth;
	public static Select dropYear;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;
	public static String fName;
	public static String sName;
	public static String moNum;
	public static String dateDOB;
	public static String monthDOB;
	public static String yearDOB;
	public static String gender;
	public static String actPassError;
	public static String actMobError;
	public static String expPassError;
	public static String expMobError;
	public static String actPassErrorMsg;
	public static String actMobErrorMsg;
	public static String expPassErrorMsg;
	public static String expMobErrorMsg;
	public static File src;
	public static int r;

		/*
		 * 
		 * Method Name  : driverConfig
		 * Method Usage : To Invoke getWebDriver method present in the Parent class DriverSetup.
		 * Return       : void
		 * 
		 */
		public void driverConfig (String browser) {
			
			driver = DriverSetup.getWebDriver(browser);
			
		}
		
		/*
		 * 
		 * Method Name  : verifySignUpScreenRecordStart
		 * Method Usage : To Invoke startRecord method present in the class ScreenRecorderUtil.
		 * Return       : void
		 * 
		 */
		public static void testCaseReadExcel () {
			
			try {
				
				ExcelReadWrite.excelRead1();
				ExcelReadWrite.excelRead2();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		/*
		 * 
		 * Method Name  : clickOnCreateNewAccount
		 * Method Usage : To Click on Create New Account linkText.
		 * Return       : void
		 * 
		 */
		public static void clickOnCreateNewAccount () {
			
			SignUpPage.creatingAccount(driver).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		/*
		 * 
		 * Method Name  : textToFirstName
		 * Method Usage : To Enter mobile number using sendKeys method by providing input from the excel work book using ExcelReadWrite class.
		 * Return       : void
		 * 
		 */
		public static void textToFirstName () {
			
			SignUpPage.firstName(driver).sendKeys(ExcelReadWrite.fName);
			
		}
		
		/*
		 * 
		 * Method Name  : textToSurName
		 * Method Usage : To Enter mobile number using sendKeys method by providing input from the excel work book using ExcelReadWrite class.
		 * Return       : void
		 * 
		 */
		public static void textToSurName () {
			
			SignUpPage.surName(driver).sendKeys(ExcelReadWrite.sName);
			
		}
		
		/*
		 * 
		 * Method Name  : textToMobNum
		 * Method Usage : To Enter mobile number using sendKeys method by providing input from the excel work book using ExcelReadWrite class.
		 * Return       : void
		 * 
		 */
		public static void textToMobNum () {
			
			SignUpPage.mobileNumber(driver).sendKeys(ExcelReadWrite.moNum);
			
		}
		
		/*
		 * 
		 * Method Name  : selectDateOfDob
		 * Method Usage : To Select the date of the DOB using selectByVisibleText method.
		 * Return       : void
		 * 
		 */
		public static void selectDateOfDob () {
			
			day = SignUpPage.dateOfDob(driver);
			dropDate = new Select(day);
			dropDate.selectByVisibleText(ExcelReadWrite.dateDOB);
			
		}

		/*
		 * 
		 * Method Name  : selectByValue
		 * Method Usage : To Select the month of the DOB using selectByIndex method.
		 * Return       : void
		 * 
		 */
		public static void selectMonthOfDob () {
			
			month = SignUpPage.monthOfDob(driver);
			dropMonth = new Select(month);
			dropMonth.selectByIndex(ExcelReadWrite.monthDOB);
			
		}

		/*
		 * 
		 * Method Name  : selectYearOfDob
		 * Method Usage : To Select the year of the DOB using selectByValue method.
		 * Return       : void
		 * 
		 */
		public static void selectYearOfDob () {
			
			year = SignUpPage.yearOfDob(driver);
			dropYear = new Select(year);
			dropYear.selectByValue(ExcelReadWrite.yearDOB);
			
		}
		
		/*
		 * 
		 * Method Name  : clickOnGender
		 * Method Usage : To Click on Gender radio button.
		 * Return       : void
		 * 
		 */
		public static void clickOnGender () {
			
			gender = ExcelReadWrite.userGen;
			SignUpPage.userGender(driver, gender).click();
			
		}

		/*
		 * 
		 * Method Name  : clickOnSignUp
		 * Method Usage : To Click on Sign Up linText.
		 * Return       : void
		 * 
		 */
		public static void clickOnSignUp () {
			
			SignUpPage.signUp(driver).click();
			
		}
		
		/*
		 * 
		 * Method Name  : displayPasswordErrorMsg
		 * Method Usage : To Display password error message on the console using getText method.
		 * Return       : void
		 * 
		 */
		public static void displayPasswordErrorMsg () {
			
			actPassErrorMsg = SignUpPage.passWordError(driver).getText();
			System.out.println("Password Error Message is: " + actPassErrorMsg);
			
		}
		
		/*
		 * 
		 * Method Name  : verifyPasswordErrorMsg
		 * Method Usage : To Verify whether the password error message is correct or not using asserEquals method.
		 * Return       : void
		 * 
		 */
		public static void verifyPasswordErrorMsg () {
			
			expPassErrorMsg = ExcelReadWrite.expPassError; 
			actPassErrorMsg = SignUpPage.passWordError(driver).getText();
			assertEquals(actPassErrorMsg,expPassErrorMsg);
		}
		/*
		 * 
		 * Method Name  : clickOnNavigateError
		 * Method Usage : To Click on the next error message symbol.
		 * Return       : void
		 * 
		 */
		public static void clickOnNavigateError () {
			
			SignUpPage.navigateToError(driver).click();
			
		}
		
		/*
		 * 
		 * Method Name  : displayMobileNumberErrorMsg
		 * Method Usage : To Display mobile number error message on the console using getText method.
		 * Return       : void
		 * 
		 */
		public static void displayMobileNumberErrorMsg () {
			
			actMobErrorMsg = SignUpPage.mobNumError(driver).getText();
			System.out.println("Mobile Number Error Message is: " + actMobErrorMsg);
			
		}
		
		/*
		 * 
		 * Method Name  : verifyMobileNumberErrorMsg
		 * Method Usage : To Verify whether the mobile number error message is correct or not using asserEquals method.
		 * Return       : void
		 * 
		 */
		public static void verifyMobileNumberErrorMsg () {
			
			expMobErrorMsg = ExcelReadWrite.expMobError; 
			actMobErrorMsg = SignUpPage.mobNumError(driver).getText();
			assertEquals(actMobErrorMsg, expMobErrorMsg);

		}
		/*
		 * 
		 * Method Name  : loggingErrorMessages
		 * Method Usage : To Invoke excelWrite method in the ExcelReadWrite class and to write the error messages in the excel work book.
		 * Return       : void
		 * 
		 */
		public static void loggingErrorMessages () {
			
			try {
				
				r = (ExcelReadWrite.Row) - 1;
				
				for (int i=1; i<=ExcelReadWrite.sheet.getLastRowNum(); i++) {

					cell = ExcelReadWrite.sheet.getRow(r).getCell(3);
					
					if (cell == null)
						cell = ExcelReadWrite.sheet.getRow(r).createCell(3);
					
					if (r == 1)
						cell.setCellValue(actPassErrorMsg);
					else if (r == 2)
						cell.setCellValue(actMobErrorMsg);
					
					ExcelReadWrite.excelWrite();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					r++;
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
		/*
		 * 
		 * Method Name  : closingBrowser
		 * Method Usage : To Invoke closingBrowser method present in the Parent class DriverSetup.
		 * 
		 */
		public static void closingBrowser () {
			
			DriverSetup.driverClose();
			
		}
}
