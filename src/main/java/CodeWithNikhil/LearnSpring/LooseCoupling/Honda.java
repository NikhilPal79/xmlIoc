package CodeWithNikhil.LearnSpring.LooseCoupling;

public class Honda {

    IEngine engine;


    public Honda() {
        engine = new PetrolEngine(400);
    }

    @Override
    public String toString() {
        return "Honda{" +
                "engine=" + engine +
                '}';
    }
}
