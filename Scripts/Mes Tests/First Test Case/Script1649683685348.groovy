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

WebUI.navigateToUrl('https://atos.net/en/')

WebUI.click(findTestObject('Object Repository/Page_Atos  Home/button_Accept all cookies'))

WebUI.click(findTestObject('Object Repository/Page_Atos  Home/a_Contact us'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact us - Atos/select_Please selectNew Solution or Service_1d78fe'), 
    'Other', true)

WebUI.setText(findTestObject('Object Repository/Page_Contact us - Atos/textarea__input_5'), 'hello world !')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - Atos/input__input_1'), 'pierre')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - Atos/input__input_10'), 'tutu')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - Atos/input__input_4'), 'pierre.')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - Atos/input__input_20'), '')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - Atos/input__input_4'), 'pierre.zahlen@hotmail.com')

WebUI.click(findTestObject('Object Repository/Page_Contact us - Atos/input__input_7.1'))

WebUI.click(findTestObject('Object Repository/Page_Contact us - Atos/input_privacy policy_input_24.1'))

