
public class StringMantest{
    public static void main(String[] args){
        // StringMan manipulator = new StringMan();
        // String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        // System.out.println(str); // HelloWorld 

        // StringMan manipulator = new StringMan();
        // char letter = 'o';
        // Integer a = manipulator.getIndexOrNull("Coding", letter);
        // Integer b = manipulator.getIndexOrNull("Hello World", letter);
        // Integer c = manipulator.getIndexOrNull("Hi", letter);
        // System.out.println(a); // 1
        // System.out.println(b); // 4
        // System.out.println(c); // null

        // StringMan manipulator = new StringMan();
        // String word = "Hello";
        // String subString = "llo";
        // String notSubString = "world";
        // Integer a = manipulator.getIndexOrNull(word, subString);
        // Integer b = manipulator.getIndexOrNull(word, notSubString);
        // System.out.println(a); // 2
        // System.out.println(b); // null

        StringMan manipulator = new StringMan();
        String word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); // eworld

    }
}
