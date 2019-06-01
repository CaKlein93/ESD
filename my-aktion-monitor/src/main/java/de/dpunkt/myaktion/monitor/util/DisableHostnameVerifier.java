package de.dpunkt.myaktion.monitor.util;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class DisableHostnameVerifier implements HostnameVerifier {

	@Override
	public boolean verify(String hostname, SSLSession sslSession) {
		// TODO Auto-generated method stub
		return true;
	}
	

}
