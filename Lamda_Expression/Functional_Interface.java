interface A{
  void display();
}

class Functional_Interface  {
    public static void main(String[] args) {
        A obj = new A(){
            public void display(){
                System.out.println("this is display method ");
            }
        };

        obj.display();

    }
}