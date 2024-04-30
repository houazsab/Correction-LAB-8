package MASTER.SI.SPRING.AP08;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Lazy
	@Autowired
    private JdbcTemplate jdbcTemplate; 
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM wilaya";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> row : rows) {
		    for (Map.Entry<String, Object> entry : row.entrySet()) {
		        String columnName = entry.getKey();
		        Object value = entry.getValue();
		        System.out.println(columnName + " : " + value);
		    }
		    System.out.println(); 
		}
	}

	@Bean
	 public JdbcTemplate jdbcTemplate() {
	    return new JdbcTemplate(dataSource());
	 }
	 @Bean
	  public DataSource dataSource() {
	  DriverManagerDataSource dataSource = new DriverManagerDataSource();
	  dataSource.setDriverClassName("org.postgresql.Driver");
	  dataSource.setUrl("jdbc:postgresql://localhost:5432/sb001");
	  dataSource.setUsername("postgres");
	  dataSource.setPassword("admin");
	   return dataSource;
	   }
}
