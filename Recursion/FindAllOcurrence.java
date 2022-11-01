package recursion;

import java.util.ArrayList;

public class FindAllOcurrence {
	public static void main(String[] args) {
		int a[]= {9,10,344,55,10,349,10,79,34};
		int size=9;
		int index=0;
		int target=10;
		ArrayList<Integer> ans=new ArrayList<>();
		ans=findAll(a,index,size,target,ans);
		for(int i:ans)
		System.out.println(i);
		
	}
	public static ArrayList<Integer> findAll(int a[],int index,int size,int target,ArrayList<Integer> ans) {
		if(index==size) {
			return null;
		}
		if(a[index]==target) {
			ans.add(index);
		}
		findAll(a,index+1,size,target,ans);
		return ans;
	}
}
