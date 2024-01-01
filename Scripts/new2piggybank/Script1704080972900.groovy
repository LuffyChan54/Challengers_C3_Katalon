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

WebUI.setText(findTestObject('Object Repository/Page_Login to Firefly III/input_Remember me_email'), 'huydaikakaka1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login to Firefly III/input_Remember me_password'), 'Fs7csKrJWbf80DByFGbkRMMYWLbTXXEgC1UQBjVSbw4=')

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/a_Piggy banks'))

WebUI.click(findTestObject('Object Repository/Page_Piggy banks  Firefly III/a_Create new piggy bank'))

WebUI.setText(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/input_Name_name'), 'huuuuuuytessssss')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/select_huybankhuybank ti khon tit kimV tin mt'), 
    'huybank tài khoản tiết kiệm', true)

WebUI.click(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/div_Mandatory fields                       _e94922'))

WebUI.click(findTestObject('Object Repository/Page_New piggy bank  Piggy banks  Firefly III/button_Store new piggy bank'))

WebUI.closeBrowser()

