package recursion;

public class FindMaxInArray {

	public static void main(String[] args) {
		int a[]= {9,10,55,7,34,100,79};
		int size=7;
		int index=0;
		System.out.println(getMax(a,index,size));
		int maxi=Integer.MIN_VALUE;
		System.out.println(getMaxAgain(a,index,size,maxi));
	}

	public static int getMax(int a[],int index,int size) {
		if(index==size) {
			return Integer.MIN_VALUE;
		}
		int ans=a[index];
		int recAns=getMax(a,index+1,size);
		return Math.max(ans, recAns);
	}
	
	public static int getMaxAgain(int a[],int index,int size,int maxi) {
		if(index==size) {
			return maxi;
		}
		maxi=Math.max(maxi,a[index]);
		maxi=getMaxAgain(a,index+1,size,maxi);
		return maxi;
	}
}
