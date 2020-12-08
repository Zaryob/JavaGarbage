import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		Customer c1 = new Customer("Ali", 90); 
        Customer c2 = new Customer("Ayse");
        Customer c3 = new Customer();
        c3.setPromotion(70);
        while(true) {
        	Customer sellected=null;
        	System.out.printf("(1) Ali \n(2) Ayse\n(3) unknown\n(4) Terminate\n");
        	String slc= scann.nextLine();
        	boolean brek=false;
        	switch(slc) {
        		case "1":
        			sellected=c1;
        			break;
        		case "2":
        			sellected=c2;
        			break;
        		case "3":
        			sellected=c3;
        			break;
        		case "4":
        			System.exit(0);
        		default:
        			System.out.println("No match. Please select correct one.");
        			brek=true;
        	}
        	if(brek==true) {
        		break;
        	}
        	System.out.printf("(1) AddItem \n(2) DeleteItem\n(3) ListItems\n");
        	slc= scann.nextLine();
        	switch(slc) {
	    		case "1":
	    			System.out.println("Enter the name of the item:");
	    			String name=scann.nextLine();
	    			System.out.println("Enter the price of the item:");
	    			int price=Integer.parseInt(scann.nextLine());
	    			Item item=new Item(name,price);
	    			sellected.addItem(item);;
	    			break;
	    		case "2":
	    			System.out.println("Enter the name of the item:");
	    			String name1=scann.nextLine();
	    			sellected.deleteItem(name1);
	    			break;
	    		case "3":
	    			sellected.listItems();;
	    			break;
        	}
        }
        scann.close();
	}
}
