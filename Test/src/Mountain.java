class Atom {
    Atom() {
        System.out.println("atom");
    }
}
class Rock extends Atom{
    public Rock(String type) {
        System.out.println(type);
    }
}
public class Mountain extends Rock{
    public Mountain() {
        super("Granite");
        new Rock("Granite");
    }
    public static void main(String[] args) {
        new Mountain();
    }
}
