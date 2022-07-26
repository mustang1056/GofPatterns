package behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
         Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
         Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
         Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

         reportNotifier.setNextNotifier(emailNotifier);
         emailNotifier.setNextNotifier(smsNotifier);

         reportNotifier.notifyManager("Everithing is ok", Priority.ROUTINE);
         reportNotifier.notifyManager("Something when wrong", Priority.IMPORTANT);
         reportNotifier.notifyManager("Houston", Priority.ASAP);

    }
}
