/*public class StringComparePerformance {
    public static void main(String[] args){
        long starTime = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String  s1 = "hello";
            String  s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println( "create string" +":"+(endTime - starTime)+"ms");

        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("create string by String"+" : " + (endTime1 - startTime1)+"ms");
    }
}
*/