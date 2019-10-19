
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("springbootwei/com/dao")
@ComponentScan(basePackages = {"springbootwei.com.controller", "springbootwei.com.service", "springbootwei.com.serviceImpl", "springbootwei.com.pojo"})
@SpringBootApplication
public class SpringbootweiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootweiApplication.class, args);
        System.out.println("启动成功----------------------");

    }

}
