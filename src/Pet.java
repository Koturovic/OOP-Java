public class Pet implements Entity{

    private String name;
    private double weight;
    private Passenger owner;
    private Suitcase petlugage;

    public Pet(String name, double weight, Passenger owner, Suitcase petlugage) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.petlugage = petlugage;
    }

    @Override
    public double weight(){
        return weight  + petlugage.weight();
    }
    @Override
    public String description(){
        return "Pet: " + name + ", " + "Owner: " + owner.description();
    }
    public Passenger getOwner(){
        return owner;
    }
    public Suitcase getPetlugage(){
        return petlugage;
    }
}
