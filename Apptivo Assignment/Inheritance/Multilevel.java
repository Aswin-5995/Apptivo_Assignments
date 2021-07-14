
// Multilevel inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class one {
	public void print_ja() {
		System.out.println("java");
	}
}

class two extends one {
	public void print_full() {
		System.out.println("full");
	}

}

class three extends two {
	public void print_stack() {
		System.out.println("stack");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		three g = new three();
		g.print_ja();
		g.print_full();
		g.print_stack();
	}
}
