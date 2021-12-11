public class Task1 {
    public static void main(String[] args) {
        String s="qwe xas qwe zxcd";
        String lastWord =s.substring(s.lastIndexOf(" ")+1);
        int result=lastWord.length();
        System.out.println(result);

    }
}
