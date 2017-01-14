class Prime{
	public static void main(String args[])throws java.lang.Exception{
		java.io.BufferedReader in=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		int n,c=0;
		n=Integer.parseInt(in.readLine());
		for(int i=1;i<=n;i++)
			if(n%i==0)
				c++;
		if(c==2)
		System.out.println("Prime");
		else
		System.out.println("Not Prime");
	}
}