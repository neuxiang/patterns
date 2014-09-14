/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.composite.transparence
 * 
 * �ļ����� Leaf.java
 * 
 */
package com.niufish.pattern.structure.composite.transparence;

/**
 * ��Ҷ���󣬴���û���¼����󣬶�����μ���ϵ�������ĳ�ֲ�����
 * <p>
 * <a href="Leaf.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Leaf implements Component {

    /**
     * @see com.niufish.pattern.structure.composite.transparence.Component#operation()
     */
    public void operation() {
        System.out.println("͸����Ҷ����:operation");
    }

    /**
     * @see com.niufish.pattern.structure.composite.transparence.Component#add(com.niufish.pattern.structure.composite.transparence.Component)
     */
    public void add(Component component) {
    }

    /**
     * @see com.niufish.pattern.structure.composite.transparence.Component#remove(com.niufish.pattern.structure.composite.transparence.Component)
     */
    public void remove(Component component) {
    }

}
