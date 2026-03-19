package CodeWithNikhil.LearnSpring.Component;

import CodeWithNikhil.LearnSpring.XmlBasedIoc.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieDAO {

    public void insertMovie(Movie movie){
        System.out.println("MovieDAO : Inserting Movie ");
    }
}
