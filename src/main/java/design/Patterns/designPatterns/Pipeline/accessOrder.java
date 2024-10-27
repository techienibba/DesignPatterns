package design.Patterns.designPatterns.Pipeline;
//Can be used for Advanced Data transformation and Data Processing
//can be used in cases where a single instance of Object has to undergo multiple steps in a single sequence
//Can be used for ETL,Video Streaming,Image Processing and Message Queueing Systems akin to kafka(Producer-Consumer Streams)
public class accessOrder {
	
	
	static Order order ;
	
	static OrderProcessingPipeline opp;
	
	public static void main(String[] args)
	{order= new Order();
		
		order.setId(1);
		opp = new OrderProcessingPipeline().addstages(new validationStage()).addstages(new ProcessingStage()).addstages(new PaymentStage()).addstages(new HotfixStage());
		opp.executeorder(order);
		
	}
	
	
	
	
	
	

}
