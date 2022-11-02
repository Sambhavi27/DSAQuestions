package recursion;

import java.util.ArrayList;

public class SubsequencesString {

	public static void main(String[] args) {
		String s="abc";
		int index=0;
		String ans="";
		String temp="";
		printSubsequence(s,index,ans);
		ArrayList<String> res=new ArrayList<String>();
		res=storeSubsequence(s,index,temp,res);
		for(String i:res) {
			System.out.print(i+" ");
		}
		
	}

	public static void printSubsequence(String s,int index,String ans) {
		if(index==s.length()) {
			System.out.println(ans);
			return;
		}
		//include
		printSubsequence(s,index+1,ans+s.charAt(index));
		//exclude
		printSubsequence(s,index+1,ans);
	}
	public static ArrayList<String> storeSubsequence(String s,int index,String temp,ArrayList<String> res) {
		if(index==s.length()) {
			res.add(temp);
			return res;
		}
		//include
		storeSubsequence(s,index+1,temp+s.charAt(index),res);
		//exclude
		storeSubsequence(s,index+1,temp,res);
		return res;
	}

}
