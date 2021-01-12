class SCE_fix
{
	public static void main(String[] args)
	{
		int num1=0, num2=0;
		boolean result;

		result = (num1+=10)>0 && (num2+=10)>0;

		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);	//왼쪽이 이미 거짓이므로 볼것도 없이 거짓

		result = (num1+=10)<0 || (num2+=10)>0;
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);	// 왼쪽이 이미 참이므로 참
	}
}