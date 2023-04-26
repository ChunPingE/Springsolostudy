package AOPstudy.aop.advice;

import java.lang.reflect.*;

import org.springframework.aop.*;

public class LogAfterReturningAdivce implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("returnValue: " + returnValue + ", method: " + method.getName());
	}
}
