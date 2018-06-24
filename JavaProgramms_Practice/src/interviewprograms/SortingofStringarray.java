package interviewprograms;

import java.util.Map;
import java.util.TreeMap;

public class SortingofStringarray {

	public static void main(String[] args) {
		
		String arr[] = {"WW20","W10","AA05","AB05"};
//		for(int i=0;i<arr.length;i++){
//			for(int j=i+1;j<arr.length;j++){
//				if(arr[i].charAt(0)>arr[j].charAt(0))
//				{
//					String temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		for(String s:arr){
//			System.out.println(s);
//		}
		Map<String,String> map = new TreeMap<String,String>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i], "test"); 
		}
		for(Map.Entry<String, String> enty:map.entrySet())
		{
			System.out.println(enty.getKey());
		}
	
	}

}
