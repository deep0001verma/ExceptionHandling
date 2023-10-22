public class RUNTIMEXCEPTION {
    public static void main(String[] args) {
     ALLEXC obj=new ALLEXC();
   //  obj.nullPtrE();
   //  obj.noFormatE();
    obj.multicatch();}
 static class ALLEXC{
        public void nullPtrE(){
            String s=null;
         //   System.out.println(s.toUpperCase());//exception, for this we use try catch
            try{System.out.println(s.toUpperCase());}
            catch (NullPointerException n){ System.out.println("null cannot be casted");}}
        public void noFormatE(){
            String s="ritik";
          try {  int a=Integer.parseInt(s) ;
            System.out.println(a);
            System.out.println("no.format error");}
            catch(NumberFormatException m){
                System.out.println("string " +s+ " cannot be converted into integer");}
            System.out.println("main method ended");}
        public void multicatch(){
            try{
                int a=10,b=2,c;
                c=a/b;
                System.out.println(c);

                int d[]={10,20,30};
                System.out.println(d[0]);

                String s=null;
                System.out.println(s.toUpperCase());
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array exception");}
            catch (ArithmeticException f){
                System.out.println("Arithmetic exception");}
            catch (NumberFormatException g){
                System.out.println("Number exception");}
            catch (Exception h){
                System.out.println("All type exception handled");}}
    }
}
