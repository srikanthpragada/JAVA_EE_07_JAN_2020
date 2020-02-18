package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// @Component
// @Aspect 
public class SecurityAspect {

	@Before(value = "execution (* aop.Order.*(..))")
	public void beforeAdviceMethod(JoinPoint jp) {
		System.out.println("Security Check  --> " + jp.getSignature());
	}
}
