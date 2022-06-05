package net.yanfan;

import org.mybatis.spring.nativex.MyBatisResourcesScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MyBatisResourcesScan(mapperLocationPatterns = "classpath*:**/mapper/*Mapper.xml")
@SpringBootApplication
public class MybatisSpringnativeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringnativeDemoApplication.class, args);
	}

}
