package com.example.pattern.build.abstractFactory.example;
class DataManager implements ConnectionFactory {
    /**
	 * @uml.property  name="local"
	 */
    boolean local = false;
    /**
	 * @uml.property  name="data"
	 * @uml.associationEnd  multiplicity="(0 -1)"
	 */
    DataInfo[] data;
    //...
    public Local getLocalConnection() {
        return new LocalMode();
    }
    public Remote getRemoteConnection() {
        return new RemoteMode();
    }
    public  void loadData() {
         if(local){
            Local conn = getLocalConnection();
            data = conn.loadDB("db.db");
         }else {
            Remote conn = getRemoteConnection();
            conn.connect2WWW("www.some.where.com");
            data = conn.loadDB("db.db");
         }
         
     }
	 // work on data 
   
    public void setConnection(boolean b) {
       local = b;
    }
}
