package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cars {
    String name;
    double bhp;
    int price;

    public Cars() {
    }

    public Cars(String name, double bhp, int price) {
        this.name = name;
        this.bhp = bhp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getBhp() {
        return bhp;
    }

    public int getPrice() {
        return price;
    }
}
class sortNames implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class sortBhp implements Comparator<Cars>{

    @Override
    public int compare(Cars o1, Cars o2) {
        if(o1.getBhp() == o2.getBhp()) {
            return 0;
        }
        else if(o1.getBhp() > o2.getBhp()) {
            return 1;
        }
        else{
            return -1;
        }
    }
}

class sortPrice implements Comparator<Cars>{

    @Override
    public int compare(Cars o1, Cars o2) {
        if(o1.getPrice() == o2.getPrice()){
            return 0;
        }
        else if(o1.getPrice() > o2.getPrice()) {
            return 1;
        }
        else{
            return -1;
        }
    }
}
class mainLogic{
    public static void main(String[] args) {
        ArrayList<Cars> list = new ArrayList<>();
        list.add(new Cars("BMW", 165.6, 72529));
        list.add(new Cars("VW",164.5,74385));
        list.add(new Cars("Audi",173.4,73850));
        list.add(new Cars("Kia", 160.4,76285));

        sortNames sNames = new sortNames();
        Collections.sort(list, sNames);
        System.out.println("sorted by names");
        for(Cars cars : list) {
            System.out.println(cars.getName() +" "+ cars.getBhp()+" "+cars.getPrice());
        }
        System.out.println("________________________________");
        System.out.println("sorted by bhp");
        sortBhp sBhp = new sortBhp();
        Collections.sort(list, sBhp);
        for(Cars cars: list){
            System.out.println(cars.getBhp()+" "+cars.getName()+" "+cars.getPrice());
        }
        System.out.println("________________________________");
        System.out.println("sorted by price");
        sortPrice sPrice = new sortPrice();
        Collections.sort(list, sPrice);
        for (Cars cars:list){
            System.out.println(cars.getPrice()+" "+ cars.getName()+" "+ cars.getBhp());
        }
    }
}