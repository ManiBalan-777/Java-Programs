class palin
{
	public static void main(String ar[])
	{
		int r,s=0,t;
		int n=454;
		t=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(t==s)
			System.out.println("palinddrome");
		else
			System.out.println("not palinddrome");
	}
}