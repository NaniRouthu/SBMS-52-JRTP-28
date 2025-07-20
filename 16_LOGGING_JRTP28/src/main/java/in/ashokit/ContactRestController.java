package in.ashokit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactRestController {
	
	@GetMapping("/contact")
	public String getContactInfo() {
		
		Logger logger = LoggerFactory.getLogger(ContactRestController.class);
		
		logger.info("logger exceution started");
		String response = "Contact Us : + 91 - 9985396677";
		
		logger.info("logger exceution ended");
		
		return response;
	}

}
