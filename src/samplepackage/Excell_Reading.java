package samplepackage;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;

public class Excell_Reading {

	public static void main(String[] args) throws Exception{
		
		File f = new File("Temp1.xls");
		Workbook w = Workbook.getWorkbook(f);
		
		Sheet s = w.getSheet(0);
		int countofrows = s.getRows();
		for(int i=0;i<countofrows;i++){
			String x = s.getCell(i, 0).getContents();
			System.out.println(x);
			
		}
		
	}

}
