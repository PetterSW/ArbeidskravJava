import java.lang.reflect.WildcardType;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        //AddressProjects
        Address projectAddress1 = new Address("Gartnerveien 18", "BEKKESTUA", "Bærum", "1356");
        Address projectAddress2 = new Address("Skarsnuten 3", "HEMSEDAL", "Viken", "3040");

        Address WorkerBengt = new Address("Skogveien 123", "Stabekk", "Bærum", "1369");
        Address WorkerGunnleif = new Address("Kleivveien 2", "Mjøndalen", "Viken", "5302");
        Address WorkerHenrik = new Address("Kampenveien 3", "OSLO", "OSLO", "0642");
        //Workers
        Worker Bengt = new Plumber("Bengt", "Østby", WorkerBengt, 50, 170, 2000);
        Worker Gunnleif = new Electrician("Gunnleif", "Magnusson", WorkerGunnleif, 50, 230, 1000);
        Worker Henrik = new Carpenter("Henrik", "Lunde", WorkerHenrik, 100, 230, 3000);
        //Project 1
        LocalDate ld1Start = LocalDate.parse("2020-03-01");
        LocalDate ld1End = LocalDate.parse("2020-05-20");
        project p1 = new project("Prosjekt Gartnerveien", "Wibstad", projectAddress1, 18D,ld1Start, ld1End);
        p1.addWorker(Bengt);
        p1.addWorker(Gunnleif);
        p1.addWorker(Henrik);
        project.projectInfo(p1);

        //Project 2

        LocalDate ld2Start = LocalDate.parse("2020-06-01");
        LocalDate ld2End = LocalDate.parse("2020-06-03");
        project p2 = new project("Utelys", "Svarve", projectAddress2, 30D,ld2Start, ld2End);
        p2.addWorker(Gunnleif);
        Gunnleif.setHourlyRate(10);
        project.projectInfo(p2);



    }
}