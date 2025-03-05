public class PerfectNumber
{
   public static void main(String[] args) 
     {
	  int num =28,sum=0;
	  for(int i=1;i<num;i++) 
	    {
	       if(num%i==0)
		 sum += i;
	    }
	  String perfect=(sum==num)?"perfect number" : "not a perfect number";
	  System.out.println(num+" is "+perfect);
    }
}
