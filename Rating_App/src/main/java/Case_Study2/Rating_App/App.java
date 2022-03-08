package Case_Study2.Rating_App;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beanConfig.xml"});
    	
    	User user = context.getBean("User",User.class);
    	System.out.println("User-Name       : " +user.getUsername());
    	System.out.println("Email Id        : "+user.getEmailid());
    	System.out.println("Password        : "+user.getPassword());
    	System.out.println("Mobile No	: "+user.getMobileno());
    	System.out.println("=================================================================================");
    	
    	Comment comment=context.getBean("comment",Comment.class);
    	System.out.println("Comment ID      : "+comment.getComment_id());
    	System.out.println("Comment Text    : "+comment.getComment_text());
    	System.out.println("Likes           : "+comment.getLikes());
    	System.out.println("Dislikes        : "+comment.getDislike());
    	System.out.println("=================================================================================");
    	
    	Review review=context.getBean("review",Review.class);
    	System.out.println(review.getReviewid());
    	System.out.println(review.getReview_text());
    	System.out.println(review.getFinancial_Product_reviewed());
    	
    	List<Comment> comments = review.getComments();
    	System.out.println("");
    	for(Comment c:comments) {
    		System.out.println("Comment Id  : "+c.getComment_id());
    		System.out.println("Comment Text: "+c.getComment_text());
    		System.out.println("Likes       : "+c.getLikes());
    		System.out.println("Dislikes    : "+c.getDislike());
    		System.out.println("Report      : "+c.isReport());
    		
    	System.out.println("=================================================================================");
    	
    	Financial_product f=context.getBean("fp",Financial_product.class);
    	System.out.println(f.getFinancial_product());
    	System.out.println(f.getFinancial_product_name());
    	System.out.println(f.getRating());
    	System.out.println(f.getReview().getReviewid());
    	System.out.println(f.getReview().getReview_text());
    	System.out.println(f.getReview().getFinancial_Product_reviewed());
    	System.out.println("=================================================================================");
	
    }
    }
}
