/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.command
 * 
 * �ļ����� Invoker.java
 * 
 */
package com.niufish.pattern.behavioral.command;

/**
 * �����ߣ���������������ִ������
 * <p>
 * <a href="Invoker.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Invoker {
    
    /**
	 * ���е��������
	 * @uml.property  name="_command"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private Command _command;
    
    /**
     * ��ʼ�����е��������
     * @param command �������
     */
    public Invoker(Command command){
        _command = command;
    }
    
    /**
     * �ж�����
     */
    public void action(){
        _command.execute();
    }

}
