//p.320 #10

package Problem26;

public class Dictionary extends PairMap {
    public Dictionary(int size){
        this.keyArray = new String[size];
        this.valueArray = new String[size];
        for (int j=0; j<keyArray.length; j++){
            this.keyArray[j] = "";
            this.keyArray[j] = "";
        }
    }
    String get (String key){
        String answer = "";
        for (int i=0; i<keyArray.length; i++){
            if (keyArray[i].equals(key)) {
                answer = valueArray[i];
            }
        }
        return answer;
    }
    void put(String key, String value){
        for (int i=0; i<keyArray.length; i++){
            int x = (int)(Math.random()*keyArray.length);
            keyArray[x] = key;
            valueArray[x] = value;
            }
        }
    void delete(String key){
        String del = null;
        for (int i=0; i<keyArray.length; i++){
            if (keyArray[i].equals(key)){
                valueArray[i] = null;
            }
        }

    }
    int length(){return keyArray.length;}
}
