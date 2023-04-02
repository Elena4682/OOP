import java.util.Objects;

public class Нogwarts {
    private String nameStudent;
    private int powerMagic;
    private int transgressionDistance;
    public Нogwarts(String nameStudent, int powerMagic, int transgressionDistance) {
        this.nameStudent = nameStudent;
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
    }
    public String getNameStudent(){
        return nameStudent;
    }
    public int getPowerMagic(){

        return powerMagic;
    }
    public int getTransgressionDistance(){

        return transgressionDistance;
    }
    public int properties1(){
        return powerMagic + transgressionDistance;
    }
    public String toString() {
        return " Ученик школы Хогвартс: " + nameStudent + ", сила магии " + powerMagic + ", расстояние трансгресии "
                + transgressionDistance;
    }
    public boolean equals(Object i){
        if (this == i)return true;
        if (i == null || getClass() != i.getClass())return false;
        Нogwarts hogwarts = (Нogwarts) i;
        return nameStudent.equals(hogwarts.nameStudent)&& powerMagic==hogwarts.powerMagic&& transgressionDistance
                == hogwarts.transgressionDistance;
    }
    @Override
    public int hashCode(){

        return java.util.Objects.hash(nameStudent, powerMagic, transgressionDistance);
    }
}


