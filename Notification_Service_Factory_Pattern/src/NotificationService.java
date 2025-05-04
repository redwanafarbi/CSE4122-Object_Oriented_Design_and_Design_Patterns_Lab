public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification1 = NotificationFactory.createNotification("SMS");
        notification1.notifyUser("From Factory : SMS");

        Notification notification2 = NotificationFactory.createNotification("Email");
        notification2.notifyUser("From Factory : Email");

        Notification notification3 = NotificationFactory.createNotification("Push");
        notification3.notifyUser("From Factory : Push");

    }
}
