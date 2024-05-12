public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Yryskeldi","java","PeakSoft");
        programmer.learn();

        System.out.println(programmer);

        Dancer dancer = new Dancer("JObs","pop","Bts");
        dancer.walk();
        System.out.println(dancer);

        Singer singer = new Singer("Atai","robot","sts");
        singer.eat();
        System.out.println(singer);

    }
}