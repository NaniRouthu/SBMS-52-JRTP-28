package in.ashokit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/welcome")
	public String getWelcome() {
		
		Logger logger = LoggerFactory.getLogger(MsgRestController.class);
		logger.info("logger excution started");
		
		String msg = "Welcome to Ashok IT..!!";

		logger.info("****** welcome () - execution completed *******");

		return msg;

		
	}

}
