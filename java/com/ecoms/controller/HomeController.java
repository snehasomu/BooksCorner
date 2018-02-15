package com.ecoms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	@RequestMapping("/aboutus")
	public String getabout() {

		// do something before returning view name

		return "aboutus";
	}
	@RequestMapping("/payment")
	public String getpayment() {

		// do something before returning view name

		return "payment";
	}
	@RequestMapping("/receipt")
	public String getreceipt() {

		// do something before returning view name

		return "thankyou";
	}
	
	
		
	@RequestMapping("/header")
	public String getheader() {

		// do something before returning view name

		return "header";
	}
	@RequestMapping("/headeradmin")
	public String getheaderadmin() {

		// do something before returning view name

		return "headeradmin";
	}
		
			@RequestMapping("/contactus")
			public String getcontact() {

				// do something before returning view name

				return "contactus";
	}
			@RequestMapping("/adminhome")
			public String getadmin() {

				// do something before returning view name

				return "adminhome";
	}
					@RequestMapping("/userhome")
			public String getuser() {

				// do something before returning view name

				return "userhome";
	}
					@RequestMapping("/userhome2")
					public String getusers() {

						// do something before returning view name

						return "userhome2";
			}
					@RequestMapping("/loginf")
					public String getloginf() {

						// do something before returning view name

						return "loginf";
			}

}
