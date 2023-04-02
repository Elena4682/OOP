public class Main {
    public static void main(String[] args) {
        Gryffindor student1 = new Gryffindor(" Гарри Поттер ", 45, 50, 55,
                40, 70);
        Gryffindor student2 = new Gryffindor(" Гермиона Грейнджер ", 35, 70,
                20, 80, 49);
        Gryffindor student3 = new Gryffindor(" Рон Уизли ", 55, 15,
                12, 60, 10);

        Slytherin student4 = new Slytherin(" Драко Малфой ", 66, 35,
                22, 41, 34, 42, 55);
        Slytherin student5 = new Slytherin(" Грэхэм Монтегю ", 19, 53,
                47, 14, 29, 74, 64);
        Slytherin student6 = new Slytherin(" Грегори Гойл ", 23, 64,
                12, 57, 28, 49, 35);

        Hufflepuff student7 = new Hufflepuff(" Захария Смит ", 56, 34,
                64, 22, 46);
        Hufflepuff student8 = new Hufflepuff(" Седрик Диггори ", 38, 17,
                68, 52, 71);
        Hufflepuff student9 = new Hufflepuff(" Джастин Финч-Флетчли ", 47, 26,
                27, 62, 10);

        Ravenclaw student10 = new Ravenclaw(" Чжоу Чанг ", 43, 61,
                29, 47, 34, 61);
        Ravenclaw student11 = new Ravenclaw(" Падма Патил ", 36, 11,
                64, 24, 67, 50);
        Ravenclaw student12 = new Ravenclaw(" Маркус Белби ", 47, 35,
                61, 52, 54, 38);

        System.out.println(student1);
        System.out.println(student4);
        System.out.println(student8);
        System.out.println(student10);
        System.out.println(" ***");
        comparisonStudentsGryffindor(student1,student2);
        comparisonStudentsHufflepuff(student8,student9);
        comparisonStudentsRavenclaw(student10,student11);
        comparisonStudentsSlytherin(student4,student5);
        System.out.println(" ***");
        comparisonStudentsНogwarts(student3,student8);
    }

    public static void comparisonStudentsGryffindor(Gryffindor student1, Gryffindor student2) {
        int totalScore1 = student1.properties();
        int totalScore2 = student2.properties();
        if (totalScore1 > totalScore2) {
            System.out.println(student1.getNameStudent() + " лучший Гриффиндорец, чем " + student2.getNameStudent());
        } else {
            System.out.println(student2.getNameStudent() + " лучший Гриффиндорец, чем " + student1.getNameStudent());
        }
    }
    public static void comparisonStudentsHufflepuff(Hufflepuff student8, Hufflepuff student9) {
        int totalScore1 = student8.properties();
        int totalScore2 = student9.properties();
        if (totalScore1 > totalScore2) {
            System.out.println(student8.getNameStudent() + " лучший Пуффендуец, чем " + student9.getNameStudent());
        } else {
            System.out.println(student9.getNameStudent() + " лучший Пуффендуец, чем " + student8.getNameStudent());
        }
    }
    public static void comparisonStudentsRavenclaw(Ravenclaw student10, Ravenclaw student11) {
        int totalScore1 = student10.properties();
        int totalScore2 = student11.properties();
        if (totalScore1 > totalScore2) {
            System.out.println(student10.getNameStudent() + " лучший Когтевранец, чем " + student11.getNameStudent());
        } else {
            System.out.println(student11.getNameStudent() + " лучший Когтевранец, чем " + student10.getNameStudent());
        }
    }
    public static void comparisonStudentsSlytherin(Slytherin student4, Slytherin student5) {
        int totalScore1 = student4.properties();
        int totalScore2 = student5.properties();
        if (totalScore1 > totalScore2) {
            System.out.println(student4.getNameStudent() + " лучший Слизеринец, чем " + student5.getNameStudent());
        } else {
            System.out.println(student5.getNameStudent() + " лучший Слизеринец, чем " + student4.getNameStudent());
        }
    }
    public static void comparisonStudentsНogwarts(Нogwarts student3, Нogwarts student8) {
        int totalScore1 = student3.properties1();
        int totalScore2 = student8.properties1();
        if (totalScore1 > totalScore2) {
            System.out.println(student3.getNameStudent() + " обладает большей силой магии и расстоянием трансгрессии, чем "
                    + student8.getNameStudent());
        } else {
            System.out.println(student8.getNameStudent() + " обладает большей силой магии и расстоянием трансгрессии, чем "
                    + student3.getNameStudent());
        }
    }
}






