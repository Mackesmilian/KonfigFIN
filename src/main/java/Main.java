import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

    } /*ArrayList<Beer> beers = beers();
        for(Beer i : beers){
            System.out.println(i.getName());
        }*/

    public static ArrayList<Beer> beers(){
        Beer goesser = new Beer(new Liquid("lager", 0.5, 6),
                "goesser", false, 12);
        Beer corona = new Beer(new Liquid("lager", 0.5, 4),
                "corona", false, 9);
        Beer guiness = new Beer(new Liquid("draught", 0.5, 7),
                "guiness", true, 16);
        Beer sierraNevada = new Beer(new Liquid("IPA", 0.3, 7),
                "sierra nevada", false, 14);
        ArrayList<Beer> beers = new ArrayList<Beer>();
        beers.add(goesser);
        beers.add(corona);
        beers.add(guiness);
        beers.add(sierraNevada);
        return beers;
    }
}
