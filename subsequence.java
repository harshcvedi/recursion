public static void main(String args[]) {
		String str="abc";
		print(str, "");


 
	}
	public static void print(String str,String ans){
		if(str.length()==0){
			System.out.print(ans+" ");
			return;
		}

		char ch=str.charAt(0);
		print(str.substring(1), ans+ch);
		print(str.substring(1), ans);
		
	}
