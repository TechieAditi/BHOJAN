package Model;

public class listitem {
    private String name;
    private String price;
    private String qu;

    public listitem(String name,String price,String qu)
    {
        this.name=name;
        this.price=price;
        this.qu=qu;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getqu() {
        return qu;
    }

    public void setqu(String name) {
        this.qu = qu;
    }



}
