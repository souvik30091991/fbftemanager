package com.zuul.ZuulGatewayServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.ZuulGatewayServer.configuration.RibbonConfiguration;
import com.zuul.ZuulGatewayServer.filter.ErrorFilter;
import com.zuul.ZuulGatewayServer.filter.PostFilter;
import com.zuul.ZuulGatewayServer.filter.PreFilter;
import com.zuul.ZuulGatewayServer.filter.RouteFilter;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableEurekaClient
@EnableZuulProxy
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
/*@RibbonClients(defaultConfiguration = RibbonConfiguration.class)*/
public class ZuulGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayServerApplication.class, args);
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
