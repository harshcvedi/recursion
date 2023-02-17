public static void main(String args[]) {
		String str="abc";
		
		System.out.println(print(str, ""));


 
	}
	public static int print(String str,String ans){
		if(str.length()==0){
			//System.out.print(ans+" ");
			return 1;
		}

		char ch=str.charAt(0);
		int a=print(str.substring(1), ans+ch);
		int b=print(str.substring(1), ans);
		return a+b;
		
	}
