package design;

public abstract class AbstractEmployee implements Employee {


    final String companyName = "SquareDeals";
    public void performance(){
        System.out.println("Performance will be measured and recorded.");
    }

    // Defining overriding method..........

//    public void performance (String rating){
//        System.out.println("The employee performance" +rating);
//    }

}
