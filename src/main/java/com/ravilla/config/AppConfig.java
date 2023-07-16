package com.ravilla.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@Component("appConfig")
@NoArgsConstructor
@ConfigurationProperties(prefix = "cloud.config.client")
@RefreshScope
public class AppConfig {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
