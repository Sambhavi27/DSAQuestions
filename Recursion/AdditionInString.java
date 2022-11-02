package recursion;

import java.util.ArrayList;

public class AdditionInString {

	public static void main(String[] args) {
		String a="999";
		String b="63";
		String ans="";
		ans=addString(a,b,0,a.length()-1,b.length()-1,ans);
		System.out.print(ans);
		
		
	}

	public static String addString(String a,String b,int carry,int i,int j,String ans) {
		if(i<0&&j<0&&carry==0) {
			return ans;
		}
		int first=0;
		int second=0;
		if(i>=0)
			first=a.charAt(i)-'0';
		if(j>=0)
			second=b.charAt(j)-'0';
		int sum=first+second+carry;
		
		int lastDigit=sum%10;
		
		carry=sum/10;
		
		String s=Integer.toString(lastDigit);  
		ans=s+ans;
		ans=addString(a,b,carry,i-1,j-1,ans);
		return ans;
	}
}
