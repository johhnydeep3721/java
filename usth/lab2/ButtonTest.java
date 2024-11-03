public class ButtonTest {
    public static void main(String[] args){
        Button button = new Button("Submit", "red");
        button.setColor("blue");
        button.setLabel("cancel");
        button.dePress();
        button.dePress();
        button.undePress();
        button.undePress();
    }
}
