package Java101;
    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("İlk sayıyı giriniz: ");
            double num1 = scanner.nextDouble();

            System.out.print("İkinci sayıyı giriniz: ");
            double num2 = scanner.nextDouble();

            System.out.print("İşlemi seçiniz (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Hata: 0'a bölme hatası!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Geçersiz operatör!");
                    return;
            }

            System.out.println("Sonuç: " + result);
}

        {
        }
    }
