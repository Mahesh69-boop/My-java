public class ShoopingSystem {
    static class product{
        int id;
        String name;
        double price;
        int quantity;

        product(int id, String name, double price, int quantity){
            this.id=id;
            this.name=name;
            this.price=price;
        }
    }
    static class cartitem{
        int quantity;
        double totalPrice;

        cartitem(int quantity,double totalprice){
            this.quantity=quantity;
            this.totalPrice=totalprice;
        }
    }
    static class cart{
        int noOfItems;
        cart(int noOfItems){
            this.noOfItems=noOfItems;
        }

        void update(){
            

        }
    }
    static class customer{
        String name;

        customer(String Name){
            this.name=Name;

        }
    }
    
}
