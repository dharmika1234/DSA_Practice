public class SortInArray
 {
       	public static void main(String args[])
	 {
 		int[] arr={2,5,4,3,6,1};
		System.out.print("before Sorting: ");
		
		for (int i=0;i<arr.length;i++)
		 {
		    System.out.print(arr[i]+" ");
		 }


		for(int i=0;i<arr.length;i++)
		 {
		   for(int j=i+1;j<arr.length;j++)
		    {
			if(arr[i]>arr[j])
			 {
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			 }
		    }	
		 }
		System.out.println();

		System.out.print("After Sorting: ");
		for (int i=0;i<arr.length;i++)
		  {
		     System.out.print(arr[i]+" ");
		  }
	}
}
    
