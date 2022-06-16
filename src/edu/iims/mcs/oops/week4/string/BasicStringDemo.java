package edu.iims.mcs.oops.week4.string;

public class BasicStringDemo {

    static void usingStringLiteral() {
        String s1 = "OOPS";
        String s2 = "OOPS";

        boolean isSameString = s1 == s2;
        System.out.println(isSameString);

        String s3 = "OOPS";
        String s4 = "Programming";

        System.out.println(s3 == s4);
    }

    static void usingNewKeyword() {
        String s1 = new String("OOPS");
        String s2 = new String("OOPS");

        System.out.println(s1 == s2);
    }

    static void immutableString() {
        String s1 = "Java";
        s1.concat(" Programming");
        System.out.println(s1);
    }

    static void mutableString() {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append("World");
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
//        usingStringLiteral();
//        usingNewKeyword();
//        immutableString();
        mutableString();
    }
}
