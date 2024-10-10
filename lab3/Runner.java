package lab3;

public class Runner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        boolean bool = methods.longerThan("bananas", 6);
        System.out.println(bool);

        String str1 = methods.funnyString("Math", 0);
        System.out.println(str1);
        
        String str2 = methods.halvesReversed("monster");
        System.out.println(str2);

        String str3 = methods.pigLatin("avocados");
        System.out.println(str3);
        
        String str4 = methods.removeCharacter("Google", 3);
        System.out.println(str4);

        String str5 = methods.insertAt("Jason", "Ahh!", "a");
        System.out.println(str5);

        String str6 = methods.endUp("i don't like history class", 13);
        System.out.println(str6);
        
        String str7 = methods.yellOrWhisper("How are you?");
        System.out.println(str7);
        
    }
}
