package com.Product;

import java.util.ArrayList;
import java.util.function.BiPredicate;

class Product {
	public Product(int productId, String productName, int productsize, int shoeprice, int shocksprice) {
		super();
		ProductId = productId;
		ProductName = productName;
		Productsize = productsize;
		Shoeprice = shoeprice;
		Shocksprice = shocksprice;
	}

	int ProductId;
	String ProductName;
	int Productsize;
	int Shoeprice;
	int Shocksprice;
}

public class FindBestQuality {

	public static void main(String[] args) {
		ArrayList<Product> Detail = new ArrayList<Product>();

		Detail.add(new Product(191, "Noises", 12, 50, 50));
		Detail.add(new Product(121, "ReBok", 10, 10, 50));
		Detail.add(new Product(161, "Red", 3, 40, 10));
		Detail.add(new Product(111, "Puma", 4, 30, 10));

		BiPredicate<Integer, Integer> pro = (shoe, Shocks) -> ((shoe + Shocks) >= 50);
		BiPredicate<Integer, Integer> bipredicate1 = (lase, socks) -> ((lase + socks) < 50);
		for (Product product : Detail) {
			if(pro.test(product.Shocksprice, product.Shoeprice));
			{
				System.out.println("ProductID:" +" " + product.ProductId +"  "+ "ProductName: " +"  " +product.ProductName +"  "+" Product Size" +product.Productsize +" "+"Shocks Price:" +product.Shocksprice +" "+" Shoe Price" +product.Shoeprice);
				System.out.println("This High Cost Product");
				
				System.out.println("  ");
			}
		
			if (bipredicate1.test(product.Shoeprice, product.Shocksprice)) {
				System.out.println("ProductID" + product.ProductId +" "+ "ProductName " +product.ProductName +" "+" Product Size" +product.Productsize +" "+"Shocks Price:" +product.Shocksprice +" "+" Shoe Price" +product.Shoeprice);
				System.out.println("This Low Cost Product");
				System.out.println("  ");
			}
			
			for (Product product2 : Detail) {
				
				if ((product2.Productsize>=4)&&(product2.Shocksprice>=50)) {
					System.out.println("ProductID" + product.ProductId +" "+ "ProductName " +product.ProductName +" "+" Product Size" +product.Productsize +" "+"Shocks Price:" +product.Shocksprice +" "+" Shoe Price" +product.Shoeprice);
					System.out.println("Reasonable Price and Best  Product");
					System.out.println("  ");
				}
			}
		}
	}

}