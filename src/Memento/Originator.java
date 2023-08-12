package Memento;

public class Originator {
    private String textArea;

    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }

    public Memento saveToMemento(){
        return new Memento(textArea);
    }

    public void getStateFromMemento(Memento memento){
         textArea = memento.getTextArea();
    }
}
