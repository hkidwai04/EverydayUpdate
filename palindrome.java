public class palindrome {
    public static void main(String[] args) {
        String str="racecar";
        int l=str.length();
        boolean b=true;

        for(int i=0;i<l/2;i++){

            if(str.charAt(i)!=str.charAt(l-i-1)){
               
                b=false;
                break;
            }
            
                
            

        }
        
        
        if(b){
        System.out.println("palindrome");}
        else{
            System.out.println("not a palindromke");
        }
    }

}