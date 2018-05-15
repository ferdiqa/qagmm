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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://meetingmarket-iut.de/Widgets/configuration/default.aspx?widgetType=search')

WebUI.setText(findTestObject('Widgets/Page_Administration Agents/input_InputEmail'), 'test@medial.net')

WebUI.setText(findTestObject('Widgets/Page_Administration Agents/input_InputPassword'), '123456')

WebUI.click(findTestObject('Widgets/Page_Administration Agents/input_ctl03'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Widgets/Searchwidget/div_Alle Regionen'))

WebUI.click(findTestObject('Widgets/Searchwidget/li_Frankfurt am MainLindner Co'))

WebUI.click(findTestObject('Widgets/Searchwidget/label_02.03.2018'))

WebUI.click(findTestObject('Widgets/Searchwidget/span_Vor'))

WebUI.click(findTestObject('Widgets/Searchwidget/a_1'))

WebUI.click(findTestObject('Widgets/Searchwidget/li_2 Tage'))

WebUI.setText(findTestObject('Widgets/Searchwidget/input_InputEventPersons'), '20')

WebUI.click(findTestObject('Widgets/Searchwidget/div_1 Raum'))

WebUI.click(findTestObject('Widgets/Searchwidget/span_2 Rume'))

WebUI.click(findTestObject('Widgets/Searchwidget/div_Suchen'))

WebUiBuiltInKeywords.closeWindowTitle('')

WebUI.switchToWindowTitle('Suchergebnisse - lindner.meetingmarket-iut.de')

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/div_2 Tage'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/div_2 Rume'), 0)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/result text'), 
    0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/some hotels'), 
    0)

WebUiBuiltInKeywords.click(findTestObject('Landingpage/Page_Suchergebnisse - meetingmarket/backtolp'))

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/div_Alle RegionenspanAntwerpen'), 0)

WebUiBuiltInKeywords.closeBrowser()

