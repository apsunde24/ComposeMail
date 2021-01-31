
//package com.example.tests;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ComposeMail {
  public WebDriver driver;
  public String baseUrl;
  public boolean acceptNextAlert = true;
  public StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\my_coding_repor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   // baseUrl = "https://www.google.com/";
    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//*[@id=\'gbw\']/div/div/div[1]/div[1]/a")).click();
    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   // driver.switchTo().window("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("abc@gmail.com");
    driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/div[2]")).click();
    driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("abc");
    driver.findElement(By.xpath("//*[@id=\'passwordNext\']/div/button/div[2]")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test 
  // all the compose mail testcases of send, save to draft, cancel, attachment,
  //delete , To, CC, BCC,Subject Body  are implemented in same @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://mail.google.com/mail/u/0/h/44rpzkt0ocwc/?zy=e&f=1");
    driver.findElement(By.linkText("Compose Mail")).click();
    driver.findElement(By.id("to")).click();
    driver.findElement(By.id("to")).clear();
    driver.findElement(By.id("to")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.id("cc")).click();
    driver.findElement(By.id("cc")).clear();
    driver.findElement(By.id("cc")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.name("subject")).click();
    driver.findElement(By.name("subject")).clear();
    driver.findElement(By.name("subject")).sendKeys("test");
    driver.findElement(By.name("body")).click();
    driver.findElement(By.name("body")).clear();
    driver.findElement(By.name("body")).sendKeys("test");
    driver.findElement(By.name("file0")).click();
    driver.findElement(By.name("file0")).clear();
    driver.findElement(By.name("file0")).sendKeys("C:\\Resume\\2_4Y Exp_snehal _TestEngg..doc");
    driver.findElement(By.name("nvp_bu_amf")).click();
    driver.findElement(By.name("file2")).click();
    driver.findElement(By.name("file2")).clear();
    driver.findElement(By.name("file2")).sendKeys("C:\\Resume\\2Y Experience_snehal - TestEngg.doc");
    driver.findElement(By.name("file3")).click();
    driver.findElement(By.name("file3")).clear();
    driver.findElement(By.name("file3")).sendKeys("C:\\Resume\\Cover Letter_snehal.docx");
    driver.findElement(By.name("file4")).click();
    driver.findElement(By.name("file4")).clear();
    driver.findElement(By.name("file4")).sendKeys("C:\\Resume\\PROFILE_SUMMARY.txt");
    driver.findElement(By.name("file5")).click();
    driver.findElement(By.name("file5")).clear();
    driver.findElement(By.name("file5")).sendKeys("C:\\Resume\\QA-2Y_Exp_snehal - TestEngg.pdf");
    driver.findElement(By.name("file6")).click();
    driver.findElement(By.name("file6")).clear();
    driver.findElement(By.name("file6")).sendKeys("C:\\Resume\\roles.txt");
    driver.findElement(By.name("file7")).click();
    driver.findElement(By.name("file7")).clear();
    driver.findElement(By.name("file7")).sendKeys("C:\\Resume\\snehal.jpeg");
    driver.findElement(By.xpath("(//input[@name='nvp_bu_done'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='attach'])[7]")).click();
    driver.findElement(By.xpath("(//input[@name='attach'])[7]")).click();
    driver.findElement(By.name("nvp_bu_amf")).click();
    driver.findElement(By.name("file8")).click();
    driver.findElement(By.name("file8")).clear();
    driver.findElement(By.name("file8")).sendKeys("C:\\Resume\\spatil.jpg");
    driver.findElement(By.xpath("(//input[@name='nvp_bu_canc'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='nvp_bu_send'])[2]")).click();
    driver.findElement(By.linkText("Sent Mail")).click();
    driver.findElement(By.xpath("//a/span")).click();
    driver.findElement(By.linkText("« Back to Sent Mail")).click();
    driver.findElement(By.linkText("Compose Mail")).click();
    driver.findElement(By.id("to")).click();
    driver.findElement(By.id("to")).clear();
    driver.findElement(By.id("to")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.id("cc")).click();
    driver.findElement(By.id("cc")).clear();
    driver.findElement(By.id("cc")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.id("bcc")).click();
    driver.findElement(By.id("bcc")).clear();
    driver.findElement(By.id("bcc")).sendKeys("te");
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.id("bcc")).click();
    driver.findElement(By.id("bcc")).clear();
    driver.findElement(By.id("bcc")).sendKeys("test@test.com");
    driver.findElement(By.name("subject")).click();
    driver.findElement(By.name("subject")).clear();
    driver.findElement(By.name("subject")).sendKeys("test mail");
    driver.findElement(By.name("body")).click();
    driver.findElement(By.name("body")).clear();
    driver.findElement(By.name("body")).sendKeys("save to draft");
    driver.findElement(By.xpath("(//input[@name='nvp_bu_sd'])[2]")).click();
    driver.findElement(By.linkText("Drafts (1)")).click();
    driver.findElement(By.xpath("//span/font[2]")).click();
    driver.findElement(By.name("nvp_bu_send")).click();
    driver.findElement(By.linkText("Compose Mail")).click();
    driver.findElement(By.id("to")).click();
    driver.findElement(By.id("to")).clear();
    driver.findElement(By.id("to")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.id("cc")).click();
    driver.findElement(By.id("cc")).clear();
    driver.findElement(By.id("cc")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.xpath("//tr[3]/td[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //tr[3]/td[2] | ]]
    driver.findElement(By.id("bcc")).click();
    driver.findElement(By.id("bcc")).clear();
    driver.findElement(By.id("bcc")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.name("subject")).click();
    driver.findElement(By.name("subject")).clear();
    driver.findElement(By.name("subject")).sendKeys("test mail");
    driver.findElement(By.name("body")).click();
    driver.findElement(By.name("body")).clear();
    driver.findElement(By.name("body")).sendKeys("test");
    driver.findElement(By.xpath("(//input[@name='nvp_bu_d'])[2]")).click();
    driver.findElement(By.linkText("Compose Mail")).click();
    driver.findElement(By.id("to")).click();
    driver.findElement(By.id("to")).clear();
    driver.findElement(By.id("to")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.id("cc")).click();
    driver.findElement(By.id("cc")).click();
    driver.findElement(By.id("cc")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=cc | ]]
    driver.findElement(By.id("cc")).clear();
    driver.findElement(By.id("cc")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.id("bcc")).click();
    driver.findElement(By.id("bcc")).clear();
    driver.findElement(By.id("bcc")).sendKeys("te");
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.id("bcc")).click();
    driver.findElement(By.id("bcc")).clear();
    driver.findElement(By.id("bcc")).sendKeys("tees@test.com");
    driver.findElement(By.name("subject")).click();
    driver.findElement(By.name("subject")).clear();
    driver.findElement(By.name("subject")).sendKeys("test mail");
    driver.findElement(By.name("body")).click();
    driver.findElement(By.name("body")).clear();
    driver.findElement(By.name("body")).sendKeys("test mail");
    driver.findElement(By.xpath("(//input[@name='nvp_bu_sd'])[2]")).click();
    driver.findElement(By.linkText("Drafts (1)")).click();
    driver.findElement(By.xpath("//span/font[2]")).click();
    driver.findElement(By.name("nvp_bu_dd")).click();
    driver.findElement(By.linkText("Compose Mail")).click();
    driver.findElement(By.id("to")).click();
    driver.findElement(By.id("to")).clear();
    driver.findElement(By.id("to")).sendKeys("tets@test.com");
    driver.findElement(By.id("cc")).click();
    driver.findElement(By.id("cc")).clear();
    driver.findElement(By.id("cc")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.id("bcc")).click();
    driver.findElement(By.id("bcc")).clear();
    driver.findElement(By.id("bcc")).sendKeys("\"test\" <test@test.com>,");
    driver.findElement(By.name("subject")).click();
    driver.findElement(By.name("subject")).clear();
    driver.findElement(By.name("subject")).sendKeys("test mail");
    driver.findElement(By.name("body")).click();
    driver.findElement(By.name("body")).clear();
    driver.findElement(By.name("body")).sendKeys("test mail");
    driver.findElement(By.xpath("(//input[@name='nvp_bu_d'])[2]")).click();
    driver.findElement(By.name("body")).click();
    driver.findElement(By.id("bcc")).click();
    driver.findElement(By.id("bcc")).clear();
    driver.findElement(By.id("bcc")).sendKeys("\"test\" <test@test.com>, ab@test.com");
    driver.findElement(By.id("to")).click();
    driver.findElement(By.linkText("Compose Mail")).click();
    driver.findElement(By.name("nvp_bu_send")).click();
    driver.findElement(By.xpath("//tr[3]/td/table/tbody/tr/td")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
