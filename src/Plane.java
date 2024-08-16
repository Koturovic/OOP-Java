import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

public class Plane {


        private List<Passenger> passengers= new ArrayList<>();
        private List<Pet> ljubimci = new ArrayList<>();
        private List<Suitcase> torbe = new ArrayList<>();
        public void addPutnik(Passenger passenger){
            passengers.add(passenger);
        }
        public void addPet(Pet pet){
            ljubimci.add(pet);
        }
        public void addKofere(Suitcase torba){
            torbe.add(torba);
        }
        // tezina aviona
        public double totalWeight(){
            double total = 0;
            for(Passenger p: passengers){
                total+=p.weight();
            }
            for(Pet pet : ljubimci){
                total+=pet.weight();
            }
            for(Suitcase torba: torbe){
                total+=torba.weight();
            }
            return total;
        }



}
