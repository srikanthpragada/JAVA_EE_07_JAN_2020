package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

// @Component
// @Aspect 
@Order(0)
public class SecurityAspect {

	@Before(value = "execution (* aop.Order.*(..))")
	public void beforeAdviceMethod(JoinPoint jp) {
		System.out.println("Security Check  --> " + jp.getSignature());
	}
}
