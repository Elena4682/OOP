public class Hufflepuff extends Нogwarts{
    private final int industriousness;
    private final int loyalty;
    private final int honesty;
    public Hufflepuff(String nameStudent, int powerMagic, int transgressionDistance,int industriousness, int loyalty,
                      int honesty) {
        super(nameStudent,powerMagic,transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getIndustriousness(){
        return industriousness;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty(){
        return honesty;
    }
    public int properties() {
        return industriousness + loyalty + honesty;
    }
    public String toString() {
        System.out.println(super.toString());
        return " факультет Пуффендуй, трудолюбие " + industriousness + ", верность " + loyalty + ", честность " + honesty;
    }
    public boolean equals(Object i){
        if (this == i)return true;
        if (i == null || getClass() != i.getClass())return false;
        Hufflepuff hufflepuff = (Hufflepuff) i;
        return industriousness==hufflepuff.industriousness&& loyalty==hufflepuff.loyalty&& honesty
                == hufflepuff.honesty;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(industriousness, loyalty, honesty);
    }
}
