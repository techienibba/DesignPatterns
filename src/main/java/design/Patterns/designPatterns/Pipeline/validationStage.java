package design.Patterns.designPatterns.Pipeline;

public class validationStage implements OrderProcessingStage {

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
	if(order.getId()!=0)
	{
		order.setStatus("Valid");

		
	}
	else
	{
		order.setStatus("Invalid");
	}
		return order;
	}

}
