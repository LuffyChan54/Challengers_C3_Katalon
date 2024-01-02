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

WebUI.setText(findTestObject('Object Repository/create-transaction-expends/Page_Login to Firefly III/input_email'), 'kyle1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/create-transaction-expends/Page_Login to Firefly III/input_password'), 
    'd3lIecQsFr1no/7IpxP7HzUVtR+qdaKX')

WebUI.click(findTestObject('Object Repository/create-transaction-expends/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/create-transaction-expends/Page_Whats playing  Firefly III/span_Transactions'))

WebUI.click(findTestObject('Object Repository/create-transaction-expends/Page_Whats playing  Firefly III/span_Expenses'))

WebUI.click(findTestObject('Object Repository/create-transaction-expends/Page_All expenses between January 1st, 2024_d388e7/a_Create a new transaction'))

WebUI.setText(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/input_description'), 
    description)

if(!source.equals("")) {
	
	WebUI.setText(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/input_source'),
		source)
}



if((source.equals("Kyle Bank") || source.equals("ACB")) && !source.equals("")) {
	WebUI.sendKeys(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/input_source'),
		Keys.chord(Keys.ENTER))
}


if(!destination.equals("")) {
	WebUI.setText(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/input_destination'), 
		destination)
}


if(!destination.equals("") && (destination.equals("Kyle Bank") || destination.equals("ACB") || destination.equals("VietThuongMusic") || destination.equals("ITC Group"))) {
	
	WebUI.sendKeys(findTestObject('Object Repository/create-budget/Page_Create new withdrawal  Transactions  F_057ce1/input_destination'), 
		Keys.chord(Keys.ENTER))
	
	System.out.println("da vao day");
}


System.out.println("da ra ngoai vao day");


WebUI.setText(findTestObject('Object Repository/create-transaction-expends/Page_Login to Firefly III/input_Amount_amount'),
	amount)


if(source.equals("Cash wallet")) {
	WebUI.selectOptionByValue(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/select_Euro'),
		'1', true)
	
	WebUI.setText(findTestObject('Object Repository/create-budget/Page_Whats playing  Firefly III/Page_Create new withdrawal  Transactions  Firefly III/input_Foreign amount_foreign_amount'),
		foreign_amount)
}

if(!destination.equals("Kyle Bank")) {
	WebUI.selectOptionByValue(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/select_(none)      My Budget      Test My B_b58ae1'), 
		budget, true)
}


WebUI.setText(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/input_category'), 
    category)

WebUI.selectOptionByValue(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/select_(no piggy bank)                  New_ab1cdb'), 
    piggy_bank, true)

WebUI.setText(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/input_ti-new-tag-input ti-valid'), 
    tags)

if(!destination.equals("Kyle Bank")) {
	WebUI.selectOptionByValue(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/select_(none)'),
		bill, true)
}


WebUI.uploadFile(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  Firefly III/input_Attachments_attachments'),
  System.getProperty(("user.dir")) + "\\" + attachment)

WebUI.setText(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/textarea_notes'), 
    notes)

WebUI.click(findTestObject('Object Repository/create-transaction-expends/Page_Create new withdrawal  Transactions  F_057ce1/button_Submit'))

WebUI.verifyTextPresent(flag, false)

WebUI.closeBrowser()
