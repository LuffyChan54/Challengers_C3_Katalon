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

WebUI.setText(findTestObject('Object Repository/create-budget/Page_Login to Firefly III/input_email'), 'kyle1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/create-budget/Page_Login to Firefly III/input_password'), 'd3lIecQsFr1no/7IpxP7HzUVtR+qdaKX')

WebUI.click(findTestObject('Object Repository/create-budget/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/create-budget/Page_Whats playing  Firefly III/a_Budgets'))

WebUI.click(findTestObject('Object Repository/create-budget/Page_Budgets  Firefly III/a_New budget'))

WebUI.setText(findTestObject('Object Repository/create-budget/Page_Create a new budget  Budgets  Firefly III/input_name'), 
    name)

WebUI.selectOptionByValue(findTestObject('Object Repository/create-budget/Page_Create a new budget  Budgets  Firefly III/select_No auto-budgetSet a fixed amount eve_005aeb'), 
    auto_budget_type, true)

if(!auto_budget_type.equals("0")) {
	WebUI.setText(findTestObject('Object Repository/create-budget/Page_Create a new budget  Budgets  Firefly III/input_auto_budget_amount'),
		auto_budget_amount)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/create-budget/Page_Create a new budget  Budgets  Firefly III/select_DailyWeeklyMonthlyQuarterlyEvery hal_69941c'),
		auto_budget_period, true)
}



WebUI.uploadFile(findTestObject('Object Repository/create-budget/Page_Create a new budget  Budgets  Firefly III/input_Attachments_attachments'),
  System.getProperty(("user.dir")) + "\\" + attachment)

WebUI.click(findTestObject('Object Repository/create-budget/Page_Create a new budget  Budgets  Firefly III/button_Store new budget'))

WebUI.verifyTextPresent(flag, false)

WebUI.closeBrowser()

