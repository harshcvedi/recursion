public static void main(String args[]) {
		int n=4;
		print(0, n, "");


 
	}
	public static void print(int src,int des,String ans){
		if(src==des){
			System.out.print(ans+" ");
			return;
		}
		if(src>des){
			return;
		}
		for(int dice=1;dice<=3;dice++){
			print(src+dice, des, ans+dice);
		}
	}
