package javaProgram_ExcellReading;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import jxl.write.Number;
public class Excel_Reading {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f = new File("E:\\MindQ\\JavaProgramms_Practice\\Tempfile.xls");
		Workbook rwb = Workbook.getWorkbook(f);
		Sheet rws = rwb.getSheet(0);
		int nuor = rws.getRows();
		WritableWorkbook wwb = Workbook.createWorkbook(f,rwb);
		WritableSheet wsh = wwb.getSheet(0);
		
		for(int i=1;i<nuor;i++)
		{
			int x = Integer.parseInt(rws.getCell(0,i).getContents());
			int y = Integer.parseInt(rws.getCell(1, i).getContents());
			int z = x+y;
			Number n = new Number(2, i, z);
			wsh.addCell(n);
		}
		wwb.write();
		rwb.close();
		wwb.close();
	}

}
