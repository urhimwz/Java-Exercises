import java.util.Scanner;

public class InternetPackage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("حجم بسته را بر حسب گیگابایت وارد کنید: ");
        String volumeText = input.nextLine();

        System.out.print("موجودی کیف پول را به تومان وارد کنید: ");
        String balanceText = input.nextLine();

        try {
            double volume = Double.parseDouble(volumeText);
            double balance = Double.parseDouble(balanceText);

            if (volume <= 0 || balance < 0) {
                System.out.println("حجم بسته یا موجودی واردشده نامعتبر است.");
            } else {
                double price = volume * 5000;

                if (volume > 10) {
                    price = price * 0.85;
                }

                if (balance >= price) {
                    double remaining = balance - price;
                    System.out.println("خرید با موفقیت انجام شد.");
                    System.out.println("موجودی باقی‌مانده: " + remaining + " تومان");
                } else {
                    double shortage = price - balance;
                    System.out.println("موجودی کاربر کافی نیست.");
                    System.out.println("مبلغ کسری: " + shortage + " تومان");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("حجم بسته یا موجودی واردشده نامعتبر است.");
        }

        input.close();
    }
}
