class TwoDimensionalArrayAdder
{
	public static void addOneArr(int[] arr, int add)
	{
		for(int i=0;i<arr.length;i++)
			arr[i]+=add;
	}
	
	public static void addTwoArr(int[][] arr, int add)
	{
		for(int i=0;i<arr.length;i++)
			addOneArr(arr[i],add);
	}
	
	public static void main(String[] args)
	{
		int[][] arr={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};

		addTwoArr(arr,2);

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}