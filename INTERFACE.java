
interface  a{
    void show();
    void config();
    int a=10; // here the variables are final and static , initialization is must

}
class b implements a{

    @Override
    public void show() {
        System.out.println("IN SHOW");
    }

    @Override
    public void config() {
        System.out.println("CONFIG IN TIME ");
    }
}
public class INTERFACE {
    public static void main(String[] args) {

        System.out.println();
        b obj=new b();
        obj.config();
        obj.show();
    }
}
