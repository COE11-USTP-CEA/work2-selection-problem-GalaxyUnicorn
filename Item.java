class Item{
    String name;
    String catname;
    float price;

    public void Setname(String n){
        name = n;
    }
    public void Setcatname(String c){
        catname = c;
    }
    public void Setprice(float p){
        price = p;
    }
    public String Getname(){
        return name;
    }
    public String Getcatname(){
        return catname;
    }
    public float Getprice(){
        return price;
    }
    public Item(String n, String c, float p){
        name = n;
        catname = c;
        price = p;
    }
}