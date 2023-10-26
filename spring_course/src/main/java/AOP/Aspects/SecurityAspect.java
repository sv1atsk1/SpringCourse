package AOP.Aspects;

import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("AOP.Aspects.MyPointCuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice проверка прав на получение книги / журнала");
        System.out.println("---------------------------------------------");
    }
}
