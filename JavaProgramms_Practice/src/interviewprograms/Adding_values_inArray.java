package interviewprograms;

import java.util.ArrayList;

public class Adding_values_inArray {
	
	String[] temp = new String[5];
	ArrayList<String> listArrray = new ArrayList<>();
	public void addingValuepredefindarray(String temp1[])
	{
		for(int i=0;i<temp1.length;i++)
		{
			temp[i]=temp1[i];
		}
		for(int i =0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}
	public void addingvalueArrayList(ArrayList<String> a)
	{
		for(int i=0;i<a.size();i++){
			listArrray.add(a.get(i));
		}
		for(String s:listArrray)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
			Adding_values_inArray array= new Adding_values_inArray();
			ArrayList<String> tst = new ArrayList<String>();
			tst.add("Sa");
			tst.add("nt");
			tst.add("oh");
			String[] x = {"na","ve","en","Ku","ma"};
			array.addingvalueArrayList(tst);
			array.addingValuepredefindarray(x);
	}

}
