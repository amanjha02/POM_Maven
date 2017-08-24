package ExcelReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {
	public String path;
	public File file;
	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	public Excel_Reader(String path) {
		this.path=path;
		try {
			 file=new File(path);
			 fis=new FileInputStream(file);
			 workbook=new XSSFWorkbook(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getCellData(String sheetName,String columnNum,int RowNum) {
		try {
			int col_num=0;
			int index=workbook.getSheetIndex(sheetName);
			sheet=workbook.getSheetAt(index+1);
			row=sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				if(row.getCell(i).getStringCellValue().equals(columnNum)) {
					col_num=i;
				}
			}
			row=sheet.getRow(RowNum-1);
		cell=row.getCell(col_num);
		if(cell.getCellType()==Cell.CELL_TYPE_STRING) {
			return cell.getStringCellValue();
		}else if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC) {
			return  String.valueOf(cell.getNumericCellValue());
			
		}else if (cell.getCellType()==Cell.CELL_TYPE_BOOLEAN ){
			return  String.valueOf(cell.getNumericCellValue());
			
		}else if(cell.getCellType()==Cell.CELL_TYPE_BLANK) {
			return  String.valueOf(cell.getNumericCellValue());
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public int rowCount(String sheetName){
		try{
		int index=workbook.getSheetIndex(sheetName);
		if(index== -1){
			return 0;
		}else{
			sheet=workbook.getSheetAt(index);
		int number=sheet.getLastRowNum();
		return number+1;
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public int getcolumnCount(String sheetname){
		try{
	
		int index=workbook.getSheetIndex(sheetname);
		if(index== -1){
			return 0;
		}else{
			sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(0);
		return row.getLastCellNum();
		}
		}
		catch(Exception e){
			e.printStackTrace();
		
		}
		return 0;
		
	}
	
	public String getCellData(String sheetName,int columnNum,int RowNum) {
		try {
			int col_num=0;
			int index=workbook.getSheetIndex(sheetName);
			sheet=workbook.getSheetAt(index);
			// XSSFRow row=sheet.getRow(0);
			row=sheet.getRow(RowNum-1);
		XSSFCell cell=row.getCell(columnNum);
		if(cell.getCellType()==Cell.CELL_TYPE_STRING) {
			return cell.getStringCellValue();
		}else if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC) {
			return  String.valueOf(cell.getNumericCellValue());
			
		}else if (cell.getCellType()==Cell.CELL_TYPE_BOOLEAN ){
			return  String.valueOf(cell.getNumericCellValue());
			
		}else if(cell.getCellType()==Cell.CELL_TYPE_BLANK) {
			return  String.valueOf(cell.getNumericCellValue());
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\TestData\\DataEngine.xlsx";
		Excel_Reader ex=new Excel_Reader(path);
	//System.out.println(	ex.getCellData("TestSteps", "Description", 3));
	System.out.println(ex.rowCount("Sheet1"));
	System.out.println(ex.getcolumnCount("Sheet1"));
	System.out.println(ex.getCellData("Sheet1", 1, 2));
		
	}
}
