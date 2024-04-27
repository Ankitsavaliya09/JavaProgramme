class CodeChai
{
	public static void main(String[] args)
	{
		makechai();
		makechai(2);
	}
	static void makechai()
	{
		System.out.println("Bill For masala chai=10");
	}
	static void makechai(int quantity)
	{
		System.out.println("Bill for masala chai="+(quantity));
	}
}