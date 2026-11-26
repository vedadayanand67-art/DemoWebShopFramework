package batchexecution;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups = "SmokeTest")

	public void LoginTest() {

		System.out.println("Executing Login Test");
		System.out.println("Executing Login Test success");

	}

	@Test(groups = "SmokeTest")

	public void RegisterTest() {

		System.out.println("Executing Register Test");

	}

	@Test

	public void SearchTest() {

		System.out.println("Executing Search Test");

	}
}
