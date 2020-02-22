package ping;


public class ObjectReferenceProblemMain {
    public static void main(String[] args) {
        IntegerEqualTest();
        StringEqualTest();
        IntegerNullTest();
        StringNullTest();
        IntegerChangeTest();
        BagChangeElementTest();
    }

    public static void IntegerEqualTest() {
        System.out.println("[Integer Equal Test]");
        Integer a1Integer = 1;
        Integer a1IntegerMock = a1Integer;
        Integer a2Integer = 1;
        Integer a2IntegerMock = a2Integer;
        int a3Int = 1;
        Integer a3IntMock = a3Int;
        int a4Int = 1;

        checkEqualAndOutput(a1Integer == a1IntegerMock);
        checkEqualAndOutput(a1Integer.equals(a1IntegerMock));
        checkEqualAndOutput(a1Integer == a2Integer);
        checkEqualAndOutput(a1Integer.equals(a2Integer));
        checkEqualAndOutput(a1Integer == a2IntegerMock);
        checkEqualAndOutput(a1Integer.equals(a2IntegerMock));
        checkEqualAndOutput(a1Integer == a3Int);
        checkEqualAndOutput(a1Integer.equals(a3Int));
        checkEqualAndOutput(a1Integer == a3IntMock);
        checkEqualAndOutput(a1Integer.equals(a3IntMock));

        checkEqualAndOutput(a1IntegerMock == a2Integer);
        checkEqualAndOutput(a1IntegerMock.equals(a2Integer));
        checkEqualAndOutput(a1IntegerMock == a2IntegerMock);
        checkEqualAndOutput(a1IntegerMock.equals(a2IntegerMock));

        checkEqualAndOutput(a3IntMock == a3Int);
        checkEqualAndOutput(a3IntMock.equals(a3Int));
        checkEqualAndOutput(a3IntMock == a4Int);
        checkEqualAndOutput(a3IntMock.equals(a4Int));

        checkEqualAndOutput(a4Int == a3Int);

    }

    public static void StringEqualTest() {
        System.out.println("[String Equal Test]");
        String a1String = "111";
        String a1StringMock = a1String;
        String b1String = "111";
        String c1String = "1" + "11";
        String d1String = new String("111");
        String d1StringMock = d1String;
        String e1String = new String("111");
        checkEqualAndOutput(a1String == a1StringMock);
        checkEqualAndOutput(a1String.equals(a1StringMock));
        checkEqualAndOutput(a1String == b1String);
        checkEqualAndOutput(a1String.equals(b1String));
        checkEqualAndOutput(a1String == c1String);
        checkEqualAndOutput(a1String.equals(c1String));
        checkEqualAndOutput(b1String == c1String);
        checkEqualAndOutput(b1String.equals(c1String));
        System.out.println("=========================-");
        System.out.println("Test: a1String == d1String");
        checkEqualAndOutput(a1String == d1String);
        System.out.println("=========================-");
        checkEqualAndOutput(a1String.equals(d1String));
        checkEqualAndOutput(d1String == d1StringMock);
        checkEqualAndOutput(d1String.equals(d1StringMock));
        System.out.println("=========================-");
        System.out.println("Test: d1String == e1String");
        checkEqualAndOutput(d1String == e1String);
        System.out.println("=========================-");
        checkEqualAndOutput(d1String.equals(e1String));
    }



    public static void IntegerNullTest() {
        System.out.println("[Integer Null Test]");
        Integer first = 1;
        Integer second = first;

        first = null;
        checkEqualAndOutput(null == second);
    }


    public static void IntegerChangeTest() {
        System.out.println("[Integer Change Test]");
        Integer first = 1;
        Integer second = first;
        first = first + 1;
        checkEqualAndOutput(first == second);
        System.out.println("first= " + first + ", second= " + second);
    }

    public static void StringNullTest() {
        System.out.println("[String Null Test]");
        String first = "1";
        String second = first;
        first = null;
        checkEqualAndOutput(null == second);

    }

    public static void announceNumberOfTest(String number) {
        System.out.println("Test " + number);
    }

    public static void checkEqualAndOutput(Boolean b) {
        if (b) {
            System.out.println("Equal!");
        } else {
            System.out.println("Not Equal!");
        }
    }

   

    public static void BagChangeElementTest() {
        System.out.println("[Bag Change Element Test]");
        Bag A = new Bag(3);
        Bag B = A;
        checkEqualAndOutput(A==B);
        checkEqualAndOutput(A.equals(B));
        System.out.println("A= " + A.getFruitNumber());
        System.out.println("B= " + B.getFruitNumber());
        A.setFruitNumber(5);
        System.out.println("A.setFruitNumber(5)");
        System.out.println("A= " + A.getFruitNumber());
        System.out.println("B= " + B.getFruitNumber());
        
    }
}
