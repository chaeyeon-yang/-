import java.util.Vector;

interface IStack<T>{
    T pop();
    boolean push(T ob);
}

class MyStack<T> implements IStack<T>{
    Vector<T> vector;
    public MyStack(){
        vector = new Vector<T>();
    }
   public T pop() {
       if (vector.size() == 0) return null;
       else {
           return vector.remove(0);
       }
   }

    @Override
    public boolean push(T ob) {
       if (vector.size() == 10) return false;
       else {
           vector.add(0,ob);
           return true;
       }
}}
public class StackManager {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i=0; i<10; i++) stack.push(i);
        while (true){
            Integer n = stack.pop();
            if (n == null) break;
            System.out.print(n+" ");
        }
    }
}

