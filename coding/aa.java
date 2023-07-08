package coding;

public class aa {
	public static void main(String[] args) {
		String a="aaabbcc";
		String temp="";
		char[] a1=a.toCharArray();
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!='a') {
				temp=temp+a1[i];
			}
		}
		System.out.println(temp);
	}
	


}
