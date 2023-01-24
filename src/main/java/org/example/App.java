package org.example;

public class App {
  protected App() { }
  public static void main(String[] args) {
    Person person = new Person("Nick");
    person.setName("Duck");
    System.out.println("Hello World!");
    System.out.println(person.getName());
  }
}
