public class JackHammer extends Equipment{
    public JackHammer(String requirements) {
        super(requirements);
    }
    public String toString() {
        return "< " + this.getRequirements()+ " >";
    }
    public boolean equals(Object other) {
        if(this==other) return true;
        if(other==null || other.getClass()!=this.getClass()) return false;
        JackHammer that = (JackHammer) other;
        return this.getRequirements().equals(that.getRequirements());
    }

}
