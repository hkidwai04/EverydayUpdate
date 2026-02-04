public class specific {
    public static void main(String[] args) {
        String str="hello world this is hamxa ";
        int count=0;
        for(int x=0;x<str.length()-1;x++){
            if (str.charAt(x)=='a'){
              count++;
            }
        }
        System.out.println("number of times 'a' in the string: "+count );
    
    
    
    }
}
