public class MainProgram {

    public static void main(String[] args) {
        //you can test the program here

        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
        herd.move(5, 0);
        System.out.println(herd);
    }
}
