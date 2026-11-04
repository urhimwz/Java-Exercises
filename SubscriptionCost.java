import java.util.Scanner;

public class SubscriptionCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("هزینه کل اشتراک را وارد کنید: ");
        String costText = input.nextLine();

        System.out.print("تعداد افراد را وارد کنید: ");
        String peopleText = input.nextLine();

        try {
            double cost = Double.parseDouble(costText);
            int people = Integer.parseInt(peopleText);

            if (cost < 0 || people < 0) {
                System.out.println("هزینه یا تعداد افراد نمی‌تواند منفی باشد.");
            } else if (people == 0) {
                System.out.println("تعداد افراد نمی‌تواند صفر باشد.");
            } else {
                double share = cost / people;
                System.out.println("سهم هر نفر: " + share);
            }
        } catch (NumberFormatException e) {
            System.out.println("ورودی نامعتبر است.");
        }

        input.close();
    }
}
