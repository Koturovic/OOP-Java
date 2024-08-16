public class Passenger implements Entity{

    private String name;
    private String surname;
    private double weight;
    private Suitcase handlugage;
    public Suitcase getHandlugage(){
        return handlugage;
    }
    public void setHandlugage(Suitcase handlugage){
        this.handlugage = handlugage;
    }
    public Passenger(String name,String surname, double weight, Suitcase handlugage){
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.handlugage = handlugage;
    }
    @Override
    public String description(){
        return " Passanger: "  + name + " " + surname;
    }
    @Override
    public double weight(){
        return weight + handlugage.weight();
    }


}
