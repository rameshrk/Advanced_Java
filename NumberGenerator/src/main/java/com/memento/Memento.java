package com.memento;
 
public class Memento {
  private String state;
   
  public Memento(String state){
    this.state = state;
  }
 
  public String getState() {
    return state;
  }

@Override
public String toString() {
	return "Memento [state=" + state + "]";
}
}