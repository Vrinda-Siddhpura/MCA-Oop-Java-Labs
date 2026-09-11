class Time {
    int hour;
    int min;
    int sec;

    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    void AddSeconds(int seconds) {
        int totalSec = this.sec + seconds;
        int totalMin = this.min + totalSec/60;
        int totalHour = this.hour + totalMin/60;

        totalSec %= 60;
        totalMin %= 60;

        System.out.printf("%02d : %02d : %02d", totalHour, totalMin, totalSec);
        System.out.println();
    }

    void SubtractSeconds(int seconds) {
        int totalSec = this.hour*3600 + this.min*60 + this.sec;

        totalSec = totalSec - seconds;

        int totalHour = totalSec / 3600;
        int totalMin = (totalSec % 3600) / 60;
        int totalSecond = totalSec % 60;

        System.out.printf("%02d : %02d : %02d", totalHour, totalMin, totalSecond);
    }
}

public class P4 {
    public static void main(String[] args) {

        Time t = new Time(2, 30, 45);

        t.AddSeconds(50);
        t.SubtractSeconds(30);
    }
}