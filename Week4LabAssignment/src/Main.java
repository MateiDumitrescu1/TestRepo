// Write a unit test for every method
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void swap(int[] row) {
        int temp = row[0];
        row[0] = row[1];
        row[1] = temp;
    }
    public static void main(String[] args) {
        Address a1 = new Address("Mihail Cornea", 23, "534534","Iasi");
        ConcreteMixer cm1 = new ConcreteMixer("dimensiune 3");
        ConcreteMixer cm2 = new ConcreteMixer("dimensiune 4");
        Torch t1 = new Torch("dimensiune 1");
        Date dateOfJob = new Date(20,7,2003);

        List<Equipment> listOfTools = new ArrayList<>(Arrays.asList(cm1,cm2,t1));

        Job j1 = new Job(a1,"dai gauri in perete",listOfTools,dateOfJob);
        String str = j1.toString();
        System.out.println(str);
    }
}