
package devicerepair;

public class Device {
    
    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String Owner;
    protected String ProblemDescription;
    protected String RepairNotes;

    //constructor
    public Device(String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes) {
        this.IdentificationCode = IdentificationCode;
        this.MakeAndModel = MakeAndModel;
        this.Owner = Owner;
        this.ProblemDescription = ProblemDescription;
        this.RepairNotes = RepairNotes;
    }

    public int priorityRank(){
        //PRIORITY RANK METHOD HERE
    }
    
    public String toString(){
        //TO STRING METHOD HERE
    }
    
    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public void setIdentificationCode(String IdentificationCode) {
        this.IdentificationCode = IdentificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public void setMakeAndModel(String MakeAndModel) {
        this.MakeAndModel = MakeAndModel;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String ProblemDescription) {
        this.ProblemDescription = ProblemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public void setRepairNotes(String RepairNotes) {
        this.RepairNotes = RepairNotes;
    }
    
    
}
