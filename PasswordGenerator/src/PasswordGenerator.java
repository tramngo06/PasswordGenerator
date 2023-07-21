import java.util.Random;
import java.util.Scanner;


public class PasswordGenerator{
    // create the generator class 
    public static String[] generatePasswordStrings(int numofPassword, int lengthofPassword){
        String[] passwords = new String[numofPassword];
        Random rand = new Random();

        for(int i=0; i<numofPassword; i++){// generate the number of passwords
            StringBuilder pass = new StringBuilder();// build password into characters
            for(int j =0; j< lengthofPassword; i++){
                char randomChar = generateRandomCharacter(rand);
                pass.append(randomChar);
            }
            passwords[i] = pass.toString();
        }

        return passwords;
    }

    public static char generateRandomCharacter(Random random) {
        String numbers = "0123456789"; // range of allowed numbers
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";// range of allowed lowercase character
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";// range of allowed uppercase charcater
        String allChars = numbers + lowerCaseLetters + upperCaseLetters; // the password should should be the mix 

        int randomIndex = random.nextInt(allChars.length());
        return allChars.charAt(randomIndex);
    }
    
    public static void printPasswords(String[] passwords) {
        System.out.println("\nGenerated Passwords:");
        for (String password : passwords) {
            System.out.println(password);
        }
    }

    public static int calculateStrength(String password){
        int check =0;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumbers = false;
        boolean hasSymbols = false;
        int length = password.length();
        
        // now check the password if it qualified
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasNumbers = true;
            } else {
                hasSymbols = true;
            }
        }

        if(hasUpperCase) check++;
        if(hasLowerCase) check++;
        if(hasNumbers)check++;
        if(hasSymbols) check++;
        if(length >= 8)check++;
        if(length>=16)check++;
        // return final score after checking 
        return check;


        
    }

    // This method will tell if the pasword is Weak/Medium/Good/Great
    public static String checkStrength(int score){
        if (score <= 2) {
            return "Weak";
        } else if (score == 3) {
            return "Medium";
        } else if (score == 4) {
            return "Good";
        } else {
            return "Great";
        }
    }



    // Main class to check 

    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        //ask user how many password they want to create 
        System.out.print(" How many passwords you want to create?:");
        int numofPassword = scanner.nextInt();
        scanner.nextLine();

        //ask user what is the length of password
        System.out.print("Enter the desired length of password: ");
        int lengthofPassword = scanner.nextInt();
        scanner.nextLine();

        // Generate the passwords
        String[] passwords = generatePasswordStrings(numofPassword, lengthofPassword);
        // Print the generated passwords
        printPasswords(passwords);


        // checking the strength of password by entering the password
        
        System.out.println("Enter the password:");
        String pass = scanner.nextLine();

        int score = calculateStrength(pass);
        String strength = checkStrength(score);
        System.out.println("Your password is:" + strength);
        



        

        PasswordGenerator generator = new PasswordGenerator();
        
            System.out.print(generator);


            // closing the scanner
            scanner.close();
        }


    }
    