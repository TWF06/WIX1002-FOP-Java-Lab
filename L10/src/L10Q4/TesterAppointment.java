package L10Q4;
public class TesterAppointment {
    public static void main(String[] args) throws Exception {
        Appointment a1 = new Appointment(10, 1, 2026, 9, 11);
        Appointment a2 = new Appointment(10, 2, 2027, 10, 12);
        if (!a1.search(10, 2, 2027, 10, 12)) {
            a1.saveToFile(a2);
            System.out.println("Appointment saved");
        } else {
            System.out.println("Time slot not available");
        }
    }
}
