/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.memento
 * 
 * 文件名称 Caretaker.java
 * 
 */
package com.niufish.pattern.memento;

/**
 * 负责人角色，负责保存备忘录对象，不检查备忘录对象内容
 * <p>
 * <a href="Caretaker.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Caretaker {
    
    /**
	 * 持有的备忘录对象
	 */
    private MementoIF _memento;
    
    /**
     * @return 相关的备忘录
     */
    public MementoIF retrieveMemento(){
        return _memento;
    }
    
    /**
     * 保存备忘录对象
     * @param memento 备忘录对象
     */
    public void saveMemento(MementoIF memento){
        _memento = memento;
    }
}
