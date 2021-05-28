
public class Stringsort {

	public static String sortStrings(String st)
	{
		int arr[]= new int[st.length()];
		char ch[]= new char[st.length()];
		int mid=(st.length()-1)/2;
		String res="";
		int i,j,k,tmp;
		for(k=0;k<st.length();k++)
		{
			arr[k]=(int)st.charAt(k);
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(k=0;k<arr.length;k++)
		{
			ch[k]=(char)arr[k];
		}
		for(k=0;k<mid;k++)
		{
			char ch1 = ch[k];
			res=res+Character.toUpperCase(ch1);
		}
		for(j=mid+1;j<ch.length;j++)
		{
			char ch1=ch[j];
			res=res+Character.toLowerCase(ch1);
		}
		return res;
	}
	public static void main(String[] args) {
		String st=args[0];
		String res=sortStrings(st);
		System.out.println(res);
		// TODO Auto-generated method stub
	}
}