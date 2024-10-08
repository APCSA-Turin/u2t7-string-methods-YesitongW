import java.util.Scanner;
public class RectangleRunner {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter First String: ");
       String str1 = sc.next();
       System.out.print("Enter Second String: ");
       String str2 = sc.next();

       if(str1.length() > str2.length()){
        System.out.println(str1+" is longer");
       }
       else if (str1.length() < str2.length()){
        System.out.println(str2+" is longer");
       }
       else {
        System.out.println("Both strings have the same length");
       }

       int first = str1.length();
       System.out.println("First half: "+ str1.substring(0, first/2));
       System.out.println("Second half: "+ str1.substring(first/2));

       int second = str2.length();
       System.out.println("First half: "+ str2.substring(0, second/2));
       System.out.println("Second half: "+ str2.substring(second/2));

       int index = str1.indexOf(str2);
       if (index != -1) {
           System.out.println("\"" + str2 + "\" is found in \"" + str1 + "\" at index " + index);
       } else {
           System.out.println("\"" + str2 + "\" is NOT found in \"" + str1 + "\"");
       }
       sc.close();
    }
}
