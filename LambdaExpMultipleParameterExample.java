@FunctionalInterface
interface Addable{
    int add(int a , int b,int c);
}


public class LambdaExpMultipleParameterExample {
    public static void main(String[] args) {


        Addable ad1 = (a, b, c) -> (a + b + c);
        System.out.println(ad1.add(10,20,15));

        Addable ad2 = (int a, int b, int c ) -> (a + b + c);
        System.out.println(ad2.add(100,200,150));
    }
}
