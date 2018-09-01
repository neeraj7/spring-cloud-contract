package contracts;

import org.springframework.cloud.contract.spec.Contract

Contract.make { 
	description "Should return Hello!"
	request { 
		url "/generate"
		method GET()
	}
	response { 
		status 201
		body("Hello!")
	}
}