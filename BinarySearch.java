package Arrays;
import java.util.Scanner;
public class BinarySearch 
{
	static void binarySearch(int arr[], int find)
	{
		for(int i=0; i<arr.length-1;i++)
		{
			
			for(int j=i+1; j<arr.length ; j++)
			{
				if(arr[i]> arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i]=temp;
					
				}
			}
		}
		for(int i :arr)
		{
			System.out.print(" "+i);
		
		}System.out.println();
		int first =0; int last =arr.length-1; 
		while(first <= last)
		{
			int mid = (first +last )/2;
			if(arr[mid]==find)
			{
				System.out.println("Element found at index:"+mid);
				break;
			}
			else if(arr[mid]> find)
			{
				last = mid-1;
			}
			else 
			{
				first = mid+1;
			}		
		}
		if(first>last)
		{
			System.out.println("Invalid");
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int arr[]= {10 , 76, 20, 30} ; int find=50; 
		binarySearch (arr, find );
	}
}
