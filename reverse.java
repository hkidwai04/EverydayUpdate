class reverse{
    public static void main(String[] args) {
        String str="hello world this is hamza";
        char ch[]=str.toCharArray();
        char br[]=new char[ch.length];
        int j=0;
        for(int i=ch.length-1;i>=0;i--){
           br[j]=ch[i];
           j++;
        }
        String btr=new String(br);
        System.out.println(btr);
    }
}