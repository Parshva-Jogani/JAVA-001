import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Boolean state = true;

        int i = 0;
        String[][] emails = new String[30][2];

        while(state==true){

            System.out.print("Enter your email: ");
            String email = input.nextLine();

            emails[i][0] = email.substring(0, email.indexOf("@"));
            emails[i][1] = email.substring(email.indexOf("@")+1, email.indexOf("."));

            i++;

            System.out.print("do you want to add more? ");
            if(input.nextLine().equals("yes")){
                state = true;
            }
            else{
                state = false;
            }
        }

        for (String[] row : emails) {
            // Inner loop pulls out each String from that row
            for (String item : row) {
                if (item != null) {
                    System.out.printf("%s ", item);
                }
            }
            System.out.println();
        }
        input.close();
    }
}