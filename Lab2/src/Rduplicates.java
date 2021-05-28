import java.util.*;
public class Rduplicates
{
    public static int modifyArray(int[] a)
    {	
    	int i,j,tmp;
    	
    	for(i=0;i<5;i++)
    	{
    		for(j=i+1;j<6;j++)
        	{
    			if(a[i]==a[j])
    			{
    				a[j]=0;
    			}
    			if(a[i]<a[j])
    			{
    				tmp=a[i];
    				a[i]=a[j];
    				a[j]=tmp;
    			}
        	}
    	}
    	return a[i];
        }

    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
		int i,n;
		Rduplicates rd=new Rduplicates();
		int a[]=new int[100];
		System.out.println("Enter the range :");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the number: ");
			a[i]=sc.nextInt();
		}
		rd.modifyArray(a);
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]+ " ");
			}
		}
		sc.close();
    }
}