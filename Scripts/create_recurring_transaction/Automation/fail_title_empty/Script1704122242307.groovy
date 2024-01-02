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

WebUI.click(findTestObject('Create_recurring_transaction/Page_Recurring transactions  Firefly III/a_Create a recurring transaction'))

WebUI.setText(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/input_title'), title)

String[] Date = first_date.split('/', 3)

WebUI.executeJavaScript(String.format('document.getElementById(\'ffInput_first_date\').value = \'%s-%s-%s\'', Date[2], Date[
        1], Date[0]), [])

WebUI.selectOptionByValue(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/select_repetition_type'), 
    repetition_type, true)

WebUI.setText(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/input_skip'), skip)

WebUI.selectOptionByValue(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/select_weekend'), 
    weekend, true)

WebUI.selectOptionByValue(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/select_repetition_ends'), 
    repetition_end, true)

if (repetition_end.equals('times')) {
    WebUI.setText(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/input_repetitions'), 
        repetitions)
} else if (repetition_end.equals('until_date')) {
    String[] DateRepeat = first_date.split('/', 3)

    WebUI.executeJavaScript(String.format('document.getElementById(\'ffInput_repeat_until\').value = \'%s-%s-%s\'', DateRepeat[
            2], DateRepeat[1], DateRepeat[0]), [])
}

if (transaction_type.equals('deposit')) {
    WebUI.click(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/a_Deposit'))
} else if (transaction_type.equals('withdrawal')) {
} else if (transaction_type.equals('tranfer')) {
    WebUI.click(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/a_Transfer'))
}

WebUI.setText(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/input_transaction_description'), 
    transaction_description)

WebUI.setText(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/input_amount'), amount)

if (transaction_type.equals('deposit')) {
    WebUI.selectOptionByValue(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/select_deposit_source_id'), 
        source_id, true)

    WebUI.selectOptionByValue(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/select_destination_id'), 
        destination_id, true)
} else if (transaction_type.equals('withdrawal')) {
    WebUI.selectOptionByValue(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/select_source_id'), 
        source_id, true)

    WebUI.selectOptionByValue(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/select_withdrawal_destination_id'), 
        destination_id, true)
} else if (transaction_type.equals('tranfer')) {
    WebUI.selectOptionByValue(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/select_source_id'), 
        source_id, true)

    WebUI.selectOptionByValue(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/select_destination_id'), 
        destination_id, true)
}

WebUI.click(findTestObject('Create_recurring_transaction/Page_Create new recurring transaction/button_Store recurring transaction'))

WebUI.verifyTextPresent('The title field is required.*', true)

WebUI.click(findTestObject('Create_recurring_transaction/Page_Whats playing  Firefly III/span_Recurring transactions'))

