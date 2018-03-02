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

WebUI.setViewPortSize(1280, 768)

WebUI.navigateToUrl('https://meetingmarket-iut.de/suche/?dest=berlin&firstday=20180217&dur=1&so=2&rc_1=1&sr_1=false&rp1_1=10&rs1_1=Block&lob=1&lng=de-DE&ccur=EUR')

WebUI.click(findTestObject('Booking/Page_Suchergebnisse - meetingmarket/div_hotel_img first active'))

WebUI.delay(3)

hotelname = WebUI.getText(findTestObject('Booking/Page_Wyndham Garden Berlin Mitte in/span_Wyndham Garden Berlin Mit'))

WebUI.click(findTestObject('Booking/Page_Wyndham Garden Berlin Mitte in/a_Tagesbersicht'))

totalprice = WebUiBuiltInKeywords.getText(findTestObject('Booking/Page_Wyndham Garden Berlin Mitte in/td_69000'))

WebUI.click(findTestObject('Booking/1 und 1 webmail/span_Reservieren'))

WebUI.delay(3)

getdate = WebUiBuiltInKeywords.getText(findTestObject('Booking/Page_Schritt 1 Checkout - Hotel Art/getdate'))

WebUI.setText(findTestObject('Booking/Page_Schritt 1 Checkout - Hotel Art/input_InputEmail'), 'test@test.de')

WebUI.click(findTestObject('Booking/Page_Schritt 1 Checkout - Hotel Art/a_Weiter'))

WebUI.setText(findTestObject('Booking/Page_Schritt 1 Checkout - Hotel Art/input_InputFirstname'), 'test autom')

WebUI.setText(findTestObject('Booking/Page_Schritt 1 Checkout - Hotel Art/input_InputLastname'), 'test')

WebUI.setText(findTestObject('Booking/Page_Schritt 1 Checkout - Hotel Art/input_InputPhone'), '123456')

WebUI.setText(findTestObject('Booking/Page_Schritt 1 Checkout - Hotel Art/textarea_InputComment'), 'test')

WebUI.click(findTestObject('Booking/Page_Schritt 1 Checkout - Hotel Art/a_Weiter_1'))

WebUI.setText(findTestObject('Booking/Page_Schritt 2 Checkout - Hotel Art/input_InputCompany'), 'test')

WebUI.setText(findTestObject('Booking/Page_Schritt 2 Checkout - Hotel Art/input_AddressFormControlInputA'), 'test')

WebUI.setText(findTestObject('Booking/Page_Schritt 2 Checkout - Hotel Art/input_AddressFormControlInputA_1'), 'test')

WebUI.setText(findTestObject('Booking/Page_Schritt 2 Checkout - Hotel Art/input_AddressFormControlInputP'), '12345')

WebUI.setText(findTestObject('Booking/Page_Schritt 2 Checkout - Hotel Art/input_AddressFormControlInputC'), 'Freiburg')

WebUI.sendKeys(findTestObject('Booking/Page_Schritt 2 Checkout - Hotel Art/input_AddressFormControlInputC'), Keys.chord(
        Keys.TAB))

WebUI.sendKeys(findTestObject('Booking/Page_Schritt 2 Checkout - Hotel Art/input_InputTcs'), Keys.chord(Keys.SPACE))

WebUI.delay(2)

WebUI.click(findTestObject('Booking/Page_Schritt 2 Checkout - Hotel Art/a_Reservierung jetzt abschliee'))

WebUI.closeBrowser()

WebUI.openBrowser('https://webmailer.1und1.de/')

WebUI.setViewPortSize(1280, 768)

WebUiBuiltInKeywords.delay(15)

WebUI.setText(findTestObject('Booking/1 und 1 webmail/input_username'), 'testautomation@meetingmarket.de')

WebUI.setText(findTestObject('Booking/1 und 1 webmail/input_password'), 'TestAutoMatiSierung1984')

WebUI.click(findTestObject('Booking/1 und 1 webmail/button_Login'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.delay(10)

WebUiBuiltInKeywords.click(findTestObject('Booking/1 und 1 webmail/span_TESTSERVER Besttigen Sie'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Booking/1 und 1 webmail/h3_Hallo Test Autom Test'), 0)

WebUI.click(findTestObject('Booking/1 und 1 webmail/a_Reservierung jetzt besttigen'))

WebUI.switchToWindowTitle('Reservierung bestätigt - meetingmarket-iut.de', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Booking/1 und 1 webmail/h2_Ihre Reservierung ist abges'), 0)

WebUI.closeBrowser()

WebUiBuiltInKeywords.delay(15)

WebUI.openBrowser('https://webmailer.1und1.de/')

WebUI.setViewPortSize(1280, 768)

WebUiBuiltInKeywords.delay(1)

WebUI.setText(findTestObject('Booking/1 und 1 webmail/input_username'), 'testautomation@meetingmarket.de')

WebUI.setText(findTestObject('Booking/1 und 1 webmail/input_password'), 'TestAutoMatiSierung1984')

WebUI.click(findTestObject('Booking/1 und 1 webmail/button_Login'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.delay(10)

WebUiBuiltInKeywords.click(findTestObject('Booking/Page_11 Mail Business Testserver Ma/span_TESTSERVER Reservierung a'))

WebUiBuiltInKeywords.click(findTestObject('Booking/Page_11 Mail Business Testserver Ma/span_1 Anhang'))

WebUiBuiltInKeywords.click(findTestObject('Booking/Page_11 Mail Business Testserver Ma/a_Reservierung_MM00008934.pdf'))

WebUiBuiltInKeywords.click(findTestObject('Booking/Page_11 Mail Business Testserver Ma/a_Ansicht'))

WebUI.verifyTextPresent(hotelname, false)

WebUiBuiltInKeywords.delay(3)

WebUI.verifyTextPresent(totalprice, false)

WebUI.verifyTextPresent(getdate, false)

WebUiBuiltInKeywords.click(findTestObject('Booking/1 und 1 webmail/close'))

WebUI.click(findTestObject('Booking/1 und 1 webmail/Page_11 Mail Basic Posteingang/span_TESTSERVER Booking'))

WebUI.verifyTextPresent(hotelname, false)

WebUI.verifyTextPresent('test autom', false)

WebUiBuiltInKeywords.click(findTestObject('Booking/1 und 1 webmail/Page_11 Mail Basic Posteingang/span_TESTSERVER BUCHUNG 21.02.'))

WebUI.verifyTextPresent(hotelname, false)

WebUI.verifyTextPresent(getdate, false)

WebUiBuiltInKeywords.closeBrowser()

