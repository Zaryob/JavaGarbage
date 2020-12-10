public class TestTollBooth {

	public static void main(String[] args) {

		TollBooth booth = new AlleghenyTollBooth();

		Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms

		Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg
		
		Truck daewoo = new DaewooTruck(6, 17000); // ….

		booth.calculateToll(ford);
		//booth.displayData();
		booth.calculateToll(nissan);
		//booth.displayData();
		booth.calculateToll(daewoo);
		//booth.displayData();

		booth.displayData();
		booth.collectReceipt();
		booth.displayData();
	}

}
