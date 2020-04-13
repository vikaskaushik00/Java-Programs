package burger;

public class Main {

    public static void main(String[] args) {
        BasicHamburger basicHamburger = new BasicHamburger();
        FourAdditional fourAdditional = new FourAdditional();
        combo combo = new combo(basicHamburger,fourAdditional);
	Hamburger hamburger = new Hamburger("White","Chicken",basicHamburger,fourAdditional,combo);
    hamburger.chooseBurger();


    }
}
