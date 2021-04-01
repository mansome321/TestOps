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

Mobile.startExistingApplication(GlobalVariable.APP_ID)

Mobile.tap(findTestObject('Common/FindByText', [('text') : 'Transaction']), 10)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - AGREE'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

//Mobile.verifyElementExist(findTestObject('Common/FindByText', [('text') : err_message]), 10)

actual_AlertText = Mobile.getText(findTestObject('Object Repository/hw1/alert_errMessage'), 10)
	
Mobile.verifyMatch(actual_AlertText, GlobalVariable.TC_1_ErrorMessage, false)

Mobile.closeApplication()

