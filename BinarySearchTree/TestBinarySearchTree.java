/**
 * 
 */

/**
 * @author SuleymanPoyraz
 * {@summary: This is auto-generated class stub}
 */
public class TestBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		BinarySearchTree b = new BinarySearchTree();
		b.insert(8);
		b.insert(2);
		b.insert(1);
		b.insert(9);
		b.insert(10);
		b.insert(7);
		b.insert(21);
		b.insert(16);
		b.insert(25);
		b.insert(13);
		b.insert(3);
		
		System.out.println("Binary Search Tree : ");
		b.display(b.root);		
		System.out.println();
		
		System.out.println("Find if 4 exists: " + b.find(4));
		
		b.insert(4);
		System.out.println("Find if 4 exists: " + b.find(4));
		
		System.out.println("Binary Search Tree : ");
		b.display(b.root);		
		System.out.println();
	}

}
