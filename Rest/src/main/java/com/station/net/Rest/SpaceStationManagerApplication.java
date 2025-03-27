package com.station.net.Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.station.net.Rest")
public class SpaceStationManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaceStationManagerApplication.class, args);
	}

}
