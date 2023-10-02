public class ConcreteMixer extends Equipment {
    public ConcreteMixer(String requirements) {
        super(requirements);
    }
    public String toString() {
        return "< " + this.getRequirements()+ " >";
    }
    public boolean equals(Object other) {
        if(this==other) return true;
        if(other==null || other.getClass()!=this.getClass()) return false;
        ConcreteMixer that = (ConcreteMixer) other;
        return this.getRequirements().equals(that.getRequirements());
    }
}
