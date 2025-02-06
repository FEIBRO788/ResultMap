package cn.tedu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.tedu.mapper")
public class MyBatisConfig {
    static {
        System.out.println("配置类加载了");
    }
}
