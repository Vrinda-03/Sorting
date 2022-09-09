package sorting;
import java.util.*;
public class bubble_sort {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				int A[]=new int[5];
				for(int k=0;k<5;k++)
				{
					System.out.println("Enter a number");
					A[k]=sc.nextInt();
					
				}
				int tmp;
				for(int i=0;i<5;i++)
				   {
				       for(int j=i+1;j<5;j++)
				       {
				           if(A[i]>A[j])
				           {
				               tmp=A[i];
				               A[i]=A[j];
				               A[j]=tmp;
				           }
				       }
				   }
				System.out.println("The sorted array is:");
				for(int k=0;k<5;k++)
				{
					System.out.print(A[k]+" ");
					
				}
				
				
				

			}

	

	}

