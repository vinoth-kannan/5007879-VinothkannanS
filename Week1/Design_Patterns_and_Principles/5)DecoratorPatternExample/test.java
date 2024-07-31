import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message to send: ");
        String message = scanner.nextLine();

        Notifier emailNotifier = new EmailNotifier();
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackSMSNotifier = new SlackNotifierDecorator(smsEmailNotifier);
        slackSMSNotifier.send(message);

        scanner.close();

    }
}