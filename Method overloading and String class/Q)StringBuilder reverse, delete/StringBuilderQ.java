class StringBuilderQ
{
	public static void main(String[] args)
	{
		StringBuilder str1 = new StringBuilder("ABCDEFGHIJKLMN");
	
		str1.reverse();
		System.out.println(str1);

		StringBuilder str2 = new StringBuilder("990208-1012752");
		
		str2.deleteCharAt(6);
		System.out.println(str2);

	}
}
