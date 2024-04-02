import java.math.BigDecimal;

public class Driver {
    public static void main(String[] args) {
        /*
         * String_Bits o = new String_Bits();
         * String binary = o.stringToBits(
         * "NY BHBS BJSBJB SJHSJH SJHJHS JSHJHJ SHJHJ SJHJH SHJH SJHJH SJHJH SJHJH SJHJHJHJ JHJHJS HJHJHS JUHJHJS "
         * );
         * System.out.println(binary);
         * BigInteger decimalNumber = new BigInteger(binary, 2);
         * 
         * System.out.println("Decimal representation: " + decimalNumber);
         */
        BigDecimal p = new BigDecimal("120");
        BigDecimal q = new BigDecimal("100");
        BigDecimal e = new BigDecimal("4");
        RSA obj = new RSA(p, q, e, "Hello");
        System.out.println(obj.getN());
        System.out.println(obj.getR());
        System.out.println(obj.getPrivateKey());
    }
}