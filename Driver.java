import java.math.BigInteger;

public class Driver {
    public static void main(String[] args) {
        String_Bits o = new String_Bits();
        String binary = o.stringToBits(
                "NY BHBS BJSBJB SJHSJH SJHJHS JSHJHJ SHJHJ SJHJH SHJH SJHJH SJHJH SJHJH SJHJHJHJ JHJHJS HJHJHS JUHJHJS ");
        System.out.println(binary);
        BigInteger decimalNumber = new BigInteger(binary, 2);

        System.out.println("Decimal representation: " + decimalNumber);
    }
}