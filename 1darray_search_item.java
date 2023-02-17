public static void main(String args[]) {
		int arr[]={2,3,7,2,5,7,9,7};
		int item=7;
		System.out.println(print(arr, item, 0));

 
	}
	public static int print(int arr[],int item,int i){
		if(i==arr.length){
			return -1;
		}
		if(arr[i]==item){
			return i;
		}
		return print(arr, item, i+1);
	}
	

	
}
