public class Throws_BuzzWord {
    public static void main(String[] args) {
       try {
        divide(0);
    } catch (Exception e) {
        e.printStackTrace();
    }

    
    }
    
    public static void  divide(int  a) throws Exception{
    

          float  ans= 10/a;
          System.out.println(ans);
      
    }
}
