package hilbert.q20200329;

import java.util.LinkedList;
import java.util.List;

public class MyStaticClass {
    public List<PublicStaticClass> myList = new LinkedList<PublicStaticClass>();
    
    public void add(int a,Integer a2,String s){
        PublicStaticClass temp = new PublicStaticClass(a,a2,s);
        this.myList.add(temp);
    }

    public void display(int i){
        System.out.println("######### " + i + " #########");
        System.out.println("######### " +  this.myList.get(i).toString() + " #########");
       
        this.myList.get(i).display();

    }

    public static class PublicStaticClass {
        // public
        public int int_1;
        public Integer integer_1;
        public String string_1;
        // static
        public static int s_int_1;
        public static Integer s_integer_1;
        public static String s_string_1;
        // final
        public final int f_int_1;
        public final Integer f_integer_1;
        public final String f_string_1;
        // final static

        public static final int s_f_int_1 = 1;
        public static final Integer s_f_integer_1 = 200;
        public static final String s_f_string_1 = "s";

        public PublicStaticClass(int first_int,Integer integer_1, String first_string) {
            // public
            this.int_1 = first_int;
            this.integer_1 = integer_1;
            this.string_1 = first_string;
            // static
            s_int_1 = first_int;
            s_integer_1 = integer_1;
            s_string_1 = first_string;
            // final
            this.f_int_1 = first_int;
            this.f_integer_1 = integer_1;
            this.f_string_1 = first_string;

        }

        public void display() {
            // public
            System.out.println("=== public ===");
            displayInt("[public int]", this.int_1);
            displayInt("[public Integer]", this.integer_1);
            displayString("[public String]", this.string_1);
            // static
            System.out.println("=== static ===");
            displayInt("[static int]", s_int_1);
            displayInt("[static Integer]", s_integer_1);
            displayString("[static String]", s_string_1);
            // final
            System.out.println("=== final ===");
            displayInt("[final int]", this.f_int_1);
            displayInt("[final Integer]", this.f_integer_1);
            displayString("[final String]", this.f_string_1);
            // static final
            System.out.println("=== static final ===");
            displayInt("[static final int]", s_f_int_1);
            displayInt("[static final Integer]", s_f_integer_1);
            displayString("[static final String]", s_f_string_1);
        }

        public static void displayInt(String name, int number) {
            System.out.println(name + " = " + number);
        }

        public static void displayString(String name, String str) {
            System.out.println(name + " = " + str);
        }
    }

}
