package CodeWithNikhil.LearnSpring.XmlBasedIoc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Movie {

    private Integer id;
    private String movieName;
    private Integer releaseYear;
    private String genre;
    private List<String> cast;
    private Map<String,Integer> castSalary;

    private final void start(){
        System.out.println(" start method initialize when context.bean get initialize ");
    }

    private final void destroy(){
        System.out.println(" destroy method ");
    }




}
