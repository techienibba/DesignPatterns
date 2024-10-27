package design.Patterns.designPatterns.Pipeline;

public class PaymentStage implements OrderProcessingStage {

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		
		if(order.getEnabled().equalsIgnoreCase("enabled"))
		{
			
			System.out.println("Order can be processed for payment");
		}
		else
		{
			System.out.println("Order can not be processed for Payment");
		}
		
		return order;
	}

}
