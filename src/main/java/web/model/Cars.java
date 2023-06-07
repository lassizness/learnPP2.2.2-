package web.model;

public class Cars {
    private int id;
    private String brand;
    private String color;

    public Cars(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;

    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getColor(){
        return this.color;
    }
    public void getColor(String color){
        this.color=color;
    }
}
