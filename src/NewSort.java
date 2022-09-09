import java.util.*;
public class NewSort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[5];
		System.out.println("Enter the array elements on the prompt");
		for(int k=0;k<5;k++)
		{
			System.out.println("Enter a number");
			A[k]=sc.nextInt();
		}
		for (int j = 1; j < 5; j++) 
		{  
            int key = A[j];  
            int i = j-1;  
            while ( (i > -1) && ( A [i] > key ) )
            {  
                A [i+1] = A [i];  
                i--;  
            }  
            A[i+1] = key;  
		
	    }
		System.out.println("Sorted array is as follows:");
		for(int m=0;m<5;m++)
		{
			System.out.print(A[m]+" ");
		}
	}
}


