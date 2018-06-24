package javaProgram_ExcellReading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Text_ReadandWrite {

	public static void main(String[] args) throws Exception
	{
		File f1 = new File("E:\\MindQ\\Test1.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		File f2 = new File("Test_Oupt.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		Pattern p = Pattern.compile("[*][0-9]+");
		String l="";
		while((l=br.readLine()) !=null)
		{
			Matcher m = p.matcher(l);
			while(m.find())
			{
				bw.write(m.group());
				bw.newLine();
			}
		}	
		bw.close();
		fw.close();
		fr.close();
		br.close();
	}

}
