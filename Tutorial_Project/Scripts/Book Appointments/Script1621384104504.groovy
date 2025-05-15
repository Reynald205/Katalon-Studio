import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/td_19'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment_comment'), 'This is A Comment')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Appointment Confirmation'), 30)

WebUI.delay(5)

WebUI.closeBrowser()

