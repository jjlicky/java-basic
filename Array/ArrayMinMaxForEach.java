import java.util.Scanner;

class ArrayMinMaxForEach
{
	public static int maxValue(int[] arr)
	{
		int max = arr[0];
		for(int e : arr)
		{
			if(max<e)
				max=e;
		}
		return max;
	}

	public static int minValue(int[] arr)
	{
		int min = arr[0];
		for(int e : arr)
		{
			if(min>e)
				min=e;
		}
		return min;
	}

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int[] intArr = new int[7];
		for(int i=0;i<intArr.length;i++)
		{
			System.out.println("���� �Է�");
			intArr[i]=keyboard.nextInt();
		}
		System.out.println("�ּҰ� : "+minValue(intArr));
		System.out.println("�ִ밪 : "+maxValue(intArr));

	}
}