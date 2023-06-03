import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(Home(18,40));
        System.out.println(Home(24,21));
        System.out.println(Home(generateRandomAge(),30));
        System.out.println(Home(generateRandomAge(),27));
        System.out.println(Home(50,-25));
    }

    public static String Home(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30){
            return "Можно идти гулять";
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp >= -10 && temp <= 25) {
            return "Оставайтесь дома";
        }else {
            return "Оставайтесь дома";
        }

    }
    public static int  generateRandomAge(){
        int age = 1 + ((int)(Math.random() * 100) );
        return age;
    }
}