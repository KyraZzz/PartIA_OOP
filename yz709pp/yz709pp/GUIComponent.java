package yz709pp;

public interface GUIComponent {
    default GUI returnGui(){
        GUI gui = GUI.createGUI();
        return gui;
    }
}

class GUI{
    private double width = 100;
    private double length = 200;
    public void reSize(double ratio){
        width *= ratio;
        length *= ratio;
    }
    private GUI(){
    }

    static GUI createGUI(){
        GUI gui = new GUI();
        return gui;
    }
}

