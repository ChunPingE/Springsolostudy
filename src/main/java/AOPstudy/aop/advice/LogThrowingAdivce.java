package AOPstudy.aop.advice;

import org.springframework.aop.*;

public class LogThrowingAdivce implements ThrowsAdvice {
	public void afterTrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("예외 발생!!!");
	}
}
