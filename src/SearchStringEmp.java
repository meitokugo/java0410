public class SearchStringEmp {
    public static void main(String[] args){
        String strOrig = "hello readers";
        int intIndex = strOrig.indexOf("Hello");
        if(intIndex==-1){
            System.out.println("hello not found");
        }else{
            System.out.println("Found hello at index"+ intIndex);
        }
    }
}
