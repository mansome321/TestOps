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

Mobile.startExistingApplication('com.krungsri.ksam')

Mobile.tap(findTestObject('Common/FindByText', [('text') : 'Settings']), 10)

Mobile.tap(findTestObject('Common/FindByText', [('text') : 'Edit Profile/Wallpaper']), 10)

Mobile.tap(findTestObject('Object Repository/hw44/image'), 0)

Mobile.tap(findTestObject('Object Repository/hw44/android.widget.TextView - Take Photo'), 0)

Mobile.tap(findTestObject('Object Repository/hw44/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/hw44/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/hw44/android.widget.Button - SAVE'), 0)

//Mobile.tap(findTestObject('Object Repository/hw44/android.widget.Button - SAVE (1)'), 0)

Mobile.tap(findTestObject('Common/FindByText', [('text') : 'SELECT IMAGE']), 10)

Mobile.tap(findTestObject('Common/FindByText', [('text') : 'SAVE']), 10)

Mobile.tap(findTestObject('Object Repository/hw44/android.widget.Button - DONE'), 0)

Mobile.tap(findTestObject('Object Repository/hw44/android.widget.FrameLayout (1)'), 0)

Mobile.closeApplication()

