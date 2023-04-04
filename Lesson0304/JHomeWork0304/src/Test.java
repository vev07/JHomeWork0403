import java.util.Scanner;

public class Test {
    /*
        Создать метод, в котором будем спрашивать возраст.
    для возрастных групп: до 18, от 18 до 40 от 40.
    В первом методе спросить в какие игры играет человек
    Во втором спросить сколько человек зарабатывает
              спросить есть ли у человека автомобиль
       В третьем купил ли но дом.

     */

    public static void main(String[] args) {
        howOldAreYou();

    }
    public static void howOldAreYou() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("What do you like game play?");
            String game = scanner.next();
            System.out.println(" You ara " + age + ". You like play in " + game + ".");

        } else if (age > 17 && age < 40) {
            System.out.println("How much do you earn");
            double money = scanner.nextDouble();
            System.out.println("Do you have car? You can call it.");
            String car = scanner.next();
            System.out.println(" You ara " + age + ". Your car call " + car+ ".");
            
        } else {
            System.out.println("Could you bay home or you can't?.Enter yes or not");
            String home = scanner.nextLine();
            System.out.println(" You ara " + age + ". You answered for a question about home - "
                    + home + ".");

        }

    }
}
