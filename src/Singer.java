public class Singer extends Person{
    private String bandName;
    public Singer(){}
    public Singer(String name,String designation,String bandName){
        super(name,designation);
        this.bandName = bandName;
    }
    public String getBandName(){
        return bandName;
    }
    public void setBandName(String bandName){
        this.bandName =bandName;
    }
    public String singing(){
        return "Singing";
    }
    public void playGitar(){
        System.out.println("tring tring tring..");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                "} " + super.toString();
    }
}
