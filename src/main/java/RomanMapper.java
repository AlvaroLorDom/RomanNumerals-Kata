import java.util.HashMap;
import java.util.Map;

public class RomanMapper {
    private static final Map<Integer,String> VALUESMAP = new HashMap<>();
    static {
        VALUESMAP.put(1,"I");
        VALUESMAP.put(2,"II");
        VALUESMAP.put(3,"III");
        VALUESMAP.put(4,"IV");
        VALUESMAP.put(5,"V");
        VALUESMAP.put(6,"VI");
        VALUESMAP.put(7,"VII");
        VALUESMAP.put(8,"VIII");
        VALUESMAP.put(9,"IX");
        VALUESMAP.put(10,"X");
        VALUESMAP.put(20,"XX");
        VALUESMAP.put(30,"XXX");
        VALUESMAP.put(40,"XL");
        VALUESMAP.put(50,"L");
        VALUESMAP.put(60,"LX");
        VALUESMAP.put(70,"LXX");
        VALUESMAP.put(80,"LXXX");
        VALUESMAP.put(90,"XC");
        VALUESMAP.put(100,"C");
        VALUESMAP.put(200,"CC");
        VALUESMAP.put(300,"CCC");
        VALUESMAP.put(400,"CD");
        VALUESMAP.put(500,"D");
        VALUESMAP.put(600,"DC");
        VALUESMAP.put(700,"DCC");
        VALUESMAP.put(800,"DCCC");
        VALUESMAP.put(900,"MC");
        VALUESMAP.put(1000,"M");
        VALUESMAP.put(2000,"MM");
        VALUESMAP.put(3000,"MMM");
    }

    public static String getNumber(int[] brokenNumber) {
        return VALUESMAP.get(power(brokenNumber[1])*brokenNumber[0]);
    }

    private static int power(int index) {
        return (int)Math.pow(10,index);
    }
}