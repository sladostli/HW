import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String strArr[] = str.split(" ");
    int numArr[] = new int[strArr.length];
    for (int i = 0; i < strArr.length; i++) {
        numArr[i] = Integer.parseInt(strArr[i]);
    }
    int n = numArr[0];
    int k = numArr[1];
   
    
    String val = scanner.nextLine();
    String valArr[] = str.split(" ");
    int valArray[] = new int[valArr.length];
    for (int j = 0; j < valArr.length; j++) {
        valArray[j] = Integer.parseInt(valArr[j]);
    }
    int count = 0;
    for (int a = 0; a < n; a++) {
      if (valArray[a] > valArray[k - 1]) {
        count += 1;
      } else{
        break;
      }
    }
    System.out.println(count);
  }
}
