package ashlesha;

public class Methods {
	
    public static void main(String[] args) {
    	
        String name = "Ashlesha";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Ashlesha     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('h', 'p'));
        System.out.println(name.replace("a", "ier"));

        System.out.println(name.startsWith("Ash"));
        System.out.println(name.endsWith("ahs"));

        System.out.println(name.charAt(4));

        String modifiedName = "Ashleshshsha";
        System.out.println(modifiedName.indexOf("sha"));
        System.out.println(modifiedName.indexOf("a", 4));
        System.out.println(modifiedName.lastIndexOf("Ash", 7));

        System.out.println(name.equals("Ashlesha"));
        System.out.println(name.equalsIgnoreCase("AshleSHa"));

        System.out.println("Hello I am Ashlesha!\tNice to meet u!");

    }
}
