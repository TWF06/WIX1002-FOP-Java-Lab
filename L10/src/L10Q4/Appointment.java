package L10Q4;

import java.io.*;

public class Appointment implements Searchable {
    private int day, month, year;
    private int startTime, endTime;

    public Appointment(int day, int month, int year,
                       int startTime, int endTime) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void saveToFile(Appointment a2) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("appointments.txt", true));
        bw.write(a2.day + "," + a2.month + "," + a2.year + "," + a2.startTime + "," + a2.endTime);
        bw.newLine();
        bw.close();
    }

    @Override
    public boolean search(int d, int m, int y, int s, int e) {
        if (day == d && month == m && year == y) {
            return !(e <= startTime || s >= endTime);
        }
        return false;
    }
}

