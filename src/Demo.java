import utils.MathBox;
import utils.ObjectBox;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {


        Integer[] ints = {345, 78, 858, 45, 22, 90};
        MathBox mb = new MathBox(ints);


        mb.dump();
        System.out.println(mb.summator());
        System.out.println(Arrays.toString(mb.splitter(2.0)));
        mb.addObject(4);
        mb.removeObject(45);
        mb.dump();


    }
}
