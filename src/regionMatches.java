public class regionMatches {
    public static void main(String[] args){
        String first_str = "welcome to Microsoft";
        String second_str = "I work with microsoft";
        boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);
        System.out.println("qufendaxiaoxie："+match1);
        System.out.println("buqufen:" + match2);

    }
}
