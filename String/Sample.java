class Sample {  
 public static void main(String[] args) {

    String name="gomo"; //gomo hit by garbage collection 
    name="mogo";
    System.out.println(name);
    
}
}