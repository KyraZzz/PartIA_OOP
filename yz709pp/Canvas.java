package yz709pp;

public interface Canvas extends GUIComponent{
    void draw();
}
class CanvasImpl implements Canvas{

    CanvasImpl(){
        GUI gui = returnGui();
    }

    @Override
    public void draw() {
        System.out.println("Canvas draw");
    }
}
