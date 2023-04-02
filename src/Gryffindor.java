public class Gryffindor extends Нogwarts{
    private final int nobility;
    private final int honor;
    private final int courage;
    public Gryffindor(String nameStudent, int powerMagic, int transgressionDistance, int nobility, int honor,
                      int courage) {
        super(nameStudent,powerMagic,transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
    public int getNobility(){
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getCourage(){
        return courage;
    }
    public int properties(){
        return nobility + honor + courage;
    }
    public String toString() {
        System.out.println(super.toString());
        return " факультет Гриффиндор, благородство " + nobility + ", честь " + honor + ", храбрость " + courage;
    }
    public boolean equals(Object i){
        if (this == i)return true;
        if (i == null || getClass() != i.getClass())return false;
        Gryffindor gryffindor = (Gryffindor) i;
        return nobility==gryffindor.nobility&& honor==gryffindor.honor&& courage == gryffindor.courage;
    }
    @Override
    public int hashCode(){

        return java.util.Objects.hash(nobility, honor, courage);
    }


}
