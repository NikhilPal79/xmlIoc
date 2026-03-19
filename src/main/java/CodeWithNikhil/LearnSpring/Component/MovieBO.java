package CodeWithNikhil.LearnSpring.Component;

import CodeWithNikhil.LearnSpring.XmlBasedIoc.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieBO {

    public void populateRatingAndInsertMovie(Movie movie){
        System.out.println(" calling imdb");
        System.out.println(" inserting movie into database ");
    }
    public void deleteRatingAndInsertMovie(Movie movie){
        System.out.println(" calling imdb");
        System.out.println(" deleting movie from database ");
    }

}
