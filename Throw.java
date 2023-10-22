public class Throw {
    public static void main(String[] args) {
        //System.out.println(10/0);//implictly by jvm
        throw new ArithmeticException("/by zero");//explicitly by throw
    }
}
