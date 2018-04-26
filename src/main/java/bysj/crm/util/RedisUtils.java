package bysj.crm.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtils {
    private static JedisPool pool;
    static {
        pool=new JedisPool("139.196.75.243",6379);

    }
    public static void set(String key,String value,int time){
        Jedis jedis=pool.getResource();
        /*jedis.auth("1714");*/  //redis设置的操作密码，正确时才能操作redis
        jedis.set(key,value);
        jedis.expire(key,time);
        jedis.close();
    }
    public  static void setTime(String key,int time){
        Jedis jedis=pool.getResource();
        /*jedis.auth("1714");*/
        jedis.expire(key,time);
        jedis.close();
    }
    public static String get(String key){
        Jedis jedis=pool.getResource();
        /*jedis.auth("1714");*/
        String r=jedis.get(key);
        jedis.close();
        return  r;
    }
}