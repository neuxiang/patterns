package com.example.pattern.build.abstractFactory.example;

class RemoteMode implements Remote {
	  public void connect2WWW(String url) {
	    System.out.println("Connect to a remote site ");
	  }
	  public DataInfo[] loadDB(String name) {
	     System.out.println("Load from a remote database ");
	     return null;
	  }
	}

