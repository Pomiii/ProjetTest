package Material;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaterialApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
        SpringApplication.run(MaterialApplication.class, args);
    }

	@Override
	public void run(String... arg) throws Exception {
	   // storageService.init();
	}

}
