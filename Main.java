import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writter = new BufferedWriter(new FileWriter("q.txt", true));
        ) {
            boolean wr = true;
            while (wr) {
            int c = 1;
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            writter.write(c + " " + str);
            writter.append("\n");
            c++;
            if(str.equals("stop")) {
                writter.close();
                wr = false;
            }
            }
        } catch (IOException e) {
            System.out.println("Eror");
        }
        try (
        BufferedReader reader = new BufferedReader(new FileReader("q.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("Eror");
        }
    }
}