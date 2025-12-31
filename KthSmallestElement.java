import java.util.Arrays;
class KthSmallestElement{
public static void main(String args[]){
	int[]arr={45,23,57,21,98,75};
	int k=5;
	Arrays.sort(arr);
	System.out.println("The Kth smallest element is "+arr[k-1]);
}
}