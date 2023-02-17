public static void main(String args[]) {
		int n=3;
		int m=4;
		print(0, 0, n, m, "");

 
	}
	
	public static void print(int cr,int cc,int n,int m,String ans){
		if(cr==n-1 && cc==m-1){
			System.out.print(ans+" ");
			return;
		}
		if(cr>=n || cc>=m){
			return;
		}

		print(cr, cc+1, n, m, ans+"H");
		print(cr+1, cc, n, m, ans+"V");
	}
