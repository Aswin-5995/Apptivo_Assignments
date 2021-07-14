
//  single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class first{
	public void print_iron()
	{
		System.out.println("I Am");
	}
}

class second extends first{
	public void print_man() 
       { 
                 System.out.println("Iron Man");
        }
}

public class Single{
	public static void main(String[] args)
	{
		second s = new second();
		g.print_iron();
		g.print_man();
		
}
