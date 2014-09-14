/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.state
 * 
 * 文件名称 ConcreteStateA.java
 * 
 */
package com.niufish.pattern.state;

/**
 * 具体状态角色<br />
 * 此处为跑得状态
 * <p>
 * <a href="ConcreteStateA.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteStateA implements State {

    /**
     * @see com.niufish.pattern.state.State#Handle()
     */
    public void Handle() {
        System.out.println("气喘吁吁");
    }

}
