public class Race{
    //data
    private int length; //50, 100, 200, 400, 800, 1500
    private String stroke; //fly, back, breast, free
    private int eventNumber;

    //methods

    public int getLength(){
        return this.length;
    }

    public void setLength(int inLength){
        this.length = inLength;
    }

    public String getStroke(){
        return this.stroke;
    }

    public void setStroke(String inStroke){
        this.stroke = inStroke;
    }

    public int getEvent(){
        return this.eventNumber;
    }

    public void setEvent(int inEvent){
        this.eventNumber = inEvent;
    }
}