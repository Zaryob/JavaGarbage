/**
 * 
 */

/**
 * @author SuleymanPoyraz
 * {@summary: This is auto-generated class stub}
 */
public class BinarySearchTree {
	public static  Node root;
	
	// Constructor
	public BinarySearchTree(){
		this.root = null;
	}
	
	/**
	 * @param id
	 */
	public void insert(int id){
		
		Node newNode = new Node(id);
		
		if(root==null){
			root = newNode;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
		while(true){
			// Add element recursively, start from root.
			parent = current;
			
			if(id<current.data){	
				
				current = current.left;
				
				if (current==null) {
					parent.left = newNode;
					return;
				}
				
			}
			
			else{
				
				current = current.right;
				
				if (current==null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	/**
	 * @param id
	 */
	public boolean find(int id){
		Node current = root;
		
		while(current!=null){
			//check all elements with starting from root
			if (current.data==id) {
				return true;
			} 
			else if (current.data>id) {
				current = current.left;
			}
			else {
				current = current.right;
			}
		}
		return false;
	}
	
	/**
	 * @param root
	 */
	public void display(Node root){
	
		if (root!=null) {
			//display elements recursively with starting from root
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
			//System.out.println();
		}
	
	}
	
}
