public class Schedule {
    private Appointment[] patients; // sorted array
    private int last; // index of last filled slot in array
    private final int MAX_APPOINTMENTS = 20;

    public Schedule() {
        patients = new Appointment[MAX_APPOINTMENTS];
        last = -1;
    }

    public int compareTimes(Appointment a, Appointment b){
        return a.getTime().compareTo(b.getTime());
    }

    public void add(Appointment newPatient){
        int i = 0;
        boolean foundPosition = false;

        if (last == -1){
            patients[0] = newPatient;
        } else {

            while (i <= last && !foundPosition) {
                if (compareTimes(newPatient, patients[i]) < 0) {
                    for (int j = last; j >= i; j--) {
                        patients[j + 1] = patients[j];
                    }
                    foundPosition = true;
                    patients[i] = newPatient;

                }
                i++;
            }

            if (!foundPosition){
                patients[last + 1] = newPatient;
            }
        }

        last++;
    }

    public void display(){
        for (int i = 0; i <= last; i++) {
            if (patients[i] != null){
                System.out.println(i + ": " + patients[i].getName());
            }
        }

    }
}