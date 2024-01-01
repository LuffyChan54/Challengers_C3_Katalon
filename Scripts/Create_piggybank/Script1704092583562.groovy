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

WebUI.setText(findTestObject('Object Repository/Create_piggybank/Page_Login to Firefly III/input_Remember me_email'), 'huydaikakaka1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create_piggybank/Page_Login to Firefly III/input_Remember me_password'), 
    'Fs7csKrJWbf80DByFGbkRMMYWLbTXXEgC1UQBjVSbw4=')

WebUI.click(findTestObject('Object Repository/Create_piggybank/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Create_piggybank/Page_Whats playing  Firefly III/a_Piggy banks'))

WebUI.click(findTestObject('Object Repository/Create_piggybank/Page_Piggy banks  Firefly III/a_Create new piggy bank'))

WebUI.setText(findTestObject('Object Repository/Create_piggybank/Page_New piggy bank  Piggy banks  Firefly III/input_Name_name'), 
    new_piggy_bank_name)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Create_piggybank/Page_New piggy bank  Piggy banks  Firefly III/select_huybankhuybank ti khon tit kimV tin mt'), 
    new_piggy_bank_account, true)

WebUI.setText(findTestObject('Object Repository/Create_piggybank/Page_New piggy bank  Piggy banks  Firefly III/input_Target amount_targetamount'), 
		new_piggy_bank_target_amount)

WebUI.setText(findTestObject('Create_piggybank/Page_New piggy bank  Piggy banks  Firefly III/test_datepicker'), new_piggy_bank_target_date)


WebUI.setText(findTestObject('Object Repository/Create_piggybank/Page_New piggy bank  Piggy banks  Firefly III/textarea_Notes_notes'), 
    new_piggy_bank_notes)

WebUI.uploadFile(findTestObject('Create_piggybank/Page_New piggy bank  Piggy banks  Firefly III/importfile_piggybank'), 
  System.getProperty(("user.dir")) + "\\" +new_piggy_bank_attachments)



WebUI.setText(findTestObject('Object Repository/Create_piggybank/Page_New piggy bank  Piggy banks  Firefly III/input_Group_object_group'), 
    new_piggy_bank_group)

WebUI.click(findTestObject('Object Repository/Create_piggybank/Page_New piggy bank  Piggy banks  Firefly III/button_Store new piggy bank'))

WebUI.verifyTextPresent(new_piggy_bank_flag, false)

WebUI.closeBrowser()

