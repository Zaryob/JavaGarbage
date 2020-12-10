import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		List<Truck> trucklist = new ArrayList<Truck>();
		
		TollBooth booth = new AlleghenyTollBooth();
		
		Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms

		Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg
		
		Truck daewoo = new DaewooTruck(6, 17000); // ….
		trucklist.add(ford);
		trucklist.add(nissan);
		trucklist.add(daewoo);
		int query=0;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.printf(
					"1: Scan Barcode:\n2: Display data\n3: Restart meter\n"
					);
			int selection = in.nextInt();
			
			switch(selection) {
			case 1:
				if (query<=2){
					booth.calculateToll(trucklist.get(query));
					booth.displayData();
					query++;
				}
				else {
					System.out.println("No car came");
					
				}
				
				break;
			case 2:
				booth.displayData();
				break;
			case 3:
				booth.collectReceipt();
				break;
				
			default:
				System.out.println("Quit");
				System.exit(0);
				break;
				
			}
			
		}
		
		
		/*TollBooth booth = new AlleghenyTollBooth();

		Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms

		Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg
		
		Truck daewoo = new DaewooTruck(6, 17000); // ….

		booth.calculateToll(ford);
		booth.displayData();
		booth.calculateToll(nissan);
		booth.displayData();
		booth.calculateToll(daewoo);
		booth.displayData();
		booth.collectReceipt();
*/
	}

}
