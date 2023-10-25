package oop2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String mesaj="vade";
		
		
		
		Product product1=new Product();
		product1.setName("Delogingi hahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpeg");
		// System.out.println(product1.name);
		
		Product product2=new Product();
		product2.setName("Kitchen hahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpeg");
		
		Product product3=new Product();
		product3.setName("Markus hahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpeg");
		
		Product[] products= {product1,product2,product3};
		
		
		System.out.println("<ul>");
		
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		
		
		IndividualCustomer individualCustomer= new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("55555555555");
		individualCustomer.setLastName("Tayyar");
		individualCustomer.setFirstName("Mustafa");
		
		
		
		CorporateCustomer corpareteCustomer =new CorporateCustomer();
		
		corpareteCustomer.setId(2);
		corpareteCustomer.setTaxNumer("11111111111111111");
		
		
		Customer [] customers= {individualCustomer,corpareteCustomer};
		
		
		

	}

}
