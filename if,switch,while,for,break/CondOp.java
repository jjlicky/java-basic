class CondOp
{
	public static void main(String[] args)
	{
		int num1=50, num2=100;
		int big, diff;

		big = (num1>num2)? num1:num2;		//false 일경우 :오른쪽이 입력
		System.out.println(big);

		diff = (num1>num2)? num1-num2:num2-num1;
		System.out.println(diff);
	}
}