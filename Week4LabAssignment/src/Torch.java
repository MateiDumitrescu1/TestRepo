public class Torch extends Equipment {
    public Torch(String requirements) {
        super(requirements);
    }
    public String toString() {
        return "< " + this.getRequirements()+ " >";
    }
    public boolean equals(Object other) {
        if(this==other) return true;
        if(other==null || other.getClass()!=this.getClass()) return false;
        Torch that = (Torch) other;
        return this.getRequirements().equals(that.getRequirements());
    }
}
