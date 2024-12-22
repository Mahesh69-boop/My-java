public class ppp {
    public static void main(String[] args) {
        class Rectangle{
            int Length;
            int Height;
             
            Rectangle(int Length,int Height){
                this.Length=Length;
                this.Height=Height;
            }
            int CalculatePerimeter(){
                return Length*Height;
            }
            void displayInfo(){
                System.out.println("The length of the rectangle is " + Length + " CM, and the Height is " + Height + " CM");
            }

        }
        Rectangle ABCD=new Rectangle(45,78);
        ABCD.displayInfo();
        int peremeter=ABCD.CalculatePerimeter();
        System.out.println("The Perimeter of the rectangle is " + peremeter + " CM^2");
    }
}