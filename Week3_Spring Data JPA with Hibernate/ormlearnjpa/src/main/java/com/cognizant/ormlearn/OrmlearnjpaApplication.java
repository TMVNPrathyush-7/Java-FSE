package com.cognizant.ormlearn;
import com.cognizant.ormlearn.service.CountryService;
import java.util.List;
import com.cognizant.ormlearn.entity.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmlearnjpaApplication implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(OrmlearnjpaApplication.class, args);
	}

	@Override
	public void run(String... args) {

		List<Country> countries = countryService.getAllCountries();

		System.out.println(countries);
	}
}