package dataDrivendemo;

import actionKeyword.ActionKeywords;
import utilies.ExelUtilites;

public class DriverScript {

	public static void main(String[] args) throws Exception
	{
		 String sPath = "E:\\selenium\\KeywordDriven\\src\\projectKeywordDriven\\DataDriven.xlsx";
		 
	     // Here we are passing the Excel path and SheetName as arguments to connect with Excel file 
	     ExelUtilites.setExcelFile(sPath, "Sheet1");
	 
	     //Hard coded values are used for Excel row & columns for now
	     //In later chapters we will replace these hard coded values with varibales
	     //This is the loop for reading the values of the column 3 (Action Keyword) row by row
	     for (int iRow=2;iRow<=6;iRow++){
	     //Storing the value of excel cell in sActionKeyword string variable
	     String sActionKeyword = ExelUtilites.getCellData(iRow, 3);
	 
	     //Comparing the value of Excel cell with all the project keywords
	     if(sActionKeyword.equals("openBrowser")){
	     //This will execute if the excel cell value is 'openBrowser'
	     //Action Keyword is called here to perform action
	     ActionKeywords.openBrowser();}
	     else if(sActionKeyword.equals("navigate")){
	     ActionKeywords.navigate();}
	     else if(sActionKeyword.equals("Input_Username")){
	     ActionKeywords.Input_Username();}
	     else if(sActionKeyword.equals("Input_password")){
	     ActionKeywords.Input_password();}
	     else if(sActionKeyword.equals("click_login")){
	     ActionKeywords.click_login();}
	     }
	}


}
