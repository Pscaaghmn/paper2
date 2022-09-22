public class Appointment {
    private String name;
    private String time; // represented as "hh:mm"

    public Appointment(String n, String t) {
        name = n;
        time = t;
    }
    public String getName() {
        return name;
    }
    public String getTime() {
        return time;
    }
}