import java.util.Scanner;

public class FlamesGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first person's name: ");
        String name1 = input.nextLine();
        
        System.out.println("Enter the second person's name: ");
        String name2 = input.nextLine();
        
        String flames = "FLAMES";
        
        for (int i = 0; i < name1.length(); i++) {
            char letter = name1.charAt(i);
            if (name2.contains(String.valueOf(letter))) {
                name2 = name2.replaceFirst(String.valueOf(letter), "");
                name1 = name1.replaceFirst(String.valueOf(letter), "");
            }
        }
        
        int count = name1.length() + name2.length();
        
        while (flames.length() > 1) {
            int index = (count-1)% flames.length();
            flames = flames.substring(index+1) + flames.substring(0, index);
        }
        
        String result = "";
        
        switch(flames) {
            case "F":
                result = "Friends";
                break;
            case "L":
                result = "Lovers";
                break;
            case "A":
                result = "Affectionate";
                break;
            case "M":
                result = "Marriage";
                break;
            case "E":
                result = "Enemies";
                break;
            case "S":
                result = "Siblings";
                break;
        }
        
        System.out.println("The relationship between " + name1 + " and " + name2 + " is: " + result);
    }
}