package com.chirag.interface_program;

@FunctionalInterface
interface Printer
{
	public abstract void print();
}
 
class PrinterDemo
{
	public Printer getPrinter()
	{
		return new Printer() 
		{
		  @Override
		  public void print() 
		  {
			IO.println("Printer is working!!!!");
		   }
	    };
     }    
}


public class InterfaceImplementationByUsingAnonymous 
{

	public static void main(String[] args) 
	{
		PrinterDemo p = new PrinterDemo();
		p.getPrinter().print();
		
		// Second Method 
		//PrinterDemo printer = new PrinterDemo();
		//Printer printers = printer.getPrinter();
		//printers.print();[
		
	}

}
