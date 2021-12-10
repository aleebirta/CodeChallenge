package fooBarQix;

public class FooBarQix {

    public static void main(String [] args) {
        for(int i=1;i<=100;i++) {
            System.out.println(i+" "+ fooBarQix(i));
        }
    }

    private static String compute(int n) {

        if(n==0) {
            return "";
        }

        int x=n%10;
        if(x==3)
            return compute(n/10)+"Foo";
        if(x==5)
            return compute(n/10)+"Bar";
        if(x==7)
            return compute(n/10)+"Qix";
        return "";
    }

    public static String fooBarQix(int n) {

        String toReturn = "";

        if(n%3==0) {
            toReturn = toReturn + "Foo";
        }
        if(n%5==0) {
            toReturn = toReturn + "Bar";
        }
        if(n%7==0) {
            toReturn = toReturn + "Qix";
        }

        toReturn+=compute(n);

        if(toReturn.equals(""))
            return ""+ n;
        return toReturn;
    }
}
