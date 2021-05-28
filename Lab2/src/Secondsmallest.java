import java.util.Scanner;
public class Secondsmallest {
	public static int getSecondSmallest(int[] a, int total){  
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return (a[1]); 
	      }  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n;
		int a[]=new int[100];
		System.out.println("Enter the range :");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the number: ");
			a[i]=sc.nextInt();
		}
		System.out.println("Second Smallest Number :"+getSecondSmallest(a,n));//
		sc.close();
	}
}
