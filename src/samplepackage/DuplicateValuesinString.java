package samplepackage;

public class DuplicateValuesinString {

	public static void main(String[] args) {
		String str = "abcdab";
		int str_Length = str.length();
		String duplicate_Char= "";
		int count = 0;
		for(int i=0;i<str_Length;i++){
			for(int j=i+1;j<str_Length;j++){
				if(str.charAt(i)==str.charAt(j)){
					count=1;
				}
			}
			if(count==1){
				duplicate_Char = duplicate_Char+str.charAt(i);
			}
			count=0;
		}
		System.out.println(duplicate_Char);
	}
	

}
