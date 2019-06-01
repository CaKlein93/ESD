package de.dpunkt.myaktion.monitor;

import java.text.NumberFormat;

import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import de.dpunkt.myaktion.model.Donation;

public class DonationEncoder implements Encoder.Text<Donation> {
	
	@Override
	public String encode(Donation donation) {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		String amount= format.format(donation.getAmount());
		Object args[] = {donation.getDonorName(), amount };
		return String.format("%s hat %s gespendet.", args);
	}
	
	@Override
	public void destroy() {
		
	}
	
	@Override
	public void init(EndpointConfig arg0) {
		
	}

}
