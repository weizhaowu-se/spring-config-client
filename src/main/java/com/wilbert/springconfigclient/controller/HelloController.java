package com.wilbert.springconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuweizhao
 * @version 创建时间：2020/4/6 4:00 PM
 */
@RestController
public class HelloController {
	@Value("${env.password}")
	private String password;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testProfiles() {
		return password;
	}
}
