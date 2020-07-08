package javaIsFun;

public class VariableConcept {
public static void main(String[] args) {
	int x=10;
	VariableConcept obj=new VariableConcept();
	obj.fun(x);
	System.out.println(x);                                                      //No change in the value of x
	x=obj.fun(x);                                                               
	System.out.println(x);                                                      //Now value gets updated  
	x=obj.fun(x);                                                       
	System.out.println(x);
}
int fun(int x) {
	x=x+10;
	System.out.println(x);                                                      //Updates the value of its local x variable
	return x;
}
}
