package com.nomadicjazz.smart_inventory_trackerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SmartInventoryTrackerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartInventoryTrackerdemoApplication.class, args);
	}

}
