import java.util.ArrayList;
import java.util.List;

public class Customer {
	private
		String name;
		int promotion;
		//Item
		List<Item> basket = new ArrayList<>();
		static final int MAX_ITEM=30;
		int current_item=0;
		
		//Additional data
		int calculatedPayment = 0;
		double discountedPayment = 0;

	public Customer() {
		setName("unknown");
		setPromotion(100);
	}
	public Customer(String name) {
		setName(name);
		setPromotion(100);
	}
	public Customer(int promotion) {
		setName("unknown");
		setPromotion(promotion);
	}
	public Customer(String name, int promotion) {
			setName(name);
			setPromotion(promotion);
		}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getPromotion() {
		return promotion;
	}
	
	public void setPromotion(int promotion) {
		if(promotion<0 || promotion>100) 
			promotion=100;
		this.promotion = promotion;
	}
	
	private void addToPayment(int price) {
		this.calculatedPayment+=price;
		calculateDiscount();
	}
	private void removeFromPayment(int price) {
		this.calculatedPayment-=price;
		calculateDiscount();
	}
	
	private void calculateDiscount() {
		this.discountedPayment=(this.calculatedPayment*this.promotion)/100;
	}

	private void printPayment() {
		System.out.println("Total price:"+this.calculatedPayment);
		System.out.println("Discounted price:"+this.discountedPayment);
	}
	public void addItem(Item item) {
		if(this.current_item<=MAX_ITEM) {
			this.basket.add(item);
			this.current_item++;
			addToPayment(item.price);
		}
		else {
			System.out.println("");
		}
	}

	public void deleteItem(String name) {
		for(Item i:this.basket) {
			if (i.getName().equals(name)){
	        	this.basket.remove(i); 
	        	this.current_item--;
	        	removeFromPayment(i.price);
	        	break;
			}
		}
	}
	public void listItems() {
		int num=1;
		for(Item i:this.basket) {
			System.out.printf("%d %s %d\n", num,  i.getName(), i.getPrice());
			num++;
		}
		printPayment();
		
	}

}
