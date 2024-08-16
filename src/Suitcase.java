public class Suitcase implements Entity{
    private Passenger owner;
    private double weight;

    @Override
    public String description(){
        return "Kofer pripada: " + owner.description();
    }
    @Override
    public double weight(){
        return weight;
    }
    public Suitcase(Passenger owner, double weight){
        this.owner =owner;
        this.weight = weight;
    }
}
