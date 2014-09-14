/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.state
 * 
 * 文件名称 ConcreteStateB.java
 * 
 */
package com.niufish.pattern.state;

/**
 * 具体状态角色<br />
 * 此处为走得状态
 * <p>
 * <a href="ConcreteStateB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteStateB implements State {

    /**
     * @see com.niufish.pattern.state.State#Handle()
     */
    public void Handle() {
        System.out.println("气定神闲");
    }

}
