package Algorithms;

public class BinarySearch {
	static int binarySearch(String[] arr,String x)
	{
		int i=0,r=arr.length-1;
		while(i<=r)
		{
			int m=i+(r-1)/2;
			int res=x.compareTo(arr[m]);
			
			  if (res == 0)
	                return m;
	 
	            // If x greater, ignore left half
	            if (res > 0)
	                i = m + 1;
	 
	            // If x is smaller, ignore right half
	            else
	                r = m - 1;
	        }
	 
	        return -1;
		
	}
		
	
	public static void main(String[] args) {
		String[] arr= {"kalyani","swati","neha","prajkta"};
		String x="neha";
		
		int result=binarySearch(arr, x);
		
		if(result==2)
		{
		System.out.println("element not present");	
		}else {
			System.out.println("element found at " +"index " +result);
		}
		}
	
		
}


