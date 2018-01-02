package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;

@Service
public class MemcachedService {
private final static int exp=30*24*60*60;	
@Autowired
private MemcachedClient memcachedClient;

	public Object putParams(String key,Object val){
		Object obj = memcachedClient.set(key, exp, val);
		return obj;
	}
	
	public Object getParams(String key){
		return memcachedClient.get(key);
	}

}
