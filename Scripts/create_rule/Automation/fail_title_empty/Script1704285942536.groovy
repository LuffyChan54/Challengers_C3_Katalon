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

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Whats playing/span_Automation'))

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Whats playing/span_Rules'))

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Rules/a_New rule'))

WebUI.setText(findTestObject('Object Repository/Create_rule/Page_Make a new rule/input_title'), title)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create_rule/Page_Make a new rule/select_trigger_when'), trigger, 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create_rule/Page_Make a new rule/select_rule_group'), rule_group_id, 
    true)

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Make a new rule/input_stop_processing'))

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Make a new rule/input_strict'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create_rule/Page_Make a new rule/select_trigger_type'), triggers_type, 
    true)

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Make a new rule/input_triggers1prohibited'))

WebUI.setText(findTestObject('Object Repository/Create_rule/Page_Make a new rule/input_triggers1value'), triggers_value)

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Make a new rule/input_triggers1stop_processing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create_rule/Page_Make a new rule/select_action_type'), actions_type, 
    true)

WebUI.setText(findTestObject('Create_rule/Page_Make a new rule/input_actions1value'), actions_value)

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Make a new rule/input_actions1stop_processing'))

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Make a new rule/button_Store new rule'))

WebUI.verifyTextPresent('The title field is required.*', true)

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Whats playing/span_Automation'))

WebUI.click(findTestObject('Object Repository/Create_rule/Page_Whats playing/span_Rules'))

