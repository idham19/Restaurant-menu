package restaurant;
public class MenuItem {
    private double prices ;
   private String description;
   private String category ;
   boolean isNew;

    MenuItem(double prices, String description,String category){
        this.prices=prices ;
        this.description=description;
        this.category=category;
//        System.out.println("the price is "+this.prices+ " $ and it's "+ this.description +" "+ this.category);
    }

    public double getPrices(){
        return prices;
    }
    public  String getDescription(){
        return description;
    }
    public  String getCategory(){
        return category;
    }
    public  void setPrices(int aprices){
        prices=aprices;
    }
    public void setDescription(String adescription){
        description=adescription;
    }

    public void setCategorie(String acategorie) {
        this.category = acategorie;
    }

    @Override
    public String toString(){
 return "the price is "+this.prices+ " $ and it's "+ this.description +" "+ this.category;
    }

}
