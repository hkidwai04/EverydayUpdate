public class nospace {
    public static void main(String[] args) {
        String str = "hell wold this is hamza";
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {  
            if (ch[i] == ' ') {
                 ch[i] = ch[i + 1];
               
            }
        }

        String gtr = new String(ch);              
        System.out.println(gtr);
    }
}