
public class Q3 {

    public static void main(String[] args) {

        ArrayStack<Integer> S = new ArrayStack<>();
        ArrayStack<Integer> T = new ArrayStack<>();
        for(int i = 0; i < 5; i++){
        	S.push(i);
        }
        System.out.println("S = "+ S);
        T = transfer(S, T);
        System.out.println("T = "+ T);

    }


    public static ArrayStack<Integer> transfer(ArrayStack<Integer> S, ArrayStack<Integer> T){
  
        int ssize = S.size();
        
        for(int i = 0; i < ssize; i++){

            T.push(S.pop());

        }

        return T;

    }

}