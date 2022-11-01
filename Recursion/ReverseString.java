package recursion;

public class ReverseString {

	public static void main(String[] args) {
		String s="testing";
		System.out.println(reverse(s,0,6));
		String ans="";
		System.out.println(reverseAgain(s,0,ans));
	}

	public static String reverse(String s,int i,int j) {
		if(i>=j) {
			return s;
		}
		char tempi=s.charAt(i);
		char tempj=s.charAt(j);
		s=s.substring(0, j)+tempi+s.substring(j+1);
		s=s.substring(0, i)+tempj+s.substring(i+1);
		s=reverse(s,i+1,j-1);
		return s;
	}
	public static String reverseAgain(String s,int index,String ans) {
		if(index==s.length()) {
			return ans;
		}
		ans=reverseAgain(s,index+1,ans);
		ans=ans+s.charAt(index);
		return ans;
	}
}
