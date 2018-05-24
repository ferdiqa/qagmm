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

WebUI.setViewPortSize(1280, 1280)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/div_Berlin'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/li_Frankfurt am Main'))

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/span_Vor'))

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/a_1'))

WebUI.click(findTestObject('Landingpage/Searchbar_LP/li_2 Tage'))

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/input_InputEventPersons'))

WebUiBuiltInKeywords.setText(findTestObject('Landingpage/Searchbar_LP/input_InputEventPersons'), '20')

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Searchbar_LP/div_1 Raum2 Rume3 Rume1 Raum1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landingpage/Searchbar_LP/li_2 Rume'))

WebUI.click(findTestObject('Landingpage/Searchbar_LP/div_Suchen'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/div_Frankfurt am Main'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/div_2 Tage'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/div_2 Rume'), 0)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/result text'), 
    0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/some hotels'), 
    0)

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/backtolp'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_ber 2.500 Tagungsrume'), 
    0)

WebUiBuiltInKeywords.closeBrowser()

