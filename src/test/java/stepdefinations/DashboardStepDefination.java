package stepdefinations;

import com.qa.factory.DriverFactory;
import com.qa.pages.UserHomePage;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DashboardStepDefination {

	UserHomePage objUserHomePage = new UserHomePage(DriverFactory.getDriver());

	@Then("Verify Wallet Balance value is {string}, Total Bookings {string} and Pending Invoices are {string}")
	public void verify_WalletBalance_TotalBookings_PendingInvoices(String walletBal, String totalBooking,
			String pendingInvoices) {

		Assert.assertEquals(walletBal, objUserHomePage.getWalletBalance());
		Assert.assertEquals(totalBooking, objUserHomePage.getTotalBookings());
		Assert.assertEquals(pendingInvoices, objUserHomePage.getPendingInvoices());
	}

}
