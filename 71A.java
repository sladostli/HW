import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();

    for (int i = 0; i <= value; i++){
      String word = scanner.nextLine();
      if (word.length() > 10){
        char fChar = word.charAt(0);
        char lChar = word.charAt(word.length()-1);
        System.out.println(String.valueOf(fChar) + (word.length()-2) + String.valueOf(lChar));
        } else {
        System.out.println(word);
      }
    } 

  }
}
