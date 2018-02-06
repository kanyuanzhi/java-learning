package packageDemo2;

import packageDemo1.Demo1;

import static packageDemo1.Demo1.*;

public class Demo2 {
    public static void main(String args[]) {
        System.out.println(getInfo1());
        System.out.println(new Demo1().getInfo2());
    }
}
