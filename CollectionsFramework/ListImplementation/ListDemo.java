package ListImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {


        // Using ArrayList (not synchronized)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Toyota");
        arrayList.add("Honda");
        arrayList.add("Ford");
        arrayList.add("BMW");
        arrayList.add("Mercedes");

        // Using Vector (synchronized)  but it is a legacy class from java v10 
        List<String> vectorList = new Vector<>();
        vectorList.add("Apple");
        vectorList.add("Samsung");
        vectorList.add("Google");
        vectorList.add("OnePlus");
        vectorList.add("Nokia");

        System.out.println("🚗 Car Brands (ArrayList):");
        for (String car : arrayList) {
            System.out.println(car);
        }

        System.out.println("\n📱 Phone Brands (Vector):");
        for (String phone : vectorList) {
            System.out.println(phone);
        }
    }
}

