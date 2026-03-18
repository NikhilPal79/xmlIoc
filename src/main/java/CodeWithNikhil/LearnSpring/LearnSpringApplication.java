package CodeWithNikhil.LearnSpring;

import CodeWithNikhil.LearnSpring.LooseCoupling.Bmw;
import CodeWithNikhil.LearnSpring.LooseCoupling.DieselEngine;
import CodeWithNikhil.LearnSpring.LooseCoupling.Honda;
import CodeWithNikhil.LearnSpring.xmlBasedIoc.Movie;
import CodeWithNikhil.LearnSpring.xmlBasedIoc.cast;
import CodeWithNikhil.LearnSpring.xmlBasedIoc.salary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringApplication.class, args);


		/*Honda honda = new Honda();
		System.out.println("this is tightly coupled code bcz we mentioned hp in constructor of honda" + honda);

		Bmw bmw = new Bmw(new DieselEngine(450));
		System.out.println("this is loosely coupled code bcz hp value in main class[ still hardcoded ] " + bmw);*/


		/*Movie movie = new Movie(1, "harry potter-1", 2001,"friction",);*/


		///  get movie bean

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Movie movie = context.getBean("movie", Movie.class);
		System.out.println(movie);


		///  get cast bean
		cast c1 = context.getBean("cast1", cast.class);
		cast c2 = context.getBean("cast2", cast.class);
		cast c3 = context.getBean("cast3", cast.class);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		///  get salary bean

		salary salary1 = context.getBean("salary1", salary.class);
		salary salary2 = context.getBean("salary2", salary.class);
		salary salary3 = context.getBean("salary3", salary.class);
		System.out.println(salary1);
		System.out.println(salary2);
		System.out.println(salary3);

		((ClassPathXmlApplicationContext)context).close();


	}

}
