public class hhh {
    public static void main(String[] args) {
          class Student{
             String name;
             int RollNo;
             int[] marks={87,67,54};

            Student(String name, int RollNo){
                this.name=name;
                this.RollNo=RollNo;
                
            }
             int calculateTotal(){
                int ttl=0;
                for(int i=0;i<marks.length;i++){
                    ttl+=marks[i];
                }
                return ttl;
            }
            double  Average(){
                double avg=calculateTotal()/marks.length;
                return avg;
            }
            void Displayinfo(){
                System.out.println("The name of student is " + name + "\n The Roll no of the student is"+RollNo + "\n The total number is " + calculateTotal()+ "\n The average marks of the student is " + Average());
            }

        }
        Student mahesh=new Student("Mahesh Bhandari",34);
        mahesh.Displayinfo();
    }
   
}