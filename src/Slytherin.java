public class Slytherin extends Нogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustPower;
    public Slytherin(String nameStudent, int powerMagic, int transgressionDistance,int trick, int determination,
                     int ambition, int resourcefulness, int lustPower) {
        super(nameStudent,powerMagic,transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
    }
    public int getTrick(){
        return trick;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getLustPower() {
        return lustPower;
    }
    public int properties() {
        return trick + determination + ambition + resourcefulness + lustPower;
    }
    public String toString() {
        System.out.println(super.toString());
        return " факультет Слизерин, хитрость " + trick + ", решительность " + determination + ", амбициозность "
                + ambition + ", находчивость " + resourcefulness+ ", жажда власти " + lustPower;
    }
    public boolean equals(Object i){
        if (this == i)return true;
        if (i == null || getClass() != i.getClass())return false;
        Slytherin slytherin = (Slytherin) i;
        return trick==slytherin.trick&& determination==slytherin.determination&& ambition == slytherin.ambition
                && resourcefulness == slytherin.resourcefulness&& lustPower == slytherin.lustPower;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(trick, determination, ambition, resourcefulness, lustPower);
    }
}
