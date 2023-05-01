class Product {
    int price;
    int bonusPoint;
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString(){
        return "tv";
    }
}
class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){return "Computer";}
}
class Audio extends Product{
    Audio(){
        super(300);
    }
    public String toString(){return "Audio";}
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if (money < p.price){
            System.out.println("잔액부족");
            return;
        }
        money = money - p.price;
        bonusPoint = bonusPoint + p.bonusPoint;
        System.out.println(p+"을/를 구매하셨습니다.");
    }
}
class PolyArgumentTest{
    public static void main(String[] args) {
        Buyer b= new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println(b.money);
        System.out.println(b.bonusPoint);
    }
}