/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.memento
 * 
 * 文件名称 Originator.java
 * 
 */
package com.niufish.pattern.memento;

/**
 * 发起人角色，创建一个含有当前的内部状态的备忘录对象，使用备忘录对象存储其内部状态。
 * <p>
 * <a href="Originator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Originator {
    
    /**
	 * 状态
	 */
    private String _state;
    
    /**
     * 工厂方法，返回一个新的备忘录对象
     * @return 新的备忘录对象
     */
    public Memento createMemento(){
        return new Memento(_state);
    }
    
    /**
     * 恢复到备忘录对象所记载的状态
     * @param memento 记载状态的备忘录对象
     */
    public void restoreMemento(MementoIF memento){
        _state = ((Memento)memento).getState();
    }

    public String getState() {
        return _state;
    }
    
    public void setState(String _state) {
        this._state = _state;
        System.out.println("current state:"+_state);
    }
    
    protected class Memento implements MementoIF{
        
        /**
         * 保存的状态
         */
        private String _savedState;
        
        /**
         * 保存发起人的状态
         * @param someState 发起人的状态
         */
        private Memento(String someState){
            _savedState = someState;
        }
        
        /**
         * 状态取值
         */
        public String getState() {
            return _savedState;
        }
        
        /**
         * 状态赋值 
         * @param _state 状态
         */
        public void setState(String _state) {
            this._savedState = _state;
        }
    }
}
