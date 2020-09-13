
public class count {

	void Anum(char c,String []n)
	{
		int c1=0;
		int []x= {0,0,0};
		String str1 = String.valueOf(c);
		for(int  i = 0; i<n.length;i++)
		{
			String word = n[i];
			for(int j =0; j <word.length();j++)
			{
			char ch = word.charAt(j);
			String str2 = String.valueOf(ch);
				if(str1.equalsIgnoreCase(str2))
				{
					c1++;
				}
			}
			x[i]=c1;
		}
		int j=0;
		if(x[j] >=x[j+1] && x[j] >= x[j+2])
			System.out.println(n[j]);
		else if(x[j+1] >= x[j] && x[j+1] >= x[j+2])
			System.out.println(n[j+1]);
		else
			System.out.println(n[j+2]);
	}
}
