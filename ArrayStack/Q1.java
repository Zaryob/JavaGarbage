import java.util.Scanner;

public class Q1 
{ 
	public static void main(String[] args) 
	{ 
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] array=new int[s];
        int sayac=0;
        for(int i=s; i>0;i--) {
        	array[sayac]=i;
        	sayac++;
        }
        calculate_permutation(array, 0, sayac-1); 
	} 

	static void calculate_permutation(int[] array, int start, int stop) 
	{ 
		if (start ==stop) {
			for(int i=0; i<array.length;i++) {
	        	System.out.print(array[i]);
	        }
			System.out.println();
		}
		else
		{ 
			for (int i = start; i <= stop; i++) 
			{ 
				int temp;
				temp= array[start];
				array[start]=array[i];
				array[i]=temp;
				calculate_permutation(array, start+1, stop); 
				temp= array[start];
				array[start]=array[i];
				array[i]=temp;
			} 
		} 
	} 
} 

