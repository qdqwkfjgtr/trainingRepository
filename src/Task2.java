public class Task2 {
    public static void main(String[] args) {
        String str="MLIII";
        int answer=romanToInt(str);
        System.out.println(answer);
    }

public static int romanToInt (String s){
        int result=0;
        for(int i=1;i<s.length();i++){
            if((s.charAt(i-1))=='I'&&(s.charAt(i)=='V')) {
                result += 4;
                continue;
            }
            if((s.charAt(i-1))=='I'&&(s.charAt(i)=='X')) {
                result += 9;
                continue;
            }
            if((s.charAt(i-1))=='X'&&(s.charAt(i)=='L')) {
                result += 40;
                continue;
            }
            if((s.charAt(i-1))=='X'&&(s.charAt(i)=='C')) {
                result += 90;
                continue;
            }
            if((s.charAt(i-1))=='C'&&(s.charAt(i)=='D')) {
                result += 400;
                continue;
            }
            if((s.charAt(i-1))=='C'&&(s.charAt(i)=='M')) {
                result += 900;
                continue;
            }
            if ((s.charAt(i-1))=='I')
                result+=1;
            if((s.charAt(i-1))=='V')
                result+=5;
            if((s.charAt(i-1))=='X')
                result+=10;
            if((s.charAt(i-1))=='L')
                result+=50;
            if((s.charAt(i-1))=='C')
                result+=100;
            if((s.charAt(i-1))=='D')
                result+=500;
            if((s.charAt(i-1))=='M')
                result+=1000;
            if(i==s.length()-1&&(s.charAt(i))=='I')
                result+=1;
            if(i==s.length()-1&&(s.charAt(i))=='V')
                result+=5;
            if(i==s.length()-1&&(s.charAt(i))=='X')
                result+=10;
            if(i==s.length()-1&&(s.charAt(i))=='L')
                result+=50;
            if(i==s.length()-1&&(s.charAt(i))=='C')
                result+=100;
            if(i==s.length()-1&&(s.charAt(i))=='D')
                result+=500;
            if(i==s.length()-1&&(s.charAt(i))=='M')
                result+=1000;
        }

        return result;
}


}
