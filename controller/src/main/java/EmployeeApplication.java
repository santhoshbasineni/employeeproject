import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.java.*"})
@EntityScan(basePackages = {"com.java.*"})
@EnableJpaRepositories(basePackages = {"com.java.*"})
public class EmployeeApplication {
        public static void main(String[] args) {
            SpringApplication.run(EmployeeApplication.class, args);
    }
}
