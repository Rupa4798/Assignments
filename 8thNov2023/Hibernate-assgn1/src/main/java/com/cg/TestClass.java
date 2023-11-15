package com.cg;

import com.cg.util.CRUDOperations;

public class TestClass {

	public static void main(String[] args) {

		
		CRUDOperations c=new CRUDOperations();
		c.insertEntity();
		c.findEntity();
		c.updateEntity();
		c.removeEntity();
		
	}

}
