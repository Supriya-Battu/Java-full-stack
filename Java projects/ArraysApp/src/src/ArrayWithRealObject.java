package src;

public class ArrayWithRealObject {

	public static void main(String[] args) {
		
		//Array with object (Product)
		Product[]  products = new Product[3];
		//create product object
		Product p = new Product(1001, "LG " , 20000);
		Product p1 = new Product(1002, "Realme" , 15000);
		Product p2 = new Product(1003, "Samsung " , 12000);
		//insert
		products[0]=p;
		products[1]=p1;
		products[2]=p2;
		//enhanced for loop [Display]
		for(Product pro:products)
		{
			// only for values
			System.out.println(pro.getPid()+ " " +
		pro.getPname()+" "+pro.getPrice());
			// to get values with name
			//System.out.println(pro);
		}
		
		
		
		
	}

}
