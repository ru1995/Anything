package SeleniumDemo;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;

public class aapache_read_excl {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("E:\\aapeche.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("sheet1");
		
		int rowcount = sh.getPhysicalNumberOfRows();
		
		
		Row firstrow = sh.getRow(0);
		
		int colcount = firstrow.getLastCellNum();
		
		for (int row = 0; row < rowcount; row++) {
			for (int col = 0; col < colcount; col++) {
				Cell c1 = sh.getRow(row).getCell(col);
				System.out.print(c1);
				
			}
			
		}


	

}}
