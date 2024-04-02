import java.math.BigDecimal;
import java.math.RoundingMode;

public class RSA {
    private BigDecimal p, q, n, r, e, d;
    private String m, c;

    public RSA() {
        this.p = null;
        this.q = null;
        this.n = null;
        this.r = null;
        this.e = null;
        this.d = null;
    }

    public RSA(BigDecimal p, BigDecimal q, BigDecimal e, String m) {
        this.p = p;
        this.q = q;
        this.e = e;
        this.m = m;
        this.n = this.p.multiply(this.q);
        this.r = this.p.subtract(BigDecimal.ONE).multiply(this.q.subtract(BigDecimal.ONE));
        this.d = this.modularInverse(this.e, this.r);
        // System.out.println("So far all good!!!!");
    }

    private BigDecimal modularInverse(BigDecimal e, BigDecimal r) {
        // Ensure that e and r are positive
        e = e.abs();
        r = r.abs();

        // Calculate the modular inverse using the remainder
        BigDecimal inverse = new BigDecimal("1").divide(e);
        // System.out.println(inverse);
        return inverse.setScale(r.scale(), RoundingMode.HALF_UP).remainder(r);
    }

    public void encrypt() {

    }

    public void decrypt() {

    }

    public BigDecimal getN() {
        return this.n;
    }

    public BigDecimal getR() {
        return this.r;
    }

    public BigDecimal getPrivateKey() {
        return this.d;
    }
}
