package co.ke.telkom;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class TestMediator extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		// TODO Implement your mediation logic here 
		System.out.println("A log printed by Class Mediator " + context.getProperty("myTestProperty"));
		context.setProperty("myTestProperty2", "Bye Telkom");
		return true;
	}
}
