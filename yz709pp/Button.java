package yz709pp;

public interface Button extends GUIComponent {
    void click();
}
class ButtonImpl implements Button{

    ButtonImpl(){
        GUI gui = returnGui();
    }

    @Override
    public void click() {
        System.out.println("Button click");
    }
}

