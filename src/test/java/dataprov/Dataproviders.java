package dataprov;

import org.testng.annotations.DataProvider;

import utilities.ExcelReader;


public class Dataproviders {
	static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+
			"\\src\\test\\resources\\excel\\testdata.xlsx");
	static String sheetName = "TestTesting";
	@DataProvider(name="excelData")
	public static Object[][] getDataFromExcel(){
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		for (int rowNum=2; rowNum <= rows;rowNum++) {
			for (int colNum=0;colNum<cols;colNum++) {
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}			
		}
		return data;
	}
}

