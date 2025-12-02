import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Float> list = new ArrayList<Float>();
        add(3.15f);
        ArrayList<Float> list = new ArrayList<Float>();
        list.add(3.15f);
        list.add(0, 3.14f);
        list.add(2.14f);

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        for (float value : list) {
            SOP(value);

        }

    }

}
