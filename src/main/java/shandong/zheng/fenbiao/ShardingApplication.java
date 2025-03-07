package shandong.zheng.fenbiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangzheng74@jd.com
 * @since 2025/3/6 20:53
 */
@SpringBootApplication
@MapperScan("shandong.zheng.fenbiao.dao")
public class ShardingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingApplication.class, args);
    }
}
