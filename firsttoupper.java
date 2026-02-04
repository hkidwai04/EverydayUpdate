public class firsttoupper {
public static void main(String[] args) {
    String str="hello world this is hamza";
    int l=str.length();
    String gtr="";
    gtr+=Character.toUpperCase(str.charAt(0));
    for(int i=1;i<l;i++){
        if (str.charAt(i-1)==' '){
            gtr+=Character.toUpperCase(str.charAt(i));
        }
        else{
            gtr+=str.charAt(i);
        }
       }
       
       System.out.println(gtr);
     
}    
}
