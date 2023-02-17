public static void main(String args[]) {
		String str="12";
		print(str, "");

 
	}
	static String arr[]={"","abc","def","ghi","jkl","mno","pqr","stuv","wx","yz"};
	public static void print(String str,String ans){
		if(str.length()==0){
			System.out.print(ans+" ");
			return;
		}

		char ch =str.charAt(0);
		String part=arr[ch-'0'];
		for(int i=0;i<part.length();i++){
			print(str.substring(1), ans+part.charAt(i));
		}
	}
