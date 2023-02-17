public static void main(String args[]) {
		int n=4;
		int q=2;
		boolean arr[]=new boolean[n];
		print(arr, q, 0, "",0);
 
	}
	public static void print(boolean arr[],int tq,int qpsf,String ans,int a){
		if(qpsf==tq){
			System.out.print(ans+" ");
			return;
		}
	
	for(int i=a;i<arr.length;i++){
		if(arr[i]==false){
			arr[i]=true;
		
		print(arr, tq, qpsf+1, ans+"p"+i+"q"+qpsf,i+1);
		arr[i]=false;
		}
	}
	
