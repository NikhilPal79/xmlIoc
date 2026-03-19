package CodeWithNikhil.LearnSpring.Configuration;

import CodeWithNikhil.LearnSpring.Component.MovieBO;
import CodeWithNikhil.LearnSpring.XmlBasedIoc.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Configuration
/*@ComponentScan("CodeWithNikhil.LearnSpring")*/
public class AppConfig {

    /*<bean id="movie" class="CodeWithNikhil.LearnSpring.XmlBasedIoc.Movie" init-method="start" destroy-method="destroy">
        <constructor-arg name="id" value="1"></constructor-arg>
        <constructor-arg name="movieName" value="harry potter-1"></constructor-arg>
        <constructor-arg name="releaseYear" value="2001"></constructor-arg>
        <constructor-arg name="genre" value="fantasy"></constructor-arg>
        <constructor-arg name="cast">
            <list>
            <value>harry</value>
            <value>ron</value>
            <value>harm</value>

            </list>
            </constructor-arg>
            <constructor-arg name="castSalary">
            <map>
                <entry key="harry" value="70000"></entry>
                <entry key="ron" value="60000"></entry>
                <entry key="harm" value="50000"></entry>
            </map>
        </constructor-arg>
    </bean>*/

    @Bean(initMethod = "start", destroyMethod = "destroy")
    public Movie movie(){
        Movie movieb = new Movie(1, "goolmaal", 2004, "comedy", List.of("ajay", "kunal", "arshad"), Map.of("ajay", 5000, "kunal", 6000, "arshad", 8000));
        return movieb;
    }

    @Bean
    public MovieBO movieBO(){
        return new MovieBO();
    }


}
