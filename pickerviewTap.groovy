package pickerviewPackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.touch.TouchActions
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.Dimension
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.ios.IOSDriver

class pickerviewTap {

	AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()


	@Keyword
	def tapPickerview_mobile(){
		MobileElement ele1 = driver.findElementByClassName("XCUIElementTypePickerWheel")
		ele1.sendKeys("東京都");
	}
	/**
	 @Keyword
	 def tapUIImagePicker_mobile(){
	 MobileElement ele2 = driver.findElementByClassName("XCUIElementTypeTable")
	 int x1 = ele2.getCenter().getX()
	 int y1 = ele2.getCenter().getY()
	 println("###########")
	 println("X is " + x1)
	 println("####### ")
	 println("Y is " + y1)
	 //element(by.type('XCUIElementTypeTable')).tapAtPoint({ x: 50, y: 200 })
	 //new TouchAction((MobileDriver) driver).tap(ele2).perform();
	 //new TouchAction((MobileDriver) driver).tap(x1+100, y1-50).perform();
	 //List imageTable = driver.findElementsByClassName("XCUIElementTypeTable")
	 //println("size is " + imageTable.size())
	 }
	 */
	@Keyword
	def tap_element(){

		MobileElement ele = driver.findElementByXPath("//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[6]/XCUIElementTypeImage[1][count(. | //*[@type = 'XCUIElementTypeImage']) = count(//*[@type = 'XCUIElementTypeImage'])]")
		new TouchAction((MobileDriver) driver).tap(ele).perform();
	}
	@Keyword
	@Keyword
	def swipe_webview (){
		MobileElement webEle = driver.findElementByClassName("XCUIElementTypeWebView")
		switchToWebView();
		Dimension size = webEle.getSize()
		//new TouchAction(driver).press( size.width / 2, size.height ).waitAction(2000).moveTo(size.width / 2, size.height / 2).release().perform()
		//new TouchAction((MobileDriver) driver).tap(webEle).perform();WebUI.dragAndDropByOffset(findTestObject(by.xpath('XCUIElementTypeWebView'), -50, -300)
		//new TouchAction((MobileDriver) driver).tap
	}

	public boolean switchToWebView() {
		sleep(5); //give time to load
		for(Object context : driver.getContextHandles()) {
			System.out.println("Context Name is " + context.toString());
			if(context.toString().contains("WEBVIEW")){
				driver.context(context.toString());
				return true;
			}
		}
		return false;
	}
	@Keyword
	def swipe_webview_real (){
		MobileElement webEle1 = driver.findElementByClassName("XCUIElementTypeWebView")
		switchToWebView();
		Dimension size1 = webEle1.getSize()
		new TouchAction(driver).press( size1.width / 2, size1.height ).waitAction(2000).moveTo(size1.width / 2, size1.height / 2).release().perform()
		//Mobile.scrollToPosition(300, 100)
		//new TouchAction((MobileDriver) driver).tap(webEle).perform();
	}
}