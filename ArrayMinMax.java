import java.util.Scanner;

class ArrayMinMax
{
	public static int maxValue(int[] arr)
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}

	public static int minValue(int[] arr)
	{
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(min>arr[i])
				min=arr[i];
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