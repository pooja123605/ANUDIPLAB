package puja;
public class Dog
{
  String name;
  String color;
  Dog(String name,String color)
  {
	  this.name=name;
	  this.color=color;
  }
   void display()
  {
	  System.out.println("Dog color:"+color);
	  System.out.println("Dog name:"+name);
	  System.out.println("Dog says bow bow");
  }
	  public static void main(String[] args) {
		Dog d=new Dog("moti","white");
		Dog d1=new Dog("tomi","black");
		d.display();
		d1.display();
	}
	  
}

	
