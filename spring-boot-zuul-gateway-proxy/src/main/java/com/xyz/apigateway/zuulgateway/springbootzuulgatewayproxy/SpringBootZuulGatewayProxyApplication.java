package com.xyz.apigateway.zuulgateway.springbootzuulgatewayproxy;

import com.xyz.apigateway.zuulgateway.springbootzuulgatewayproxy.filters.ErrorFilter;
import com.xyz.apigateway.zuulgateway.springbootzuulgatewayproxy.filters.PostFilter;
import com.xyz.apigateway.zuulgateway.springbootzuulgatewayproxy.filters.PreFilter;
import com.xyz.apigateway.zuulgateway.springbootzuulgatewayproxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulGatewayProxyApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulGatewayProxyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
