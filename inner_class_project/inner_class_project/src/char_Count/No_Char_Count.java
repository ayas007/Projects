package char_Count;

import java.util.Scanner;

public class No_Char_Count {

	public static void main(String[] args) {
	 int count=0;
	 System.out.println("Enter String.........");
Scanner sc=new Scanner(System.in);

String st=sc.nextLine();
char ch[]=st.toCharArray();
for (int i = 0; i < ch.length; i++) {
	if(ch[i]>=65&&ch[i]<=90 || ch[i]>=97&&ch[i]<=122 ||ch[i]>=48&&ch[i]<=57 && ch[i]!=32 || ch[i]>=44&&ch[i]<=46)
		count++;
}
System.out.println("Number of character  "+count);
	}

}
