package CodeWithNikhil.LearnSpring.xmlBasedIoc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Movie {

    Integer id;
    String movieName;
    Integer releaseYear;
    String genre;
    List<String> cast;
    Map<String,Integer> castSalary;




}
