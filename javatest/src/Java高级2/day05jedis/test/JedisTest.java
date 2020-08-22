package Java高级2.day05jedis.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisTest {
    @Test
    public void test1() {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set("username", "zhangsan ");
        jedis.close();
    }

    @Test
    public void test2() {
        Jedis jedis = new Jedis();//连本机 可以空参
        jedis.set("username", "zhangsan");
        String username = jedis.get("username");
        System.out.println(username);
        jedis.setex("activeacode", 20, "heeh");
        jedis.close();
    }

    @Test
    public void test3() {
        Jedis jedis = new Jedis();
        jedis.hset("user", "name", "lisi");
        jedis.hset("user", "age", "23");
        jedis.hset("user", "gender", "male");

        String name = jedis.hget("user", "name");
        System.out.println(name);
        Map<String, String> user = jedis.hgetAll("user");
        System.out.println(user);
        for (String s : user.keySet()) {
            String value = user.get(s);
            System.out.println(s + "   " + value);
        }
        jedis.close();
    }

    @Test
    public void test4() {
        //
        Jedis jedis = new Jedis();
        jedis.lpush("mylist", "a", "b", "c");
        jedis.rpush("mylist", "a", "b", "c");
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);
        String pop1 = jedis.lpop("mylist");
        System.out.println(pop1);
        String pop2 = jedis.rpop("mylist");
        System.out.println(pop2);
        jedis.close();
    }

    @Test
    public void test5() {
        Jedis jedis = new Jedis();
        jedis.sadd("myset","java","c++","python");
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);
        jedis.close();
    }
    @Test
    public void test6()
    {
        Jedis jedis = new Jedis();
        jedis.zadd("mysortset",3,"何文");
        jedis.zadd("mysortset",100,"路淑妍");
        jedis.zadd("mysortset",2,"慕丽娜");
        Set<String> mysortset = jedis.zrange("mysortset", 0, -1);
        System.out.println(mysortset);

        jedis.close();
    }
    /**
     * jedis连接池的学习
     */
    @Test
    public void test7(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);
        JedisPool jedisPool = new JedisPool("localhost",6379);
        Jedis jedis = jedisPool.getResource();
        jedis.set("hah","hewen");

        jedis.close();
    }
}
