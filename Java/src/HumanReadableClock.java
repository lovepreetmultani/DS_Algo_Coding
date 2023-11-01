package src;

public class HumanReadableClock {

    public static void main(String[] args) {
        int seconds = 3665;
        String formattedTime = formatTime(seconds);
        System.out.println("Human-readable time format: " + formattedTime);
    }

    public static String formatTime(int seconds) {
        if (seconds < 0 || seconds > 359999) {
            return "Invalid input";
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
        return formattedTime;
    }
}
