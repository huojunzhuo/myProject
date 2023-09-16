package com.itheima.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: JedisProperties
 * Package: com.itheima.config
 * Description:
 *
 * @Author huojz
 * @Create 2023/9/13 21:22
 * @Version 1.0
 */
@Component
@ConfigurationProperties(prefix = "jedis.pool")
@Getter
@Setter
public class JedisProperties {

    private int  maxTotall;
    private int  maxIdle;
    private int  minIdle;
    private int  maxWaitMillis;
    private boolean  testOnBorrow;
    private boolean  testOnReturn;
    private int  timeBetweenEvictionRunsMillis;
    private boolean  testWhileIdle;
    private int  numTestsPerEvictionRun;

    private String host;
    private String password;
    private int port;
    private int timeout;

}
