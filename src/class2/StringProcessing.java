package class2;

public class StringProcessing {

    public static void main(String[] args) {

        String str = "Hello World!";
        int strLength = str.length();
        System.out.println("\"" + str + "\" length is " + strLength);

        char at4 = str.charAt(4); // index always start with 0
        System.out.println(at4);

        String greetingMessage = "Good Morning";
        String name = "Fair";
        String result = greetingMessage.concat(" ").concat(name); // chain calling
        System.out.println(result);

        String world = str.substring(6, 11); // position starts with 1
        System.out.println(world);

        String noL = str.replace('l', '*');
        System.out.println(noL);

        String toBeTrimmed = " This is  a sentence  ";
        toBeTrimmed = toBeTrimmed.trim();
        System.out.println(toBeTrimmed);
    }
}
