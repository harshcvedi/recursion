public static void main(String args[]) {
		int arr[]={2,3,7,2,5,7,9};
		int item=7;
		System.out.println(print(arr, item,arr.length-1));

 
	}
	public static int print(int arr[],int item,int i){
		if(i<0){
			return -1;
		}
		if(arr[i]==item){
			return i;
		}
		return print(arr, item, i-1);
	}
	

	
}
