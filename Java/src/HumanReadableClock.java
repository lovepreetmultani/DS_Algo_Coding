package src;

public class HumanReadableClock {

    public static void main(String[] args) {
        var seconds = 3665;
        var formattedTime = formatTime(seconds);
        System.out.println("Human-readable time format: " + formattedTime);
    }

    public static String formatTime(int seconds) {
        if (seconds < 0 || seconds > 359999) {
            return "Invalid input";
        }

        var hours = seconds / 3600;
        var minutes = (seconds % 3600) / 60;
        var remainingSeconds = seconds % 60;

        var formattedTime = String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
        return formattedTime;
    }
}
