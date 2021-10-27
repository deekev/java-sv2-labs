package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        //Egész számok
        int a = 2; //típusnak megfelelő
        System.out.println(a);

        Integer b = 2; //autoboxing
        System.out.println(b);

        Integer c = a; //autoboxing
        System.out.println(c);

        Integer d = b; //típusnak megfelelő
        System.out.println(d);

        Integer e = Integer.valueOf(2); //típusnak megfelelő
        System.out.println(e);

        int f = Integer.valueOf(2); //autounboxing
        System.out.println(e);

        int g = Integer.valueOf(a); //autounboxing
        System.out.println(g);

        int h = Integer.valueOf(c); //autounboxing, autounboxing
        System.out.println(h);

        int i = Integer.parseInt("2"); //típusnak megfelelő
        System.out.println(i);

        Integer j = Integer.parseInt("2"); //autoboxing
        System.out.println(j);


        //Logikai értékek
        boolean k = true; //típusnak megfelelő
        System.out.println(k);

        Boolean l = true; //autoboxing
        System.out.println(l);

        boolean m = Boolean.valueOf(true); //autounboxing
        System.out.println(m);

        Boolean n = Boolean.valueOf(true); //típusnak megfelelő
        System.out.println(n);

        boolean o = Boolean.parseBoolean("TrUe"); //típusnak megfelelő
        System.out.println(o);

        Boolean p = Boolean.parseBoolean("TrUe"); //autoboxing
        System.out.println(p);

        boolean q = Boolean.parseBoolean("TreU"); //típusnak megfelelő
        System.out.println(q);

        Boolean r = Boolean.parseBoolean("TreU"); //autoboxing
        System.out.println(r);
    }
}