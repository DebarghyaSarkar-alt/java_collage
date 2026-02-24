import java.util.Scanner;
class str{
    String str1;
    String str2="";
    void func(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
         str1=sc.nextLine();
         for(int i = 0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(Character.isUpperCase(ch)){
                str2=str2+Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                str2=str2+Character.toUpperCase(ch);
            }
            
         }
            System.out.println("Modified string: "+str2);
            str2="";
            for(int i = 0;i<str1.length();i++){
                char ch = str1.charAt(i);
                str2=ch+str2;
            }
            System.out.println("Reversed string: "+str2);
            str2="";
            System.out.println("eneter string to compare");
            str2=sc.nextLine();
            System.out.println("the diff in ascii values is: "+(str1.compareTo(str2)));
            System.out.println("Enter string to be inserted in 1st string");
            str2=sc.nextLine();
            str1=str1+" "+str2;
            System.out.println("After concatenation: "+str1);
            System.out.println("enter a string");
            str1=sc.nextLine();
            System.out.println("uppercase: "+str1.toUpperCase());
            System.out.println("lowercase: "+str1.toLowerCase());
            

    }

}
public class lb5_2 {
    
}
