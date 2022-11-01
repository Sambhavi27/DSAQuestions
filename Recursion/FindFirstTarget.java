package recursion;

public class FindFirstTarget {

	public static void main(String[] args) {
		int a[]= {9,10,344,55,7,349,100,79,34};
		int size=9;
		int index=0;
		int target=34;
		System.out.println(findFirst(a,index,size,target));
		int ans=-1;
		System.out.println(findFirstAgain(a,index,size,target,ans));
	}
	public static int findFirst(int a[],int index,int size,int target) {
		if(index==size) {
			return -1;
		}
		if(a[index]==target) {;
			return index;
		}
		else {
			return findFirst(a,index+1,size,target);
		}
		
	}
	public static int findFirstAgain(int a[],int index,int size,int target,int ans) {
		if(index==size) {
			return ans;
		}
		if(a[index]==target) {;
			ans=index;
		}
		else {
			ans= findFirst(a,index+1,size,target);
		}
		return ans;
		
	}
}
