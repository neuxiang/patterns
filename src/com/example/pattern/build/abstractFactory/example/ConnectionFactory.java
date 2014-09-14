package com.example.pattern.build.abstractFactory.example;
//The Abstract Factory,���Ӳ��Ǻܺã�������������������������������Ʒ
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
