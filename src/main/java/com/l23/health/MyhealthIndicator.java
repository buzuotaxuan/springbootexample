package com.l23.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
//自定义健康检查
@Component
public class MyhealthIndicator implements HealthIndicator{

	@Override
	public Health health() {
		return Health.up().withDetail("error", "spring boot error").build();
	}

}
