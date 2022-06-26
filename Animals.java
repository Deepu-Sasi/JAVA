package myprogram;
class Animal {
int legs;
Animal(int legs) {
this.legs=legs;
}
 void walk() {
 System.out.print("\nThis animal walk on "+ legs + " legs.");
}
void eats() {
System.out.print("\\nThis animal eats ");
}
}
interface Pet {
String getName();
void setName(String name);
void play();
}
class Spider extends Animal {
 Spider(int legs) {
  super(legs);
 }
 void eat() {
  System.out.print("\nSpider eats insects.");
 }
}
class Cat extends Animal implements Pet {
String name;
 Cat(String name, int legs) {
  super(legs);
  this.name = name;
 }
public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public void play() {
  System.out.print("\nCat loves to play with ball");
 }
 public void eats() {
  System.out.print("\nCat eats fish");
 }
}
class Fish extends Animal implements Pet {
 String name;
 Fish(String name, int legs) {
  super(legs);
  this.name = name;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public void eats() {
  System.out.print("\nFish eats plants");
 }
 public void play() {
  System.out.print("\nFish likes to play with shells");
 }
 public void walk() {
  System.out.print("\nFish has no legs.");
 }
}
public class Animals {
public static void main(String[] args) {
  Animal a = new Animal(4);
  System.out.print("\n\nFISH");
  Fish f = new Fish("Mimi",0);
  System.out.print("\nThis fish's name is "+f.getName());
  f.eats();
  f.walk();
  System.out.print("\n\nCAT");
  Cat c = new Cat("Moose",4);
  System.out.print("\nThis cat's name is "+c.getName());
  c.eats();
  c.walk();
  c.setName("Moose");
  System.out.print("\nThis cat's name is "+c.getName());
  System.out.print("\n\nSPIDER");
  Spider s = new Spider(8);
  s.eat();
  s.walk();
  
 }

}