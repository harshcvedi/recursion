public static void main(String args[]) {
		int n=3;
		print(n, "A", "B", "c");
 
	}
	public static void print(int n,String src,String help,String des){
		if(n==0){
			return;
		}


		print(n-1, src, des, help);
		System.out.println("move plate n from"+src+"to"+des);
		print(n-1, help, src, des);
	}
