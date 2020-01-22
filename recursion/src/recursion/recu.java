package recursion;

public class recu {
	public static int power(int base,int powers)
	{
		if(powers==0)
		{
			return 1;
		}
		else
		{
			return base*power(base,powers-1);
		}
	}
	public static void main(String args[])
	{
		int o=power(2,5);
		System.out.println(o);
		
	}
}
