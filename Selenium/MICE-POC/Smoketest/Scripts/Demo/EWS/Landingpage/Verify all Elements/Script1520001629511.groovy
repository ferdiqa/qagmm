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

WebUI.openBrowser('http://meetingmarket-demo.de/')

WebUI.setViewPortSize(1280, 768)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_logo'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_ber 2.500 Tagungsrume'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Jetzt buchen und bis zu 30'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_BerlinBremenDresdenDsseldo'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/p_Sichere Reservierung in 3 Mi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/p_Persnliche Beratung 49 (0)76'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/p_Kostenfreie Stornierung'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/h2_Finden Sie die perfekte Loc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/p_Wir finden die passenden Rum'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Berli'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Breme'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Dresd'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Dssel'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Frank'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Hambu'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Leipz'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein KlnKl'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Hanno'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Mannh'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Mnche'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Nrnbe'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Stutt'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Veranstaltungsortein Potsd'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/span_Bekannt aus'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/span_logos'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/span_logos_1'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_Deutsch'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_ Euro'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/a_Kontakt'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/a_Fragen  Antworten'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/a_So funktionierts'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/a_ber uns'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/a_Hotel eintragen'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/a_Impressum'), 0)

WebUI.verifyElementPresent(findTestObject('Landingpage/Page_Tagungshotels und Meetingrume/div_2018 Meeting.Expedia.de -'), 
    0)

WebUiBuiltInKeywords.closeBrowser()

