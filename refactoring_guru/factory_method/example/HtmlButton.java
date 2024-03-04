package refactoring_guru.factory_method.example;

public class HtmlButton implements button {
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
