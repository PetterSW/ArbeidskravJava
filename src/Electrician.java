public class Electrician extends Worker {
    double wiringCosts;

    public Electrician(String firstName, String lastName, Address address, double hoursWorked, double hourlyRate, double wiringCosts) {
        super(firstName, lastName, address, hoursWorked, hourlyRate);
        this.wiringCosts = wiringCosts;
    }


    public String doWork(){
        return "Install the electrician";
    }

    @Override
    public String toString() {
        return super.toString() + " | Med en installeringskostnad på:" + wiringCosts;
    }

    public double calculatePay(){
        return super.calculatePay()+wiringCosts;
    }

    public void setWiringCosts(double wiringCosts) {
        this.wiringCosts = wiringCosts;
    }
}

