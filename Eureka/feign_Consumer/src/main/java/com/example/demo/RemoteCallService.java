package com.example.demo;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name="employee-producer")
public interface RemoteCallService {
	@RequestMapping(method=RequestMethod.GET, value="/emp")
	public Employee getData();

}