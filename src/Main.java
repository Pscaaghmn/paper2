class Main {
    public static void main(String[] args) {
        Schedule newSchedule = new Schedule();
        newSchedule.add(new Appointment("Alice", "03:10"));
        newSchedule.add(new Appointment("Bob", "03:05"));
        newSchedule.display();
    }
}