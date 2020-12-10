public class DaewooTruck implements Truck {
	
	private final int axles;
	private int weight;

	public DaewooTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	
	}
	
	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return this.axles;
	}

	
	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

}
