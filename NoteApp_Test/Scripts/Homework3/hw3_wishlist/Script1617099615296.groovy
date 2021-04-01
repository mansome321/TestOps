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

Transaction_detail = [ 'fund_name' : 'KFCASHPLUS'];

def t_sequence = [ ];
t_sequence << ['TAP' , 'Transaction'];
t_sequence << ['TAP' , 'Search'];
t_sequence << ['TAP' , Transaction_detail['fund_name']];
t_sequence << ['TAP' , 'Add to wishlist'];
t_sequence << ['Verify'];

Mobile.startExistingApplication(GlobalVariable.APP_ID)

for(int i = 0; i < t_sequence.size(); i++) {
	switch (t_sequence[i][0]) {
		case 'TAP': Mobile.tap(findTestObject('Common/FindByText', [ ('text') : t_sequence[i][1] ]), 0)
			break;
		case 'KeypadAmount' : t_sequence[i][1].each{ Mobile.tap(findTestObject('Common/FindByText', [ ('text') : it ]), 0) };
			break;
		case 'SETTEXT' : Mobile.setText(findTestObject('Common/FindByText', [ ('text') : t_sequence[i][1] ]), t_sequence[i][2] , 0)
			break;
		case 'GETTEXT' : actual_AlertText = Mobile.getText(findTestObject('Object Repository/hw1/alert_errMessage'), 10)
			break;
			case 'Verify' : Mobile.verifyElementExist(findTestObject('Common/FindByText', [('text') : 'Wishlist']), 10)
	}
}
