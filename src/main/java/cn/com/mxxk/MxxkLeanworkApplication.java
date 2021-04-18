package cn.com.mxxk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan("cn.com.mxxk.mapper")
public class MxxkLeanworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MxxkLeanworkApplication.class, args);
	}

}
