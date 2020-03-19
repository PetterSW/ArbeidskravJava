public class Worker {
    String firstName, lastName;
    Address address;
    double hoursWorked, hourlyRate;

    //Construtor
    public Worker(String firstName, String lastName, Address address, double hoursWorked, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +" Addresse: "+ address + " | Antall timer: "+ hoursWorked +
                ", med en timelønn på: " + hourlyRate;
    }
}
