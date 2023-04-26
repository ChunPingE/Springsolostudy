package AOPstudy.aop.advice;

import java.lang.reflect.*;

import org.aopalliance.intercept.*;
import org.springframework.aop.*;

public class LogBeforeAdivce implements MethodBeforeAdvice{
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("앞에서 실행될 로직");
	}
}
