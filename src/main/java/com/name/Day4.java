package com.name;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Day4 {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\Priya\\excel\\Petstore.xlsx");
		
		 FileInputStream fis= new FileInputStream(f);
	       
	        Workbook wb= new XSSFWorkbook(fis);
	       
	       // Sheet sheetName = wb.getSheet("write");
	       
	        Sheet sheetName = wb.getSheet("read");
	        
	        //Row firstRow = sheetName.createRow(0);
	       
	        //Cell firstCell= firstRow.createCell(0);
	        
	       /*
	        Row firstRow = sheetName.getRow(0);
	        Cell firstCell= firstRow.getCell(0);
	        */
	        
	        Row firstRow = sheetName.getRow(1);
	        
	        Cell firstCell= firstRow.getCell(1);
	        
	     
	        
	        //firstCell.setCellValue("12345");
	        
	        
	        
	        //firstCell.setCellValue("Hello");
	        
	        fis.close();
	       
	        //FileOutputStream fos= new FileOutputStream(f);
	       
	        //wb.write(fos);
	       
	        //fos.close();
	       
	        System.out.println("Excel Updated");
	}

}
