//package shandong.zheng.fenbiao.config;
//
//import org.apache.coyote.http11.Http11NioProtocol;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.boot.web.server.WebServerFactoryCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author zhangzheng74@jd.com
// * @since 2025/3/8 14:14
// */
//@Configuration
//public class TomcatConfig {
//    @Bean
//    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> tomcatCustomizer() {
//        return factory -> factory.addConnectorCustomizers(connector -> {
//            Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
//
//            // 核心线程配置
//            protocol.setMaxThreads(10000);       // 最大工作线程数
//            protocol.setMinSpareThreads(1000);   // 最小空闲线程
//            protocol.setAcceptCount(10000);     // 等待队列长度
//
//            // 高级参数（按需调整）
//            protocol.setMaxConnections(8192);  // 最大连接数
//            protocol.setConnectionTimeout(30000); // 连接超时(ms)
//            protocol.setKeepAliveTimeout(60000);  // Keep-Alive超时
//        });
//    }
//}
