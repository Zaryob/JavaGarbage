public class Item {

	private
		String name;
		int price;
	
	public Item() {
		
	}
	
	public Item(String name, int price) {
		super();
		setName(name);
		setPrice(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0)
			price=0;
		this.price = price;
	}
}
