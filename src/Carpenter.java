public class Carpenter extends Worker {
    double lumberCosts;

    //Contructor
    public Carpenter(String firstName, String lastName, Address address, double hoursWorked, double hourlyRate, double lumberCosts) {
        super(firstName, lastName, address, hoursWorked, hourlyRate);
        this.lumberCosts = lumberCosts;
    }

    @Override
    public String toString() {
        return super.toString() + " | Matriellkostnad: " + lumberCosts;
        }


    public String doWork(){
        return "Complete carpentry work";
    }

    public double calculatePay() {
        return super.calculatePay()+lumberCosts;
    }
    public void setLumberCosts(double lumberCosts){
        this.lumberCosts = lumberCosts;
    }
}
