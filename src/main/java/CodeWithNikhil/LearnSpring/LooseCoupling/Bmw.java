package CodeWithNikhil.LearnSpring.LooseCoupling;

public class Bmw {

    IEngine engine;

    public Bmw(IEngine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "engine=" + engine +
                '}';
    }
}
