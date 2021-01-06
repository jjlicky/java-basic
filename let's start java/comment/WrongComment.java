class WrongComment
{
	public static void main(String[] args)
	{
		System.out.println("One" /* One is 1 */);	
		System.out.println("Two /* One is 1 */");			// comment in "" isn't perceived
		System.out.println("Three");
		
		/*
		System.out.println(2);
		// System.out.println("2");
		*/
		
		/*
		System.out.println(3);
		/* System.out.println("3");
		*/	
	}
}