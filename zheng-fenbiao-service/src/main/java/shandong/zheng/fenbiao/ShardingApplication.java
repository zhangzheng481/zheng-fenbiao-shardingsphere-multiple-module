package shandong.zheng.fenbiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangzheng481@163.com
 * @since 2025/3/6 20:53
 */
@SpringBootApplication
@MapperScan("shandong.zheng.fenbiao.dao")
public class ShardingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingApplication.class, args);
    }
}
