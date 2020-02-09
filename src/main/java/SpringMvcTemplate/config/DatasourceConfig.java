package SpringMvcTemplate.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;

@Configuration
public class DatasourceConfig {
	
	@Bean
	public DataSource createDataSourceBean() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create()
				.url("jdbc:mysql://us-cdbr-iron-east-05.cleardb.net/ad_e3c0e8786818f57?user=b1ed2f278da28f\u0026password=cf0cf839")
				.username("b1ed2f278da28f")
				.password("cf0cf839");
		return dataSourceBuilder.build();
	}
	
}