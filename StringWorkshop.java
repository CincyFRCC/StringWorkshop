import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        stringworks();
    }

    public static void stringworks() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type the Starting string : ");
        String ststring = in.nextLine();
        String outputstring = "", content = "", suffix = "";
        int option = 0;
        while (option != 7) {
            System.out.println("Pick an Option : \n1. Add content \n2. Check if string contains substring\n3. Output length\n4. Output substring after prefix\n5. Output substring before suffix\n6. Output substring between prefix and suffix\n7. Exit");
            option = in.nextInt();
            in.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.print("Content  : ");
                    content = in.nextLine();
                    ststring = ststring + content;
                    outputstring = "Current string: " + ststring;
                }
                case 2 -> {
                    System.out.print("Substring  : ");
                    content = in.nextLine();
                    if (ststring.contains(content)) {
                        outputstring = ststring + " contains substring " + content + ".";
                    } else {
                        outputstring = ststring + " does not contain substring " + content + ".";
                    }
                }
                case 3 -> outputstring = "The length of the string " + ststring + " is " + ststring.length() + ".";
                case 4 -> {
                    System.out.print("Prefix  : ");
                    content = in.nextLine();
                    outputstring = "Substring :" + ststring.substring(ststring.indexOf(content) + content.length());
                }
                case 5 -> {
                    System.out.print("Suffix  : ");
                    content = in.nextLine();
                    outputstring = "Substring :" + ststring.substring(0, ststring.indexOf(content));
                }
                case 6 -> {
                    System.out.print("Prefix  : ");
                    content = in.nextLine();
                    System.out.print("Suffix  : ");
                    suffix = in.nextLine();
                    outputstring = "Substring :" + ststring.substring(ststring.indexOf(content) + content.length(), ststring.indexOf(suffix));
                }
                case 7 -> outputstring = "Exiting the program.";
                default -> outputstring = "Invalid option. Please choose a number between 1 and 7.";
            }
            System.out.println(outputstring + "\n");
        }
    }
}
