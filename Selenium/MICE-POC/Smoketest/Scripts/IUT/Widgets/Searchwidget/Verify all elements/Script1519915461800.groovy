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

WebUI.openBrowser('https://meetingmarket-iut.de/Widgets/configuration/default.aspx?widgetType=search')

WebUI.setViewPortSize(1280, 1280)

WebUI.setText(findTestObject('Widgets/Page_Administration Agents/input_InputEmail'), 'test@medial.net')

WebUI.setText(findTestObject('Widgets/Page_Administration Agents/input_InputPassword'), '123456')

WebUI.click(findTestObject('Widgets/Page_Administration Agents/input_ctl03'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/div_1 Raum'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/div_1 Tag'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/div_Alle Regionen'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/div_spanAlle RegionenspanspanA'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/div_Suchen'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/h2_Jetzt Tagungsraum suchen ve'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/input_InputEventPersons'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/label_02.03.2018'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/span_Anzahl Rume'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/span_Datum'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/span_Personen'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/span_Stadtwhlen'), 0)

WebUI.verifyElementPresent(findTestObject('Widgets/Searchwidget/span_Zeitraum'), 0)

WebUI.closeBrowser()

