package recursion;

public class FindLastOcurrence {
	public static void main(String[] args) {
		int a[]= {9,10,344,55,10,349,10,79,34};
		int size=9;
		int index=8;
		int target=10;
		System.out.println(findLast(a,index,size,target));
		
	}
	public static int findLast(int a[],int index,int size,int target) {
		if(index<0) {
			return -1;
		}
		if(a[index]==target) {;
			return index;
		}
		else {
			return findLast(a,index-1,size,target);
		}
		
	}
}
