package design.Patterns.designPatterns.Pipeline;

public class HotfixStage implements OrderProcessingStage {

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		System.out.println("Order has been processed for Payment");
		return order;
	}
	
	
	
	
	

}
