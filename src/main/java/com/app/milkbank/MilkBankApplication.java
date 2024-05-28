package com.app.milkbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

//@SpringBootApplication
//public class MilkBankApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(MilkBankApplication.class, args);
//	}
//
//}

@SpringBootApplication
@EntityScan(basePackageClasses = {
		MilkBankApplication.class,
		Jsr310JpaConverters.class
})
public class MilkBankApplication extends SpringBootServletInitializer
{
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
{
return application.sources(MilkBankApplication.class);
}
public static void main(String[] args) 
{
SpringApplication.run(MilkBankApplication.class, args);
}
}
