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

WebUI.setText(findTestObject('Object Repository/Create_report_object/Page_Login to Firefly III/input_Remember me_email'), 
    'huydaikakaka1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create_report_object/Page_Login to Firefly III/input_Remember me_password'), 
    'Fs7csKrJWbf80DByFGbkRMMYWLbTXXEgC1UQBjVSbw4=')

WebUI.click(findTestObject('Object Repository/Create_report_object/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Create_report_object/Page_Whats playing  Firefly III/a_Reports'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Create_report_object/Page_Reports  Firefly III/select_Default financial report            _3699a2'), 
    create_report_type, true)

if (!create_report_account.equals("null")) {
	
	WebUI.click(findTestObject('Object Repository/Create_report_object/Page_Reports  Firefly III/button_None selected'))
	
	WebUI.click(findTestObject('Object Repository/Create_report_object/Page_Reports  Firefly III/label_Select all'))
}


WebUI.setText(findTestObject('Object Repository/Create_report_object/Page_Reports  Firefly III/input_Date range_daterange'), 
    create_report_date_range)

WebUI.click(findTestObject('Create_report_object/button_apply_date_range'))

if (create_report_type.equals("Budget report") || create_report_type.equals("Category report") || create_report_type.equals("Tag report")) {
	
	if (!create_report_extra_option.equals("null")) {
		
		WebUI.click(findTestObject('Create_report_object/extra_option'))
		
		WebUI.click(findTestObject('Object Repository/Create_report_object/Page_Reports  Firefly III/label_select_extra_option'))
	}
	
}

WebUI.click(findTestObject('Object Repository/Create_report_object/Page_Reports  Firefly III/button_Submit'))

WebUI.verifyTextPresent(create_report_flag, false)

WebUI.closeBrowser()

