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

// lấy theo string
//def emailList = new String[4]
//email[0] ="test@gmail.com"
//email[1]="test1@gmail.com"

//lấy theo mapping
//def accountMap =[
//	acc1:[
//		email:'test.1@gmail.com',
//		password:'123456'
//		
//		],
//	acc2:[
//		email:'test.2@gmail.com',
//		password:'1234567'
//		
//		],
//	acc3:[
//		email:'test.3@gmail.com',
//		password:'123'
//		
//		]
//	]


WebUI.openBrowser("https://smallstore0101.myshopify.com/account/login")
def inputEmail(def email) {
	WebUI.sendKeys(findTestObject('Object Repository/StoreFront/input_email'), email)	
}
def inputPassword(def password) {
	WebUI.sendKeys(findTestObject('Object Repository/StoreFront/input_password'), password)	
}
inputEmail('test.function@gmail.com')
inputPassword('123')


//lấy data theo mapping
//WebUI.setText(findTestObject('Object Repository/StoreFront/input_email'),accountMap.acc1.email)


//def email='test12@gmail.com'
//def i
//for(i=0;i<=5;i++) {
//	WebUI.sendKeys(findTestObject('Object Repository/StoreFront/input_email'), email)
//	
//}
//WebUI.setText(findTestObject('Object Repository/StoreFront/input_password'),'123456')
//WebUI.click(findTestObject('Object Repository/StoreFront/btn_log_in'))
WebUI.takeScreenshot('ScreenshotData\\login_success.png')                         
WebUI.closeBrowser()


