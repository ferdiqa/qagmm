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

WebUI.setViewPortSize(1280, 768)

WebUiBuiltInKeywords.delay(5)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/span_Ich suche'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/a_Tagungsraum mit bernachtung'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/a_Tagungsraum ohne bernachtung'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/span_Ort und Termin'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/div_Berlin'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/input_f-date'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/div_1 Tag'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/span_Rume'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/div_1 Raum'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/input_members'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/div_Block'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/div_1 Tag'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/a_Ausstattung'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/div_TippKonfigurieren Sie Auss'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/span_Verpflegung'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/label_Unbegrenzt Kaffee und Te'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/label_Snack  Imbiss'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/label_Mittagessen'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/a_Mehr'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/span_Extras'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/label_Pausen-  Gruppenraum'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Resultpage/div_Weniger Leistungen'), 0)

WebUiBuiltInKeywords.closeBrowser()

