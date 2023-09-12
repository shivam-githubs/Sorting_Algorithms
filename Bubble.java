package Arrays;

public class Bubble {
	public static void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++ )
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {10,40,5,3,70};
		bubbleSort( arr);
		for(int i : arr)
		{
			System.out.println(i+" ");
		}

	}

}
