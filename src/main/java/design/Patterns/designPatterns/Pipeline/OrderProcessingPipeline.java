package design.Patterns.designPatterns.Pipeline;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessingPipeline {
	
	public List<OrderProcessingStage> stages = new ArrayList<>();
	
	
	
	public OrderProcessingPipeline addstages(OrderProcessingStage stage)
	{
		
		stages.add(stage);
		return this;
	}
	
	
	
	public Order executeorder(Order order)
	{
		
		for(OrderProcessingStage stage:stages)
		{
			order=stage.addOrder(order);
			
			
			 
		}
		return order;
	}
	
	
	

}
