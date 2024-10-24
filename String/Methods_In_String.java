import java.lang.String;

public class Methods_In_String {
    public static void main(String[] args) {
        String name ="gomo";
        String name1="GOMO";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.equals("gomo"));
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.isEmpty());
        System.out.println(name.contains("m"));
        System.out.println(name.substring(1));//portion of strinng [crop]
        System.out.println(name.substring(1,3)); // end-1
        System.out.println(name.concat(name1));
        System.out.println(name.replace("g","G"));
        System.out.println(name.indexOf("o"));
        //join(),split(),
    }
}
