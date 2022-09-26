public class Lamp {
    private String name;
    private boolean tændt;

    //lave metoden det skal lave elementer
    public Lamp(String name, boolean tændt){
        this.name = name;
        this.tændt = tændt;
    }

    //laver Lamp som element
    public Lamp(String name){
        this.tændt = false;
        this.name = name;
    }
    //laver turn on
    public void turnOn(){
        tændt =true;
    }
    //laver turn off
    public void turnOff(){
        tændt =false;
    }
    //setter bolian værdig
    public void setTaendt(boolean tilstand) {
        tændt = tilstand;
    }
    // ændre Lamp bolean til det modsatte
    public void toggle(){
        if (!tændt)
            tændt=true;
        else
            tændt=false;
    }
    //returner vis
    public boolean isOn(){
        return tændt;
    }
    // laver bolean værdig til string
    public String toString(){
        String text;
        if (tændt == true)
            text = "tændt";
        else
            text = "slukket";
        return name + " er " + text;
    }
}
