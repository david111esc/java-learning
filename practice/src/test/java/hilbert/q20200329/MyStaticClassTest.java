package hilbert.q20200329;

import org.junit.Test;

public class MyStaticClassTest {
    @Test
    public void PublicStaticClassTest(){
        int a1 = 1;
        Integer a2 =200;
        String s1 = "s";
        MyStaticClass m1 = new MyStaticClass();
        m1.add(a1,a2, s1);
       // m1.display(0);
        m1.add(a1+1,a2+1, s1+s1);
        m1.display(0);
        m1.display(1);
    }
}