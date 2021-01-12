package yz709pp;

public class ButtonCanvas implements Button,Canvas{

    ButtonCanvas() {
        GUI gui = returnGui();
        ButtonImpl buttonImpl = new ButtonImpl();
        CanvasImpl canvasImpl = new CanvasImpl();
    }

    @Override
    public void click() {

    }

    @Override
    public void draw() {

    }

}
