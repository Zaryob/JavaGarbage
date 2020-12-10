import java.util.ArrayList;

public class AlleghenyTollBooth implements TollBooth {
	
	private int totalTrucks;
	private int totalReceipts;
	
	private ArrayList<Truck> trucks = new ArrayList<Truck>();
	

	@Override
	public void calculateToll(Truck t) {
		trucks.add(t);
		
		/*
		 * For FordTruck in TestTollBooth 5 axle 12000 kg truck
		 * 
		 * 5*5=25$ for axle
		 * 
		 * 12.5 tons = 25 per tons
		 * 12000 / 500 = 24
		 * 10*24= 240 $ for backpack
		 * 
		 * total is 265 $
		 * 
		 */
		int total = t.getAxles()*5; // 5$ per axle
		total += t.getWeight()/50; // 10$ per half tons -> (x/500)*10=x/50

		
		totalTrucks++;
		totalReceipts += total;
		System.out.println("Axles: " + t.getAxles() + " Total weight: " + t.getWeight() + " Toll due: $" + total);
	}

	@Override
	public void displayData() {
		System.out.println("Number of trucks: "+totalTrucks+"\nReceipts:$"+totalReceipts);

	}


	@Override
	public void collectReceipt() {
		trucks.clear();
		totalTrucks = 0;
		totalReceipts = 0;
	}

}
