package com.example.demo;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;


@Controller
public class ConsumerControllerClient {

	@Autowired
	private RemoteCallService loadBalancer;

	public void getEmployee() throws RestClientException, IOException {

		try {
			Employee emp = loadBalancer.getData();
			System.out.println(emp);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
