package com.example.pattern.build.abstractFactory.example;
//The Abstract Factory,例子不是很好，工厂两个方法不是生产两个关联产品
/**
 * @author  Administrator
 */
interface ConnectionFactory {
  /**
 * @uml.property  name="localConnection"
 * @uml.associationEnd  
 */
Local getLocalConnection();
  /**
 * @uml.property  name="remoteConnection"
 * @uml.associationEnd  
 */
Remote getRemoteConnection();
}
