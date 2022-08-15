package in.ashokit;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;



import reactor.core.publisher.Mono;

/**
 * 
 * @author Bhubaneswar Behera @date 15-Aug-2022
 *
 */
@Component
public class MyPreFilter implements GlobalFilter {
	
	Logger logger = LoggerFactory.getLogger(MyPreFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("filter() method executed ...");
		
		//Access request information
		ServerHttpRequest httpRequest = exchange.getRequest();
		HttpHeaders headers = httpRequest.getHeaders();
		Set<String> keySet = headers.keySet();
		
		keySet.forEach(key -> {
			List<String> values= headers.get(key);
			System.out.println(key + ": :" + values);
		});
		return chain.filter(exchange);
	}

	
}
