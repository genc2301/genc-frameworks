package com.cogni.genc.ChainingMethod;

public class Demo {

	  // A method with return type AnotherDemo
	  public AnotherDemo DemoMethod() {
	    System.out.println("DemoMethod");
	    return new AnotherDemo(); 
	  }

	  
	  public static void main(String[] args) {
	    // Creating an object of Demo class
	    Demo DemoObject = new Demo();
	    
	    // Calling DemoMethod() that returns a type of AnotherDemo and storing its return value 
//	    AnotherDemo AnotherDemoObject = new AnotherDemo();
	    AnotherDemo AnotherDemoObject = DemoObject.DemoMethod();
	    
//	    // Since we have a reference of AnotherDemo then we can call method of AnotherDemo
	    NewDemo NewDemoObject = AnotherDemoObject.AnotherDemoMethod();
	    NewDemoObject.NewDemoMethod();

//	    // method chaining
	    Demo DemoObject1 = new Demo();
//	    DemoObject1.DemoMethod().AnotherDemoMethod().NewDemoMethod(); // Method chaining

	    DemoObject.DemoMethod().AnotherDemoMethod().NewDemoMethod();

	  }
	}
	
