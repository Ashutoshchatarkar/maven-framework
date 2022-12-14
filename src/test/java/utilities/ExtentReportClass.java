package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import actions.Actionsclass;

public class ExtentReportClass  {
		
		public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static ExtentTest test;
		
		public static void setExtent() {
			Actionsclass act=new Actionsclass();
			
			htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/Report/"+"MyReport_"+act.getCurrentTime()+".html");
			//htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/Report/"+"MyReport.html");
			//htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
			htmlReporter.config().setDocumentTitle("Automation Test Report");
			htmlReporter.config().setReportName("OrangeHRM Test Automation Report");
			htmlReporter.config().setTheme(Theme.DARK);
			
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			extent.setSystemInfo("HostName", "MyHost");
			extent.setSystemInfo("ProjectName", "MyStoreProject");
			extent.setSystemInfo("Tester", "Hitendra");
			extent.setSystemInfo("OS", "Win10");
			extent.setSystemInfo("Browser", "Chrome");
		}
		public static void endReport() {
			extent.flush();
		}		

}




