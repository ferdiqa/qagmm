import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUiBuiltInKeywords.openBrowser('https://meetingmarket-iut.de/suche/')

WebUI.setViewPortSize(1280, 1280)

WebUiBuiltInKeywords.delay(5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/a_LogoLink'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/div_Favoriten'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/div_Navigation'), 0)

WebUiBuiltInKeywords.click(findTestObject('Header/div_Favoriten'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/div_In den Ergebnissen einfach'), 0)

WebUiBuiltInKeywords.click(findTestObject('Header/div_Favoriten'))

WebUiBuiltInKeywords.click(findTestObject('Header/div_Navigation'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/div_close'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/a_Buchungsportal'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/a_Kontakt'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/a_Fragen  Antworten'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/a_So funktionierts'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/a_ber uns'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/a_Impressum'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/a_Datenschutz'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Header/p_49 (0)761  217 15 300'), 0)

WebUiBuiltInKeywords.closeBrowser()

