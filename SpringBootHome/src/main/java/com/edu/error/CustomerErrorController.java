package com.edu.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomerErrorController implements ErrorController {

	private Logger logger = LoggerFactory.getLogger(CustomerErrorController.class);
	
	@RequestMapping("/error")
	public String handleError(HttpServletRequest req) throws Exception {
	
		Object status = req.getAttribute("jakarta.servlet.error.status_code");
		
		if(status != null) {
			Integer statusCode = Integer.valueOf(status.toString());
			logger.info("handleError statusCode: {}", statusCode);
			
			if(statusCode == HttpStatus.NOT_FOUND.value()) {
				return "error/404";
			}else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				return "error/500";
			}
		}
		
		return "error/Error";
	}
	
}
