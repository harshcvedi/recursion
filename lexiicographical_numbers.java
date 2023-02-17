 public static List<Integer> printcounting(int curr, int n,ArrayList<Integer> ll){
		if(curr>n){
			return ll;
		}
        if(curr!=0){
            ll.add(curr);
        }
		int i=0;
        if(curr==0){
            i=1;
        }
       
		for(;i<=9;i++){//10 barr loop chalega
			printcounting(curr*10+i, n,ll);
		}
        return ll;
	}
