import utils.MathBox;
import utils.ObjectBox;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        Double[] data = {12.6674, 34.0, 44.5, 1.00056, 3.14};


        Integer[] ints = {345, 78, 858, 45, 22, 90};
        MathBox mb = new MathBox(data);


        mb.dump();
        System.out.println(mb.summator());
        System.out.println(Arrays.toString(mb.splitter(2.0)));
//        mb.addObject(4);
//        mb.removeObject(45);
//        mb.dump();


    }
}
