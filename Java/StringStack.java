package Problem9;

interface Stack{
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}


public class StringStack implements Stack {
    private String[] element;
    private int tos;

    public StringStack(int capacity){
        element = new String[capacity];
        tos = -1;

    }
    @Override
    public int length() {
        return tos+1;
    }

    @Override
    public int capacity() {
        return element.length;
    }

    @Override
    public String pop() {
        if (tos==-1) return null;
        String answer = element[tos];
        tos--;
        return answer;
    }

    @Override
    public boolean push(String word) {
        if (element.length-1==tos) return false;
        else{
            tos++;
            element[tos] = word;
            return true;
        }
    }
}
