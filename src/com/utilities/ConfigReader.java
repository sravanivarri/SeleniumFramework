/**
 * 
 */
package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author prosenjit.majumder
 * 
 */
public class ConfigReader {

	Properties prop;

	public ConfigReader() {

		try {
			File src = new File("./Configurations/Config.property");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String chromegetDriverPath() {
		String path = prop.getProperty("chrome_driver_path");
		return path;

	}

	public String chromegetDrivervalue() {
		String path = prop.getProperty("chrome_driver_value");
		return path;

	}

	public String iegetDriverPath() {
		String path = prop.getProperty("ie_driver_path");
		return path;

	}

	public String iegetDrivervalue() {
		String path = prop.getProperty("ie_driver_value");
		return path;

	}

	public String getURL() {
		return prop.getProperty("url");
	}

	public String getLoginURL() {
		return prop.getProperty("login_url");
	}

	public String logout() {
		return prop.getProperty("logout_xpath");
	}

	public String usernameText() {
		return prop.getProperty("username");
	}

	public String passwordText() {
		return prop.getProperty("password");
	}

	public String username() {
		return prop.getProperty("username_xpath");
	}

	public String password() {
		return prop.getProperty("password_xpath");
	}

	public String login() {
		return prop.getProperty("login_xpath");
	}

	public String homePageTitle() {
		return prop.getProperty("homePageTitle");
	}

	public String mobileElement() {
		return prop.getProperty("mobile_element_xpath");
	}

	public String mobilePageTitle() {
		return prop.getProperty("mobile_page_title");
	}

	public String sortbyElement() {
		return prop.getProperty("sortby_element_xpath");
	}

	public String sortedVisibleElement() {
		return prop.getProperty("visible_element_on_sorting");
	}

	public String sonyXperiaPrice() {
		return prop.getProperty("sony_xperia_price_xpath");

	}

	public String sonyXperiaLink() {
		return prop.getProperty("sony_xperia_link_id");
	}

	public String xperiaPriceDetails() {
		return prop.getProperty("sony_xperia_price_detailsscreen_xpath");
	}

	public String xperiaAddToCart() {
		return prop.getProperty("xperia_addToCart_xpath");
	}

	public String qty() {
		return prop.getProperty("qty_xpath");
	}

	public String qtyAmnt() {
		return prop.getProperty("qty");
	}

	public String update() {
		return prop.getProperty("update_xpath");

	}

	public String actErrorMsg() {
		return prop.getProperty("errorMsg_xpath");
	}

	public String expctdErrorMsg() {
		return prop.getProperty("expctedErrorMsg");
	}

	public String emptyCartBtn() {
		return prop.getProperty("emptyCartBttn_id");
	}

	public String actEmptyCartMsg() {
		return prop.getProperty("emptyCartMsg");
	}

	public String expctdEmptyCartMsg() {
		return prop.getProperty("expctedemptyCartMsg");

	}

	public String iphoneAddToCompare() {
		return prop.getProperty("Iphone_AddToCompare_xpath");
	}

	public String xperiaAddToCompare() {
		return prop.getProperty("Xperia_AddToCompare_xpath");
	}

	public String iphoneTitle() {
		return prop.getProperty("Iphone_Title_xpath");
	}

	public String xperiaTitle() {
		return prop.getProperty("Xperia_Title_xpath");
	}

	public String compareBtn() {
		return prop.getProperty("Compare_xpath");
	}

	public String expctdPopupHeading() {
		return prop.getProperty("pop_up_xpected_heading");
	}

	public String actualPopupHeading() {
		return prop.getProperty("pop_up_actual_heading_xpath");
	}

	public String closeWindow() {
		return prop.getProperty("close_popup_window_xpath");
	}

	public String account() {
		return prop.getProperty("Account_xpath");
	}

	public String myAccount() {
		return prop.getProperty("Myaccount_Xpath");
	}

	public String Createaccount() {
		return prop.getProperty("Createaccount_xpath");
	}

	public String FirstName() {
		return prop.getProperty("FirstName_xpath");
	}

	public String Lastname() {
		return prop.getProperty("Lastname_xpath");
	}

	public String emailid() {
		return prop.getProperty("emailid_xpath");
	}

	public String passwordset() {
		return prop.getProperty("regpassword_xpath");
	}

	public String confirmpwd() {
		return prop.getProperty("confirmpwd_xpath");
	}

	public String register() {
		return prop.getProperty("register_xpath");
	}

	public String expected_register_success_msg() {
		return prop.getProperty("Registartion_successmsg");
	}

	public String actual_success_msg_xpath() {
		return prop.getProperty("Registartion_successmsg_xpath");
	}

	public String Tvclick() {
		return prop.getProperty("tv_xpath");
	}

	public String addtoWishlist() {
		return prop.getProperty("add_to_wishlist_item1");
	}

	public String shareWishlist() {
		return prop.getProperty("share_wishlist_xpath");
	}

	public String TVemailenter() {
		return prop.getProperty("email_xpath");
	}

	public String finalShare() {
		return prop.getProperty("FinalShare_xpath");
	}

	public String expectedTVSharedMsg() {
		return prop.getProperty("expected_shared_msg");
	}

	//estimate total
	public String mainemail() {
		return prop.getProperty("EmailAddress_xpath");
	}

	public String mainPassword() {
		return prop.getProperty("mainpassword_xpath");
	}

	public String mainlogin() {
		return prop.getProperty("mainlogin_xpath");
	}

	public String myWishlist() {
		return prop.getProperty("mywishlist_xpath");
	}

	public String addtoCart() {
		return prop.getProperty("addtocart_xpath");
	}

	public String countrySelect() {
		return prop.getProperty("country_select_element_xpath");
	}

	public String countryVisibleElement() {
		return prop.getProperty("country_visible_element");
	}

	public String StateSelect() {
		return prop.getProperty("state_select_element_xpath");
	}

	public String stateVisibleElement() {
		return prop.getProperty("state_visible_element");
	}

	public String pincode() {
		return prop.getProperty("pincode_xpath");
	}

	public String estimate() {
		return prop.getProperty("estimate_xpath");
	}

	public String flatratePrice() {
		return prop.getProperty("Flatrate_price_xpath");
	}

	public String flatrateRadiobutton() {
		return prop.getProperty("flatrate_radiobutton_xpath");
	}

	public String updateTotal() {
		return prop.getProperty("update_total_xpath");
	}

	public String subTotal() {
		return prop.getProperty("subtotal_xpath");
	}

	public String grandtotal() {
		return prop.getProperty("grandtotal_xpath");
	}

	public String checkout() {
		return prop.getProperty("checkout_xpath");
	}

	public String addressSelect() {
		return prop.getProperty("addressSelect_xpath");
	}

	public String addressVisibleElement() {
		return prop.getProperty("Address_visible_element");
	}
	
	public String address() {
		return prop.getProperty("address_xpath");
	}

	public String billingCity() {
		return prop.getProperty("city_xpath");
	}

	public String billingpostcode() {
		return prop.getProperty("billing_postcode_xpath");
	}

	public String telephone() {
		return prop.getProperty("telephone_xpath");
	}

	public String billingContinue() {
		return prop.getProperty("billing_continue_xpath");
	}

	public String shippingmethodContinue() {
		return prop.getProperty("shippingmethod_continue_xpath");
	}

	public String moneyorder() {
		return prop.getProperty("moneyorder_xpath");
	}

	public String paymentinfoContinue() {
		return prop.getProperty("paymentinfo_continue_xpath");
	}

	public String placeOrder() {
		return prop.getProperty("placeorder_xpath");
	}

	public String orderGenerated() {
		return prop.getProperty("ordergenerated_xpath");
	}

	public String orderno() {
		return prop.getProperty("orderno_xpath");
	}
//print order
	
	public String myorders() {
		return prop.getProperty("myorders_xpath");
	}

	public String recentorderno() {
		return prop.getProperty("recentorderno_path");
	}

	public String status() {
		return prop.getProperty("status_xpath");
	}

	public String viewOrder() {
		return prop.getProperty("vieworder_xpath");
	}

	public String descripOrderno() {
		return prop.getProperty("descriptionorderno_xpath");
	}

	public String printOrder() {
		return prop.getProperty("printorder_xpath");
	}
	
	public String reorder() {
		return prop.getProperty("reorder_xpath");
	}

	public String updateforreorder() {
		return prop.getProperty("update_reorder_xpath");
	}

	public String quantity() {
		return prop.getProperty("qty_xpath");
	}

	public String beforeaftergrnadtotal() {
		return prop.getProperty("before_grandtotal");
	}
	
	
	
	
	
	
	
	
	
}