import java.util.Scanner;

public class NotificationSettings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean notificationsEnabled = true;

        System.out.println("1. فعال‌کردن اعلان‌ها");
        System.out.println("2. غیرفعال‌کردن اعلان‌ها");
        System.out.println("3. مشاهده وضعیت اعلان‌ها");
        System.out.println("4. بازگرداندن تنظیمات پیش‌فرض");
        System.out.print("انتخاب شما: ");

        String choiceText = input.nextLine();

        try {
            int choice = Integer.parseInt(choiceText);

            switch (choice) {
                case 1:
                    notificationsEnabled = true;
                    System.out.println("اعلان‌ها فعال شدند.");
                    break;

                case 2:
                    notificationsEnabled = false;
                    System.out.println("اعلان‌ها غیرفعال شدند.");
                    break;

                case 3:
                    if (notificationsEnabled) {
                        System.out.println("وضعیت اعلان‌ها: فعال");
                    } else {
                        System.out.println("وضعیت اعلان‌ها: غیرفعال");
                    }
                    break;

                case 4:
                    notificationsEnabled = true;
                    System.out.println("تنظیمات به حالت پیش‌فرض بازگشت.");
                    break;

                default:
                    System.out.println("گزینه نامعتبر است.");
            }
        } catch (NumberFormatException e) {
            System.out.println("گزینه نامعتبر است.");
        }

        input.close();
    }
}
