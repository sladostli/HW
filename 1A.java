import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int a = scanner.nextInt();
    int length;
    if ((n / a) % 10 != 0) {
      length = (n / a) + 1;
 } else {
      length = (n / a);
    }
    int width;
    if ((m / a) % 10 != 0) {
      width = (m/a) + 1;
 } else {
      width = (m/a);
    }
     int value = length * width;

    System.out.println(value);
      
    
  }
}
