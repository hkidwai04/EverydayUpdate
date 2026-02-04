public class vovel {
    public static void main(String[] args) {
        String str="this is a boy his name is hamza";
        int count=0;
        int l=str.length();
        for(int i=0;i<l;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
          } 
            }
            System.out.println(count);
       
    }
}
