package main.java.com.ahmedamrzezo.bookstore.util;

import java.util.Random;

public class IsbnNumber implements NumberGenerator {

	@Override
	public String generateNumber() {
		return "155-" + Math.abs(new Random().nextInt());
	}

}
