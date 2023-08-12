package Memento;




public class TextEditor {



    public static void main(String[] args) {
        Originator originator = new Originator();

        CareTaker careTaker = new CareTaker();

        originator.setTextArea("State #1");
        careTaker.SaveAndAddToStack(originator.saveToMemento());
        originator.setTextArea("State #2");
        careTaker.SaveAndAddToStack(originator.saveToMemento());
        originator.setTextArea("State #3");
        careTaker.SaveAndAddToStack(originator.saveToMemento());
        originator.setTextArea("State #4");

        System.out.println("Current State: " + originator.getTextArea());
        originator.getStateFromMemento(careTaker.RestoreIfNeeded());
        System.out.println("First saved State: " + originator.getTextArea());
        originator.getStateFromMemento(careTaker.RestoreIfNeeded());
        System.out.println("Second saved State: " + originator.getTextArea());
        originator.getStateFromMemento(careTaker.RestoreIfNeeded());
        System.out.println("Third saved State: " + originator.getTextArea());
    }

}


