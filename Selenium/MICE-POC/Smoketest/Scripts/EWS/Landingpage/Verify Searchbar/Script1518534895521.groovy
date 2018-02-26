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

WebUiBuiltInKeywords.openBrowser('https://meetingmarket-iut.de/')

WebUI.setViewPortSize(1280, 768)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/span_Stadt whlen'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/span_Datum'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/span_Zeitraum'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/span_Personen'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/span_Anzahl Rume'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/div_Berlin'), 0)

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/div_Berlin'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Berlin'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Bremen'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Dresden'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Dsseldorf'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Frankfurt am Main'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Hamburg'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Hannover'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Kln'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Leipzig'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Mannheim'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Mnchen'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Nrnberg'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Potsdam'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Regional-Deutschland'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Stuttgart'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/Datepicker'), 0)

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/Datepicker'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/div_zurckVorFebruar2018MoDiMiD'), 0)

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/div_Bis zu 4 Stunden1 Tag2 Tag'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_Bis zu 4 Stunden'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_1 Tag'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_2 Tage'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_3 Tage'), 0)

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/div_1 Raum2 Rume3 Rume1 Raum1'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_1 Raum'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_2 Rume'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/li_3 Rume'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Searchbar_LP/div_Suchen'), 0)

WebUiBuiltInKeywords.closeBrowser()

