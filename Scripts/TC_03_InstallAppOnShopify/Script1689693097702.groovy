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


WebUI.navigateToUrl('https://apps.shopify.com/instafeed-socialwidget/install')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/InstallApp/select_account_login'))
WebUI.click(findTestObject('Object Repository/InstallApp/btn_log_in_with_URL'))
WebUI.setText(findTestObject('Object Repository/InstallApp/input_store_url'), storeUrl)
WebUI.click(findTestObject('Object Repository/InstallApp/btn_log_in'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/InstallApp/btn_click_add_app'))
WebUI.click(findTestObject('Object Repository/InstallApp/select_account_login'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/InstallApp/span_install_app'))
WebUI.delay(10)
WebUI.takeScreenshot('E:\\install_app_success.png')
WebUI.closeBrowser()





