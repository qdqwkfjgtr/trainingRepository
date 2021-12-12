public class Task3 {
    public static void main(String[] args) {
        String[] s={"susqx","susd","susx"};
        String x=prefix(s);
        System.out.println(x);
    }
    public static String prefix(String[] s){
        String result=s[0];
        for(int i=1;i<s.length;i++)
        {
            if(result.length() > s[i].length())
                result = result.substring(0,s[i].length());
            while(!s[i].startsWith(result) && result.length() >= 1)
                result = result.substring(0,result.length() -1);
            if(result.equals(""))
                return result;
        }
        return result;
    }
}
