/**
 * 
 */
package com.mindtree.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.mindtree.stepdef.AddToCartStepDef;
import com.mindtree.stepdef.RegistrationStepDef;
import com.mindtree.tests.TestBase;

 
public  class TestUtility extends TestBase {

	public static String takeScreenshot(WebDriver driver,String screenshot) {
		 String path="";
		try {
			TakesScreenshot snapshot=(TakesScreenshot)driver;
			 File file=snapshot.getScreenshotAs(OutputType.FILE);
			 SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
			 path = System.getProperty("user.dir")+screenshot+"/Screenshot"  +dateFormat.format(new Date())+".png";
			 File pathvar=new File(path);
			 FileUtils.copyFile(file,pathvar);
		} catch (WebDriverException e) {
			 System.err.println("failing here"+e.getMessage());
		} catch (IOException e) {
			 System.err.println("failing here"+e.getMessage());
		}
		return path;
		
	}
	public static void  ReadExcelProperties() throws Exception {
		 File excel=new File(System.getProperty("user.dir")+"\\src\\main\\java\\testData\\controller.xlsx");
		 FileInputStream input=new FileInputStream(excel);
		 XSSFWorkbook workbook=new XSSFWorkbook(input);
		 XSSFSheet sheet=workbook.getSheet("Sheet1");
		      //creating a Sheet object to retrieve object  
	      
		 Map<String ,String> fetchedData=new LinkedHashMap<String ,String>();
		 int rows=sheet.getPhysicalNumberOfRows();
		 System.out.println(rows);
		 RegistrationStepDef.userId=sheet.getRow(0).getCell(1).getStringCellValue();
		 RegistrationStepDef.newPassword=sheet.getRow(1).getCell(1).getStringCellValue();
		 RegistrationStepDef.confirmPasword=sheet.getRow(2).getCell(1).getStringCellValue();
		 AddToCartStepDef.firstName= RegistrationStepDef.firstName=sheet.getRow(3).getCell(1).getStringCellValue();
		 AddToCartStepDef.lastName= RegistrationStepDef.lastName=sheet.getRow(4).getCell(1).getStringCellValue();
		 RegistrationStepDef.email=sheet.getRow(5).getCell(1).getStringCellValue();
		 long phone=(long)sheet.getRow(6).getCell(1).getNumericCellValue();
		 RegistrationStepDef.phone=""+phone;
		 AddToCartStepDef.address1= RegistrationStepDef.address1=sheet.getRow(7).getCell(1).getStringCellValue();
		 AddToCartStepDef.address2= RegistrationStepDef.address2=sheet.getRow(8).getCell(1).getStringCellValue();
		 AddToCartStepDef.city= RegistrationStepDef.city=sheet.getRow(9).getCell(1).getStringCellValue();
		 AddToCartStepDef.state= RegistrationStepDef.state=sheet.getRow(10).getCell(1).getStringCellValue();
		 int zipcode=(int)sheet.getRow(11).getCell(1).getNumericCellValue();
		 AddToCartStepDef.zip= RegistrationStepDef.zip=""+zipcode;
		 AddToCartStepDef.country=RegistrationStepDef.country=sheet.getRow(12).getCell(1).getStringCellValue();
		 RegistrationStepDef.languuagePreference=sheet.getRow(13).getCell(1).getStringCellValue();
		 RegistrationStepDef.favouritecategoey =sheet.getRow(14).getCell(1).getStringCellValue();
		 

				 
         

}
}
