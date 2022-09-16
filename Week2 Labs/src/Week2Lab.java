
public class Week2Lab {

	public static void main(String[] args) {
		// License
		int age = 14;
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >= 16);
		
		boolean hasLicense = true;
		
		if (age >=16 && hasLicense) {
			System.out.println("You can drive");
		}
		else {
			System.out.println("You cannot drive");;
		}
		
		//Milk
		double costOfMilk = 3.50;
		int thirstLevel = 8;
		
		if (costOfMilk < 2.50 || thirstLevel > 6){
			System.out.println("Milk Please");
		}
		else {
			System.out.println("No Thanks");
		}
		
		//Children and Cookies
		int numberOfCookies = 9;
		int numberOfChildren = 10;
		
		int remainingCookies = numberOfCookies % numberOfChildren;
		if (remainingCookies == 0) {
			System.out.println("Sad Face");
		}
		else if (remainingCookies > 0 && remainingCookies < 2) {
			System.out.println("Yes!");
		}
		else if(remainingCookies >= 2 && remainingCookies < 5) {
			System.out.println("Whoohoooo!");
		}
		else {
			System.out.println("Jackpot");
		}
		
		//Loyalty Discount
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
		case "SILVER":
			loyaltyMemberDiscount = 0.10;
			break;
		case "GOLD":
			loyaltyMemberDiscount = 0.15;
			break;
		case "PLATINUM":
			loyaltyMemberDiscount = 0.25;
			break;
		}
		System.out.println(loyaltyMemberDiscount);
		
		double billTotal = 650;
		double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
		System.out.println(adjustedTotal);
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			}
			else {
				loyaltyMemberStatus = "PLATINUM";
			}
		}
		System.out.println(loyaltyMemberStatus);
		
		//Username and Password
		String username = "Tommy123";
		String password = "12345";
		
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("Login Successful!");
		}
		else {
			System.out.println("Access Denied!");
		}
		
		System.out.println("");
		// For loop: 0 to 9
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("");
		//For loop 10 to 0
		for (int i = 10; i >= 0; i--){
			System.out.println(i);
		}
		
		System.out.println("");
		//For loop every other number
		for (int i = 0; i <= 100; i += 2)
		{
			System.out.println(i);
		}
		
		System.out.println("");
		//For loop even or odd
		for (int i = 0; i <=100; i++) {
			if (i % 2 == 0) {
				System.out.println("EVEN");
			}
			else {
				System.out.println("ODD");
			}
		}
		
		System.out.println("");
		//While loop 100 to 0 + remainders when divided by 3
		int i = 100;
		while (i >= 0)
		{
			System.out.println(i + " " + i % 3);
			i--;
		}
	}

}
