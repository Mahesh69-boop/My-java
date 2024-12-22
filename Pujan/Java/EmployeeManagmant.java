public class EmployeeManagmant {
    static class Employee{
        String Name;
        int age;
        final double salary= 10000;

        String addSkills(String Skill){
            return "Skill added: " + Skill;
        }
        public Employee( String Name,int age){
            this.Name=Name;
            this.age=age;
        }

        String addSkills(String skills1, String skills2){
            return"Skill added: " + skills1 + " , " + skills2;
        }
        void salary(){
            System.out.println("The Base salary is :" + salary);
        }
        void displayinfo(){
            System.out.println("Employee Name : " + Name + "\n Age : " + age + "\nSalary : " + salary );
        }

    }
    static class Developer extends Employee{
        String Position= "developer";
        final double salary = 15000;

        Developer(String Name, int age){
            super(Name,age);
        }
        void displayinfo(){
            System.out.println("Name : " + Name + "\nPosition : " + Position + "\nSalary =" + salary + "\nAge : " + age);
        }

        void salary(){
            System.out.println("The salary of a Developer is : " + salary );
        }   
        void Promotion(double experience){
            if(experience>3){
                System.out.println("Employer should be promoted");
            }
            else{
                System.out.println("The Employer Should not be Promoted");
            }
        }
    }
    static class Manager  extends Employee{
        String Position= "Manager";
        final double Salary= 20000;
        Manager(String Name, int age){
            super(Name, age);
            
        }
        void displayinfo(){
            System.out.println("Name : " + Name + "\nPosition : " + Position + "\nSalary : " + salary + "\nAge : " + age);
        }
        void salary(){
            System.out.println("The salary of a Manager is " + salary);
        }
        void Promotion(int numOfTeamsmaged){
            if(numOfTeamsmaged>15){
                System.out.println("The mager Should be promoted");
            }
            else{
                System.out.println("The employer shouldn't be Promoted");
            }
            
        }

    }

    public static void main(String[] args) {
        Employee mahesh = new Employee("Mahesh", 19);
        mahesh.addSkills("DSA");
        mahesh.salary();
        mahesh.displayinfo();
        Developer Mahesh= new Developer("mahesh",19);
        Mahesh.displayinfo();
        Mahesh.salary();
        Mahesh.Promotion(3.3);
        Manager Pujan=new Manager("Pujan",19);
        Pujan.displayinfo();
        Pujan.salary();
        Pujan.Promotion(5);

    }
    
}
