public class Lamp {
    private String name;
    private boolean tændt;

    public Lamp(String name, boolean tændt){
        this.name = name;
        this.tændt = tændt;
    }
    public Lamp(String name){
        this.tændt = false;
        this.name = name;
    }

    public void turnOn(){
        tændt =true;
    }
    public void turnOff(){
        tændt =false;
    }


    public void setTaendt(boolean tilstand) {
        tændt = tilstand;
    }

    public void toggle(){
        if (!tændt)
            tændt=true;
        else
            tændt=false;
    }
    public boolean isOn(){
        return tændt;
    }

    public String toString(){
        String text;
        if (tændt == true)
            text = "tændt";
        else
            text = "slukket";
        return name + " er " + text;
    }
}
