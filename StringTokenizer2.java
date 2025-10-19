import java.util.*;
class StringTokenizer2 {
      public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string: ");
            String str=sc.nextLine();
            StringTokenizer st=new StringTokenizer(str," ");
            String t=" ";
            int i=0;
                    for(i=0;i<2;i++){
                        t=st.nextToken();
                        char c=t.charAt(0);
                        System.out.print(c+" ");
                    }
                  t=st.nextToken();
                   System.out.println(t);     
      }
}
