public class Ravenclaw extends Нogwarts{
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;
    public Ravenclaw(String nameStudent, int powerMagic, int transgressionDistance,int intelligence, int wisdom,
                     int wit, int creativity) {
        super(nameStudent,powerMagic,transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getWit() {
        return wit;
    }
    public int getCreativity(){
        return creativity;
    }
    public int properties() {
        return intelligence + wisdom + wit + creativity;
    }
    public String toString() {
        System.out.println(super.toString());
        return " факультет Когтевран, ум " + intelligence + ", мудрость " + wisdom + ", остроумие " + wit
                + ", творчество " + creativity;
    }
    public boolean equals(Object i){
        if (this == i)return true;
        if (i == null || getClass() != i.getClass())return false;
        Ravenclaw ravenclaw = (Ravenclaw) i;
        return intelligence==ravenclaw.intelligence&& wisdom==ravenclaw.wisdom&& wit == ravenclaw.wit
                && creativity == ravenclaw.creativity;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(intelligence, wisdom, wit,creativity);
    }
}
