@FunctionalInterface
interface Addable2 {
    int add2(int a,int b);
}

public class LambdaExpWithOrWithOutReturnKeyword {
    public static void main(String[] args) {
        Addable2 ad2 = (a , b) -> {
            return a+b;
        };
        System.out.println(ad2.add2(10,40));

        Addable2 ad3 = (a,b) -> (a + b);
        System.out.println(ad3.add2(10,40));
    }
}
