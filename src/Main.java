import java.util.Scanner;

public class Main {
  private static final Scanner input = new Scanner(System.in);
  private static String string;

  public static void main(String[] args) {
    boolean calculated = false;
    int weakHash = 0;
    int strongHash = 0;
    while (true) {
      System.out.println("1. Ввод строки");
      System.out.println("2. Выполнение алгоритма");
      System.out.println("3. Вывод результата");
      System.out.println("4. Завершение работы алгоритма");
      int choice = 0;
      if (input.hasNextInt()) {
        choice = input.nextInt();
        input.nextLine();
      } else {
        input.skip(".*\n");
      }
      switch (choice) {
        case 1:
          string = inputString();
          System.out.println("Строка введена");
          calculated = false;
          break;
        case 2:
          if (string == null) {
            System.out.println("Строка не введена");
            break;
          } else {
            weakHash = getWeakHash(string);
            strongHash = getStrongHash(string);
            calculated = true;
            System.out.println("Алгоритм выполнен");
            break;
          }
        case 3:
          if (calculated) {
            System.out.println("Строка: " + string);
            System.out.println("Слабый хэш: " + weakHash);
            System.out.println("Сильный хэш: " + strongHash);
            break;
          }
          System.out.println("Алгоритм не выполнен");
          break;
        case 4:
          System.out.println("Программа завершена");
          System.exit(0);
          break;
        default:
          System.out.println("Ошибка ввода");
          break;
      }
    }
  }

  // Метод получает ввод пользователя и возвращает строку
  public static String inputString() {
    System.out.println("Введите строку: ");
    return input.nextLine();
  }

  // Метод получает строку и возвращает слабый хэш
  public static int getWeakHash(String str) {
    WeakHash weak = new WeakHash();
    return weak.hash(str);
  }

  // Метод получает строку и возвращает сильный хэш
  public static int getStrongHash(String str) {
    StrongHash strong = new StrongHash();
    return strong.hash(str);
  }
}
