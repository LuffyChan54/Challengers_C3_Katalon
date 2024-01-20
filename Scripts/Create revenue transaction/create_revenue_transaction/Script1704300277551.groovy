import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://firefly.buudadawg.online/login')

WebUI.setText(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Login to Firefly III/input_email'), 'hehehe@gmail.com')

WebUI.click(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Login to Firefly III/body_Sign in to start your session         _0d74a1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Login to Firefly III/input_password'), 
    'xEs3tKYlcMrRmB6brUVZ3aneZgNJEBcAdqUaY2F18EQ=')

WebUI.click(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Whats playing  Firefly III/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Whats playing  Firefly III/span_Revenue  income'))

WebUI.click(findTestObject('Object Repository/Create_Revenue_Transaction/Page_All revenue between January 1st, 2024 _e17e7d/a_Create a new transaction'))

WebUI.setText(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_description'), 
    description)

//WebUI.click(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_source'))

WebUI.setText(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_source'), 
    source_account)
//
if(!source_account.equals('')) {
	WebUI.sendKeys(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_source'),
		Keys.chord(Keys.ENTER))
}
//
////WebUI.click(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_destination'))
WebUI.setText(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_destination'), 
    destination_account)

if(!destination_account.equals('')) {
	WebUI.sendKeys(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_destination'),
		Keys.chord(Keys.ENTER))
}

//
WebUI.setText(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_amount'), 
    amount)
//
//
//
WebUI.setText(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_category'), 
    category)

//if(!category.equals('null')) {
//	WebUI.sendKeys(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_category'), 
//    Keys.chord(Keys.ENTER))
//}
//
//
//
if(!piggy_bank.equals('null')){
	WebUI.selectOptionByValue(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/select_(no piggy bank)                  Iph_d8c4d9'),
		piggy_bank, true)
}

if(!tags.equals('null')) {
	WebUI.setText(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/input_ti-new-tag-input ti-valid'),
		tags)
}

if(!notes.equals('null')) {
	WebUI.setText(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/textarea_notes'),
		notes)
}
//
//
WebUI.click(findTestObject('Object Repository/Create_Revenue_Transaction/Page_Create new deposit  Transactions  Firefly III/button_Submit'))
//
WebUI.verifyTextPresent(flag, false)
//
WebUI.closeBrowser()
