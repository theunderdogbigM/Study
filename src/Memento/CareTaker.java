package Memento;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> savedTexts = new Stack<Memento>();

    public void SaveAndAddToStack(Memento memento){

        savedTexts.add(memento);
    }

    public Memento RestoreIfNeeded(){
        return savedTexts.pop();
    }
}
