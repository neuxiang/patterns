/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.state
 * 
 * 文件名称 State.java
 * 
 */
package com.niufish.pattern.state;

/**
 * 抽象状态角色
 * <p>
 * <a href="State.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface State {
    
    /**
     * 不同状态的相应接口<br />
     * 此处为呼吸的情况
     */
    void Handle();

}
