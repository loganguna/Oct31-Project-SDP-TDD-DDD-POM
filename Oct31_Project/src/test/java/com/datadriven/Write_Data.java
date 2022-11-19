package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	static Logger log = Logger.getLogger(Write_Data.class);
	
	public static void write_data_excel() throws IOException{

		File f = new File("C:\\Users\\RAMBO\\OneDrive\\Desktop\\Write Data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("Write_Data").createRow(0).createCell(0).setCellValue("Name");

		wb.getSheet("Write_Data").getRow(0).createCell(1).setCellValue("Number");

		wb.getSheet("Write_Data").createRow(1).createCell(0).setCellValue("madhan");

		wb.getSheet("Write_Data").getRow(1).createCell(1).setCellValue("56");

		wb.getSheet("Write_Data").createRow(2).createCell(0).setCellValue("ganesh");

		wb.getSheet("Write_Data").getRow(2).createCell(1).setCellValue("67");

		wb.getSheet("Write_Data").createRow(3).createCell(0).setCellValue("stephen");

		wb.getSheet("Write_Data").getRow(3).createCell(1).setCellValue("89");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);
		
		wb.close();

		}
		
		public static void main(String[] args) throws IOException {
			
			BasicConfigurator.configure();
			
			write_data_excel();
			
			log.info("Excel Created Successfully");
		}


}
