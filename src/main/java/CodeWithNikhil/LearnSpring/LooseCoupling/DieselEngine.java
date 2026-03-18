package CodeWithNikhil.LearnSpring.LooseCoupling;

public class DieselEngine implements IEngine {
    int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "horsePower=" + horsePower +
                '}';
    }

    @Override
    public void horsePower() {
        IEngine.super.horsePower();
    }
}
