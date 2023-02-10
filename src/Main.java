
import java.util.Scanner;

public class Main {

    private static String message;
    private static int errorCode;

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение:");
        message = scanner.nextLine();// "Time for a lunch";
        System.out.println("Введите номер кода:");
        errorCode = Integer.parseInt(scanner.nextLine()); //91;
        AnonClass anon = new AnonClass();
        startLongProcess(anon.callback);

    }

    public static void startLongProcess(Callback callback) {
        callback.onStarted();
        callback.onStopped(message);
        callback.onStarted();
        callback.onFinished(errorCode);
    }

}