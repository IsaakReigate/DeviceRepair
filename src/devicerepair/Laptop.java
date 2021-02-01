package devicerepair;
import java.util.ArrayList;


public class Laptop extends Device {

    public Laptop(int priority, String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes);
        this.priority = priority;
    }

    private int priority;
    public ArrayList<Components> Components = new ArrayList<>();
    public boolean isChargable;
    
    
    
    
    
    public ArrayList<Components> getComponents() {
        return Components;
    }

    public void addComponents(ArrayList<Components> Components) {
        this.Components = Components;
    }

    
    
    
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    
    
    
    public boolean isIsChargable() {
        return isChargable;
    }

    public void setIsChargable(boolean isChargable) {
        this.isChargable = isChargable;
    }
    
    
    
}
