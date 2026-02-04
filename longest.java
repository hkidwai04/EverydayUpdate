public class longest {
    public static void main(String[] args) {
        String str="hello worlding thsi is hamza";
        String word[]=str.split(" ");
        String longestword="";
        for(int i=0;i<word.length;i++){
            if (word[i].length()>longestword.length()){
                longestword=word[i];
            }
        }

        System.out.println("longest word:"+longestword);
        System.out.println("length:"+longestword.length());

    }
}
