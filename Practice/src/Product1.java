class Product1
{
	int product_id;
	String product_category;
	int price;

	void manufacturing()
	{
		System.out.println("Product Manufacturing...!");
	}

	void sold()
	{
		System.out.println("Product soldout...!");
	}

	void shipped()
	{
		System.out.println("Product Shipped...!");
	}
}

class Product2
{
	int product_id;
	String product_category;
	int price;

	void manufacturing()
	{
		System.out.println("Product Manufacturing...!");
	}

	void sold()
	{
		System.out.println("Product soldout...!");
	}

	void shipped()
	{
		System.out.println("Product Shipped...!");
	}
}


class ProductApp
{
public static void main(String[] args)
{
	Product1 p1 = new Product1();
	Product2 p2 = new Product2();

	p1.product_id = 101;
	p1.product_category = "Clothing";
	p1.price = 999;
	System.out.println("Product Id:"+p1.product_id);
	System.out.println("Product Category:"+p1.product_category);
	System.out.println("Price:Rs."+p1.price);
	p1.manufacturing();
	p1.sold();
	p1.shipped();

	System.out.println("===============================================");

	p2.product_id = 102;
	p2.product_category = "Gaming";
	p2.price = 799;
	System.out.println("Product Id:"+p2.product_id);
	System.out.println("Product Category:"+p2.product_category);
	System.out.println("Price:Rs."+p2.price);
	p2.manufacturing();
	p2.sold();
	p2.shipped();
}
}








