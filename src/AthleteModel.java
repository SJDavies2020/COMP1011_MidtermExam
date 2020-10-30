public class AthleteModel {

    private int id;
    private int year;
    private String firstName;
    private String lastName;
    private String gender;
    private double run1;
    private double run2;

   public AthleteModel(int AthleteID, int yearBorn, String fstName, String lstName, String gnder, double runRace1, double runRace2) {

        setId(AthleteID);
        setYearofBirth(yearBorn);
        setFirstName(fstName);
        setLastName(lstName);
        setGender(gnder);
        setRun1(runRace1);
        setRun2(runRace2);
        }
    /**
     * Create Getters and Setters and do validation and Execption Handeling
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYearofBirth(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getRun1() {
        return run1;
    }

    public void setRun1(double run1) {
        this.run1 = run1;
    }

    public double getRun2() {
        return run2;
    }

    public void setRun2(double run2) {
        this.run2 = run2;
    }
}