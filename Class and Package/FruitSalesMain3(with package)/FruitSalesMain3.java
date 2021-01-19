import orange.seller.FruitSeller;
import orange.buyer.FruitBuyer;

class FruitSalesMain3
{
	public static void main(String[] args)
	{
		FruitSeller seller1 = new FruitSeller(0,30,1500);

		FruitSeller seller2 = new FruitSeller(0,20,1000);

		FruitBuyer buyer = new FruitBuyer(10000);
		buyer.buyApple(seller1,4500);
		buyer.buyApple(seller2,2000);

		System.out.println("Present conditions of seller1");
		seller1.showSaleResult();

		System.out.println("Present conditions of seller2");
		seller2.showSaleResult();

		System.out.println("Present conditions of buyer");
		buyer.showBuyResult();

	}
}