package com.itheima;

import com.itheima.config.JedisConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private JedisPool jedisPool;

    @Test
    public void testJedis() {
        System.out.println(jedisPool);
        Jedis jedis = jedisPool.getResource();
        jedis.set("jedis","jedis");
        String jedis1 = jedis.get("jedis");
        System.out.println(jedis1);
    }

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    public void testLetture(){
//        redisTemplate.opsForValue().set("name1","name1");
//        Object name1 = redisTemplate.opsForValue().get("name1");
//        System.out.println(name1.toString());
        Object value = redisTemplate.opsForValue().get("name");
        System.out.println(value);
    }
    @Test
    public void testStringRedisTemplate(){
        String value = stringRedisTemplate.opsForValue().get("name");
        System.out.println(value);
    }

}
