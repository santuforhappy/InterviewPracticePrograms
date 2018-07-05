package samplepackage;

import java.util.AbstractMap;
import java.util.TreeMap;

public class ExampleTreeList {

	public static void treemaplistMethod(AbstractMap<String, String> map1){
		
		String[] x = {"India","Australia","Aussis","Bher","Bhea"};
		for(String t:x){
			map1.put(t, t);
		}
		for(String t:map1.keySet()){
			System.out.println(t+" ");
		}
	}
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String,String>();
		treemaplistMethod(map);

	}

}
