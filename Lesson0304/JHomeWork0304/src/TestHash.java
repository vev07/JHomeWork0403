import java.util.Arrays;

public class TestHash {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";


        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str.equals(str2));


    }
}
