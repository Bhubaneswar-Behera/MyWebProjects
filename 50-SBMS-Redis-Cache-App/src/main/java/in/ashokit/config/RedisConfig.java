package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 
 * @author Bhubaneswar Behera @date 19-Aug-2022
 *
 */
@Configuration
public class RedisConfig {

		@Bean
		public JedisConnectionFactory getJedisConnection() {
			JedisConnectionFactory factory = new JedisConnectionFactory();
			//factory.setHostName(hostName);
			//factory.setPassword(password);
			//factory.setPort(port);
			return factory;
		}
		
		public RedisTemplate<String, String> getRedisTemplate(JedisConnectionFactory factory){
			RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
			redisTemplate.setConnectionFactory(factory);
			return redisTemplate;
		}
}
