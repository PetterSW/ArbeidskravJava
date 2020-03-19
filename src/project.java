import java.time.LocalDate;
import java.util.ArrayList;

public class project {
    String projectName, customer;
    Address projectAddress;
    double overheadPercent;
    LocalDate startDate, endDate;
    static int IDNumber = 0;


    //Construtor 1
    public project(String projectName, String customer, Address projectAddress, double overheadPercent) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress;
        this.overheadPercent = overheadPercent;
    }

    //Construtor 2 with dates
    public project(String projectName, String customer, Address projectAddress, double overheadPercent, LocalDate startDate, LocalDate endDate) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress;
        this.overheadPercent = overheadPercent;
        this.startDate = startDate;
        this.endDate = endDate;
    }
// Getter
    public String getName() {
        return projectName;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public Address getProjectAddress() {
        return projectAddress;
    }
    public String getCustomer() {
        return customer;
    }
    public double getTotalCost() {
        return getOverhead()+CalculateWorkerCost();
    }
    public double getWorkerCost() {return CalculateWorkerCost();}

    //Worker array
    ArrayList<Worker> workers = new ArrayList<Worker>();
    public void addWorker(Worker a) {
        workers.add(a);
    }
    //Metoder

    public double CalculateWorkerCost() {
        double workerCost = 0.0D;
        for (int i = 0; i < workers.size(); i++) {
            workerCost += workers.get(i).calculatePay();
        }
        return workerCost;
    }

    public double getOverhead(){
        return CalculateWorkerCost()*(overheadPercent/100);
    }

    //Static print out info function
    static public void projectInfo(project a){
        System.out.println("Project name: " + a.getName());
        System.out.println();
        System.out.println("Costumer: " + a.getCustomer());
        System.out.println("Address: " + a.getProjectAddress());
        System.out.println("Start date: " + a.getStartDate());
        System.out.println("End date: " + a.getEndDate());
        System.out.println();
        System.out.println("Total cost: " + a.getTotalCost());
        System.out.println("Worker cost(Included material): " + a.getWorkerCost());
        System.out.println("Overhead cost: " + a.getOverhead());
        System.out.println();
        System.out.println("Workers: ");
        for(int i = 0; i < a.workers.size(); i++){
            System.out.println(a.workers.get(i).toString());
        }
    }

}


