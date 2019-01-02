package me.shijunjie.SimpleConfigServer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class BootStrap {
	public static void main(String[] args) {
		String profile = args[0];
		new SpringApplicationBuilder(BootStrap.class).profiles(profile).run(args);
	}
}
