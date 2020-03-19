public class Plumber extends Worker{
    double plumbingCosts;
//Constructor
    public Plumber(String firstName, String lastName, Address address, double hoursWorked, double hourlyRate, double plumbingCosts) {
        super(firstName, lastName, address, hoursWorked, hourlyRate);
        this.plumbingCosts = plumbingCosts;
    }

    @Override
    public String toString() {
        return super.toString() + " | Rørmatriellkostnad på: " + plumbingCosts;
    }

    public String doWork() {
        return "Install plumbing";
    }

    public double calculatePay() {
        return super.calculatePay()+plumbingCosts;
    }

    public void setPlumbingCosts(double plumbingCosts){
        this.plumbingCosts = plumbingCosts;
    }
}
