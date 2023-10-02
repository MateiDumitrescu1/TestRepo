public class ScaffoldingTower extends Equipment {
    public ScaffoldingTower(String requirements) {
        super(requirements);
    }
    public String toString() {
        return "< " + this.getRequirements()+ " >";
    }
    public boolean equals(Object other) {
        if(this==other) return true;
        if(other==null || other.getClass()!=this.getClass()) return false;
        ScaffoldingTower that = (ScaffoldingTower) other;
        return this.getRequirements().equals(that.getRequirements());
    }
}
