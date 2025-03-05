import java.io.*;
import java.util.*;
public class LeadersInArray{
	
		public static void main(String args[]){
   			List<Integer> li = new ArrayList<>();
			int arr[]={16,17,4,3,5,2};
			int max=Integer.MIN_VALUE;
			for(int i=arr.length-1;i>0;i--)
			{
				if(arr[i]>max)
				{
					max=arr[i];
					li.add(max);
					System.out.print(max+" ");
				}
			}
			Collections.reverse(li);
			System.out.println(li);
	}
}
