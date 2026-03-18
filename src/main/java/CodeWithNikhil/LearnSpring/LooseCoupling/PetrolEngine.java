package CodeWithNikhil.LearnSpring.LooseCoupling;

public class PetrolEngine implements IEngine {

    Integer horsePower;

    public PetrolEngine(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "PetrolEngine{" +
                "horsePower=" + horsePower +
                '}';
    }

    @Override
    public void horsePower() {
        IEngine.super.horsePower();
    }
}
