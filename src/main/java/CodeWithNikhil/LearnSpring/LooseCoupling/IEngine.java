package CodeWithNikhil.LearnSpring.LooseCoupling;

public interface IEngine {

    default void horsePower(){
        System.out.println(" interface method of horsePower  ");
    }


}
