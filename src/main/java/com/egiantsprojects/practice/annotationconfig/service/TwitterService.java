package com.egiantsprojects.practice.annotationconfig.service;

import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService{

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
