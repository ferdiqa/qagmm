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

WebUiBuiltInKeywords.delay(2)

WebUI.click(findTestObject('global action/Page_Suchergebnisse - meetingmarket/a_Verstanden'), FailureHandling.OPTIONAL)

WebUiBuiltInKeywords.click(findTestObject('Detailpage/h6_Hotel Art Nouveau'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_ButtonClose'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/span_Victors Residenz-Hotel Be'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/p_Am Friedrichshain 17 - 10407'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/span_Karte anzeigen'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/p_1113 verifizierte Bewertunge'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_HotelHeaderImage'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/h3_Konfigurieren Sie Ihr Event'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/span_Ihr Gesamtpreis'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_Ich suche'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_HotelHeaderImage'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/span_55940'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/span_55940'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/span_Kostenbersicht'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/span_Leistungsbersicht'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/span_Reservieren'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_Ihr Gesamtpreis'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/p_Jetzt reservieren spter zahl'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/p_Alle  Stornobedingungen  im'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/p_Expedia erhebt keine Reservi'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_Angebot per E-Mail versenden'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_Merken'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_Link kopieren'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/h3_Ihr Event im Detail'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_Tagungsrume'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_Am Volkspark Friedrichshai'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/h3_Bildergalerie'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_Bildergalerie'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/h3_Auf einen Blick'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_Ausstattung'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_Bewertungen'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_Allgemeine Ausstattung'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_Zimmerausstattung'), 0, FailureHandling.OPTIONAL)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_Deutsch'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/h3_Richtlinien'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/p_Es gelten die Allgemeinen Ge'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_Deutsch'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_ Euro'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_Kontakt'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_Fragen  Antworten'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_KontaktFragen  AntwortenSo'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_ber uns'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_Hotel eintragen'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/a_Impressum'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Detailpage/div_2018 Meeting.Expedia.de -'), 0)

WebUiBuiltInKeywords.closeBrowser()

