package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_Particular_Cell {

	public static void particular_cell_data() throws IOException {
		
		File f = new File("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Demo Data Driven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(8);
		
		Cell c = r.getCell(1);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			String value = c.getStringCellValue();
			System.out.println(value);
			
		}
		else if (type.equals(CellType.NUMERIC)) {
			
			double d = c.getNumericCellValue();
			
			int a = (int) d;
			
			String valueOf = String.valueOf(a);
			System.out.println(valueOf);
			
		}
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		particular_cell_data();
	}
	
	
}
