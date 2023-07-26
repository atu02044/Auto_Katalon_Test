import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.security.auth.login.LoginContext

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
import org.apache.commons.lang.RandomStringUtils as RandStr
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.navigateToUrl('https://partners.shopify.com/3046806/stores/new?store_type=test_store&data_type=static_data')
String store_name_random = "tuctn_store_auto" + RandStr.randomNumeric(5)
WebUI.setText(findTestObject('Object Repository/CreateStore/txt_store_name'),store_name_random)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/CreateStore/btn_create_store'))
//luu file excel

WebUI.delay(10)
//def myUrl = WebUI.getUrl()
//println("test url ne" + myUrl)
////def myContents = myUrl.split("/")[4]
////println("cat text " + myContents)
////String storeName = WebUI.getText(myUrl)
//String result = myUrl
//CustomKeywords.'SaveStoreCreated.saveDataStore'(result)
//CustomKeywords.'flashify.writeExcell.writeExcellFile'(path_excell)
//println("in ket qua xem thu coi" + result)

WebUI.closeBrowser()






