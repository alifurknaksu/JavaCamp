package oopIntro;



public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo 14", 15000, "16 GB Ram",10,13500);
	
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Monster T5");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
	
		

	}

}