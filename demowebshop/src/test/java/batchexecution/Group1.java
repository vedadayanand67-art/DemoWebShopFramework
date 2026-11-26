package batchexecution;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = "SmokeTest")

	public void AddToKart() {

		System.out.println("Executing AddToKart Test");

	}

	@Test(groups = "SmokeTest")

	public void SubscribeTest() {

		System.out.println("Executing Subscribe Test");

	}

	@Test

	public void SearchTest() {

		System.out.println("Executing Search Test");

	}

}

