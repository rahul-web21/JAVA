class Binarysearch{
	static int Binarysearch(int[]arr,int key){
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=low+(high-low/2);
			if(arr[mid]==key){
				return mid;
                        }
			else if(arr[mid]>key){
				high=mid-1;
                        }
			else{
				low=mid+1; 
                        }
		}
                return -1;
}
	public static void main(String args[]){
		int[]arr={1,2,3,4,5,6,7,8,9,10};
		int key=7;
		int result=Binarysearch(arr,key);
		if (result==-1){
		System.out.println("Not Found");
		}
		else{
		System.out.println("found"+key);
		}
}

}