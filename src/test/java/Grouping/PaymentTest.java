package Grouping;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test(priority = 1,
			groups = {"regression","sanity"})
	void paymentbyCreditCard() {
		System.out.println("Payment Credit Card Test");
	}
  
	@Test(priority = 2,
			groups = {"regression","sanity"})
	void paymentbyDebitCard() {
		System.out.println("Payment Debit Card Test");
	}
	
	@Test(priority = 3,
			groups = {"regression","sanity"})
	void paymentbyPayPal() {
		System.out.println("Payment PayPal Test");
	}

}
