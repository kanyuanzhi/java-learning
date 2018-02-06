public class Test {
    public static void main(String args[]) {
        String aa = "12.4645";
        System.out.println(Float.parseFloat(aa));
        System.out.println(args[0]);
        int i=13;
        int j =0;
        try {
            int d = Integer.parseInt(args[1]);
            int temp = i/j;
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("===========END==========");
    }
}
