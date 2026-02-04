class MaxElement{
public static void main(String args[]){
	int[]arr={34,63,98,101,24,76};
	int i;
	int max=arr[0];
	for(i=0;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}
System.out.println("Max element is:"+ max);
}
}