package CodeWithNikhil.LearnSpring.Component;

import CodeWithNikhil.LearnSpring.XmlBasedIoc.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class MovieBO {

    MovieDAO movieDAO;


    public void populateRatingAndInsertMovie(Movie movie){
        System.out.println(" calling imdb");
        movieDAO.insertMovie(movie);
        System.out.println(" inserting movie into database ");
    }
    public void deleteRatingAndInsertMovie(Movie movie){
        System.out.println(" calling imdb");
        System.out.println(" deleting movie from database ");
    }

}
