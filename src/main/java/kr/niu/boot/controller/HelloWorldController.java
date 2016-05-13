package kr.niu.boot.controller;

import kr.niu.boot.bo.Sample;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @filename HelloWorldController.java
 * @date 2016-05-13
 * @author Heesung Cho
 *
 */
@RestController
public class HelloWorldController {
	private static Random rand = new Random();

	@RequestMapping("/echo/{name}")
	public Sample echo(@PathVariable String name) {
		long id = rand.nextLong();
		return new Sample(id, name);
	}
}