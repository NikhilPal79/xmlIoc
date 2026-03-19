package CodeWithNikhil.LearnSpring;

import CodeWithNikhil.LearnSpring.Component.MovieDAO;
import org.springframework.stereotype.Component;

@Component
public class MovieService {

    MovieDAO movieDAO = new MovieDAO();


}
