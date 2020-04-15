$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/NopCommerceCustomers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Combining common steps",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "org.openqa.selenium.WebDriverException: Timed out waiting for driver server to start.\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HP\u0027, ip: \u0027172.20.20.20\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u002713.0.2\u0027\nDriver info: driver.version: ChromeDriver\r\n\tat org.openqa.selenium.remote.service.DriverService.waitUntilAvailable(DriverService.java:202)\r\n\tat org.openqa.selenium.remote.service.DriverService.start(DriverService.java:188)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:79)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepDefinitions.NopCommerceSteps.setup(NopCommerceSteps.java:38)\r\nCaused by: org.openqa.selenium.net.UrlChecker$TimeoutException: Timed out waiting for [http://localhost:22658/status] to be available after 20000 ms\r\n\tat org.openqa.selenium.net.UrlChecker.waitUntilAvailable(UrlChecker.java:100)\r\n\tat org.openqa.selenium.remote.service.DriverService.waitUntilAvailable(DriverService.java:197)\r\n\tat org.openqa.selenium.remote.service.DriverService.start(DriverService.java:188)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:79)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepDefinitions.NopCommerceSteps.setup(NopCommerceSteps.java:38)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaHookDefinition.execute(JavaHookDefinition.java:61)\r\n\tat io.cucumber.core.runner.CoreHookDefinition.execute(CoreHookDefinition.java:31)\r\n\tat io.cucumber.core.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:20)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:47)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\nCaused by: java.util.concurrent.TimeoutException\r\n\tat java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)\r\n\tat com.google.common.util.concurrent.SimpleTimeLimiter.callWithTimeout(SimpleTimeLimiter.java:156)\r\n\tat org.openqa.selenium.net.UrlChecker.waitUntilAvailable(UrlChecker.java:75)\r\n\t... 54 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_launches_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_enters_email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_clicks_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks Customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_clicks_Customers_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks Customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_clicks_Customers_menu_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add a new Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User clicks Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_clicks_Add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view Add a new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_can_view_Add_a_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters new customer details",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_enters_new_customer_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks Save buttom",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_clicks_Save_buttom()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_can_view_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:features/NopCommerceLogin.feature");
formatter.feature({
  "name": "NOP Commerce Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_enters_email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_clicks_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Log out link",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.user_clicks_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.NopCommerceSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});