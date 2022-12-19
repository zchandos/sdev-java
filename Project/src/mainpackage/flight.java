package mainpackage;


public class flight {
    
    private String datesFrom;
    private String datesTill;
    private String destination;
    
    //setters and getters
    String getDatesFrom(){
        return datesFrom;
    }
    void setDatesFrom(String newDatesFrom){
        datesFrom = newDatesFrom;
    }
    
    String getDatesTill(){
        return datesTill;
    }
    void setDatesTill(String newDatesTill){
        datesTill = newDatesTill;
    }
    
    String getDestination(){
        return destination;
    }
    void setdestination(String newDestination){
        destination = newDestination;
    }
}
