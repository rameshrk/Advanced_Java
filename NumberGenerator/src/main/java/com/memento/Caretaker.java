package com.memento;
import java.util.ArrayList;
import java.util.List;
 
public class Caretaker {
  private List<Memento> statesList = new ArrayList<Memento>();
 
  public void addMemento(Memento m) {
	  System.out.println("*" +statesList);
    statesList.add(m);
  }
 
  public Memento getMemento(int index) {
	  System.out.println("*" +statesList);
    return statesList.get(index);
  }
}