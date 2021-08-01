package x.y.impl;

import x.y.service.GreetingService;
import x.y.service.OutputService;

public class GreetingServiceImpl2 implements GreetingService {
	
	private OutputService outputter;
		public GreetingServiceImpl2(OutputService outputter) {
		this.outputter = outputter;
	}


	@Override
	public void setOutputter(OutputService outputter) {
		this.outputter = outputter;

	}

	@Override
	public void greetings() {
		// TODO Auto-generated method stub
		
	}

}
