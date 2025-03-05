public class StringNum{
      public static void main(String args[]) 
	 {
	  String str="dgy45366yghfds367";
	  int len=str.length();
	  int sum=0;
	  for(int i=0;i<=len;i++)
	    {
		char ch=str.charAt(i);
		if(Character.isDigit(ch))
		 {
		 int digit=Integer.parseInt(ch);
		 sum +=digit;
		 }
	     }
		System.out.println(sum);
	 }
 }
