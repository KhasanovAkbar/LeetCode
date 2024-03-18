import java.applet.Applet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Camel {

    protected String a ="l";

    public static int getMaxValue(List<Integer> arr) {
        //
        arr.sort(Comparator.naturalOrder());
        for (int i = 0; i < arr.size() - 1; i++) {
            if ((arr.get(i + 1) - arr.get(i)) > 1) {
                arr.set(i + 1, (arr.get(i + 1) - arr.get(i)) + 1);
            }
        }

        return arr.get(arr.size()-1);
    }


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(3);
        integers.add(5);
        int maxValue = Camel.getMaxValue(integers);
        System.out.println(maxValue);
    }

}



