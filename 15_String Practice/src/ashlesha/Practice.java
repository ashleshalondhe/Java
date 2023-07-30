package ashlesha;

public class Practice {
    public static void main(String[] args) {
        // Problem 1
        String name = "Ashlesha Londhe";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "To My     Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 4
        String myLetter = "Dear Ashlesha,\n\tIt's great to learn Java.\nThanks!";
        System.out.println(myLetter);

    }
}

