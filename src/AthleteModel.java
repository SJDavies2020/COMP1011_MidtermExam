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
     * 
     * @return
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id == 0) {
            throw new IllegalArgumentException("Id must be Grater than 0");
        }
        else{
            this.id = id;
        }
    }
    public int getYear() {
        return year;
    }
    public void setYearofBirth(int year) {
        if (year == 2004 || year == 2005)
        {
            this.year = year;
        }
        else{
            throw new IllegalArgumentException("Birth Year must be 2004 or 2005");
        }
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if (firstName.matches("^([a-zA-Z]+?)([-\\s'][a-zA-Z]+)*?$")) {
            this.firstName = firstName;
        }
        else{
            throw new IllegalArgumentException("I\"Input must only be text. Starting with a uppercase Letter\"");
        }
    }
    public String getLastName() {

        return lastName;
    }
    public void setLastName(String lastName) {
        if (lastName.matches("^([a-zA-Z]+?)([-\\s'][a-zA-Z]+)*?$")) {
            this.lastName = lastName;
        }
        else{
            throw new IllegalArgumentException("Input must only be text. Starting with a uppercase Letter");
        }
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if (gender.matches("^male$|^female$")) {
            this.gender = gender;
        }
        else{
            throw new IllegalArgumentException("Gender must be Lowercase and male or female");
        }
    }
    public double getRun1() {
        return run1;
    }
    public void setRun1(double run1) {
        if (run1 <= 40) {
          this.run1 = run1;
        }
        else{
            throw new IllegalArgumentException("The Run duration must be Greater than or Equal to 40");
        }
    }
    public double getRun2() {
        return run2;
    }
    public void setRun2(double run2) {
        if (run2 <= 40) {
            this.run2 = run2;
        }
        else{
            throw new IllegalArgumentException("The Run duration must be Greater than or Equal to 40");
        }

    }
    public double getCombinedTime(double run1, double run2)
    {
        double totalTime = run1 + run2;
        return totalTime;
    }
        public String CombinedTimeString(double TotalTime)
    {
        String result = String.valueOf(TotalTime);
        return result;
    };
    
    
    
    
    
}