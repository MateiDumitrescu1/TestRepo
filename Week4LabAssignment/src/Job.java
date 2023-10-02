import java.util.List;
import java.util.ArrayList;
public class Job {
    private int jobNumber;
    private Address location;
    private static int jobTotal=0;
    private String description;
    private List<Equipment> requiredEquipment;
    private Date plannedDate;

    public Address getLocation() {
        return location;
    }

    public Date getPlannedDate() {
        return plannedDate;
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public static int getJobTotal() {
        return jobTotal;
    }

    public String getDescription() {
        return description;
    }

    public List<Equipment> getRequiredEquipment() {
        return requiredEquipment;
    }
    public Job(Address location, String description, List<Equipment> requiredEquipment, Date plannedDate) {
        this.location=location;
        this.description=description;
        this.requiredEquipment=requiredEquipment;
        this.plannedDate=plannedDate;
        Job.jobTotal++;
        this.jobNumber=Job.jobTotal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("List of required equipment ");

        String equipmentString = List.of(this.requiredEquipment).toString();
        return " Job number: " + Integer.toString(jobNumber) + " " + this.location.toString() + " Job description: " + description + " " + equipmentString + " " + this.plannedDate.toString();
    }

    public boolean equals(Object other) {
        if(this==other) return true;
        if(other==null || this.getClass()!=other.getClass()) return false;
        Job that = (Job) other;
        return this.location.equals(that.location) && this.description.equals(that.description) && this.requiredEquipment.equals(that.requiredEquipment) && this.plannedDate.equals(that.plannedDate);
    }
}
