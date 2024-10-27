package design.Patterns.designPatterns.Pipeline;

public class ProcessingStage implements OrderProcessingStage {

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		if(order.getStatus().equalsIgnoreCase("valid"))
		{
			order.setEnabled("Enabled");
			
			
		}
		
		else
		{
			order.setEnabled("Disabled");
			
		}
		
		return order;
	}

}
