package Notes;

public class Instructor {
    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numberOfInstructors = 0;

    public Instructor(String first, String last){
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0;
        numberOfInstructors++;
        System.out.printf("\tInstructor %s has been created!\n",firstName);
        System.out.printf("\tInstructor count is %d\n\n",numberOfInstructors);
    }
    // First name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    // Last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    // Brainwave
    public int getBrainWaveFrequency() {
        return brainWaveFrequency;
    }

    public void setBrainWaveFrequency(int brainWave) {
        this.brainWaveFrequency = brainWave;
    }

    // Notes.Instructor stats
    public String instructorStats(){
        return String.format("\t%s %s , Brainwave Frequency: %d\n",firstName,lastName,brainWaveFrequency);
    }



}
