package samplepackage;

import java.util.HashMap;

public class ComparingoftwoHashMap {
	
	public boolean temp(){
		try{
		HashMap<String,Integer> hash1 = new HashMap<String,Integer>();
		HashMap<String,Integer> hash2 = new HashMap<String,Integer>();
		hash1.put("First", 1);
		hash1.put("Second", 2);
		hash1.put("Four", 4);
		hash2.put("First", 1);
		hash2.put("Second", 2);
		hash2.put("Four", 4);
//		for(String k : hash2.keySet())
//		{
//			if(!hash1.get(k).equals(hash2.get(k))){
//				return false;
//			}	
//		}
		for(String y: hash1.keySet()){
			if(!hash2.containsKey(y)){
				return false;
			}
		}
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		ComparingoftwoHashMap c = new ComparingoftwoHashMap();
		boolean s =c.temp();
		if(s==true){
			System.out.println("both are same");
		}else{
			System.out.println("both hashmaps are not same");
		}
		
	}

}
