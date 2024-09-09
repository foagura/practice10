import javax.accessibility.AccessibleTable;

public class Practice10 {
    public static void main(String[] args){
        int a = 10;
        String str = "aの値は";

        str += a < 20 ? "20より小さいです" : "20以上です";

        System.out.println(str);
    }
}
