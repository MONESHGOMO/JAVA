
public class sb{
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<26 ;i++){
            char ch=(char)('a'+ i);
            builder.append(ch);
        }
        System.out.print(builder);
        System.out.println(builder.capacity());


    }
}
