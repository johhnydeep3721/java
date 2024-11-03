public class Button {
    private String label;
    private String color;
    private Boolean isPressed;
    public Button(String NewLabel, String Newcolor){
        this.label = NewLabel;
        this.color = Newcolor;
        this.isPressed =false;
    }

    public String getLabel(){
        return label; 
    }
    public String getColor(){
        return color;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void dePress(){
        if(isPressed == true){
            System.out.println("Button " + label + " is pressed.");
        }
        else{
            System.out.println("Button " + label + "is already pressed");
        }
    }
    public void undePress(){
        if(isPressed == false){
            System.out.println("Button " + label + " is unpressed.");
        }
        else{
            System.out.println("Button "+ label+ "is already unpressed.");
        }
    }


}
