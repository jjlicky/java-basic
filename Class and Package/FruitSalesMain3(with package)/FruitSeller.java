package orange.seller;

public class FruitSeller
{
	int numOfApple;
	int myMoney=0;
	final int APPLE_PRICE;

	public FruitSeller(int money, int appleNum, int price)
	{
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	public void showSaleResult()
	{
		System.out.println("Remain apple : " + numOfApple);
		System.out.println("A margin : " + myMoney);
	}
}