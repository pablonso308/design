package refactoring_guru.factory_method.example;

public abstract class Dialog {

    public void renderWindow() {
        button okButton = createButton();
        okButton.render();
    }

    public abstract button createButton();

}
