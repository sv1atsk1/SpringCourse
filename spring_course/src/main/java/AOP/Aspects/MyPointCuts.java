package AOP.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {}
}
