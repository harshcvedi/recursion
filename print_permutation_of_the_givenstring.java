public static void main(String args[]) {
		String str="abc";
		print(str, "");

 
	}
	public static void print(String str,String ans){
		if(str.length()==0){
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<str.length();i++){
			String s1=str.substring(0,i);
			String s2=str.substring(i+1);
			print(s1+s2, ans+str.charAt(i));

		}
	}
	
