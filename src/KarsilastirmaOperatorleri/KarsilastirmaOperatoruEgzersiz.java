package KarsilastirmaOperatorleri;

public class KarsilastirmaOperatoruEgzersiz {
    public static void main(String[] args) {
        int a,b,c,d;
        a=10;
        b=20;
        c=10;
        d=40;

        // Eşit mi karşılaştırma
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == b);
        System.out.println(d == b);
        System.out.println(c == d);
        System.out.println(d == a);

        //Eşit değil mi karşılaştırma

        System.out.println(a != b);
        System.out.println(a != c);
        System.out.println(c != b);
        System.out.println(d != b);
        System.out.println(c != d);
        System.out.println(d != a);

        //Büyüktür karşılaştırma

        System.out.println(a > b);
        System.out.println(a > c);
        System.out.println(c > b);
        System.out.println(d > b);
        System.out.println(c > d);
        System.out.println(d > a);

        //Küçüktür karşılaştırma

        System.out.println(a < b);
        System.out.println(a < c);
        System.out.println(c < b);
        System.out.println(d < b);
        System.out.println(c < d);
        System.out.println(d < a);

        //Büyük eşittir karşılaştırma
        System.out.println(a >= b);
        System.out.println(a >= c);
        System.out.println(c >= b);
        System.out.println(d >= b);
        System.out.println(c >= d);
        System.out.println(d >= a);
        
        //Küçük eşittir karşılaştırma
        System.out.println(a <= b);
        System.out.println(a <= c);
        System.out.println(c <= b);
        System.out.println(d <= b);
        System.out.println(c <= d);
        System.out.println(d <= a);

    }
}
