import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Accident{
    public static void main(String[] args) {
        int  MorningAcc=0, MorningVec=0, MorningDea=0, NoonAcc=0, NoonVec=0,NoonDea=0, NightAcc=0, NightVec=0, NightDea = 0;
        double Morningrat=0,Noonrat=0,Nightrat=0;
       try{ 
        File file = new File("/Users/maheshbhandari/Downloads/accidents.txt");
        Scanner sc = new Scanner(file);
        
       
        if(sc.hasNextLine()){
            sc.nextLine();
        }
        while(sc.hasNextLine()){
            String line = sc.nextLine().trim();
            String[] data = line.split("\\s+");
             if (data.length ==3){
                try{
                    int acctime = Integer.parseInt(data[0]);
                    if(acctime>=6 && acctime<=12){
                        MorningAcc ++;
                        MorningVec += Integer.parseInt(data[1]);
                        MorningDea += Integer.parseInt(data[2]);  
                    }
                    if(acctime>=13 && acctime<= 19){
                        NoonAcc++;
                        NoonVec += Integer.parseInt(data[1]);
                        NoonDea += Integer.parseInt(data[2]);
                    }
                    if((acctime>=20 && acctime<=23) || (acctime>=0 && acctime<=5)){
                        NightAcc++;
                        NightVec += Integer.parseInt(data[1]);
                        NightDea += Integer.parseInt(data[2]);   
                    }              
                }
                catch (NumberFormatException e) {
                    System.out.println("Error parsing data: " + line);
                }
             }
             else{
                System.out.println("Invalid line format: " + line);
             }

        }
        if(MorningAcc>0){
            Morningrat =(double) MorningVec/MorningAcc;
        }
       if(NoonAcc>0){
        Noonrat = (double)NoonVec/NoonAcc;
       }
       if(NightAcc>0){
        Nightrat = (double)NightVec/NightAcc;
       }
       
       

    }
    catch (FileNotFoundException e) {
        System.out.println("File not found: " + e.getMessage());
    }
    System.out.println("Time Span      Accidents       Vehicles      Fatals      Veh/Acc");
    System.out.println("-----------------------------------------------------------------");
    System.out.printf("Morning  %10d         %8d       %6d         %.4f%n",MorningAcc, MorningVec, MorningDea,Morningrat);
    System.out.printf("Afternoon %10d        %8d        %6d        %.4f%n",NoonAcc, NoonVec, NoonDea, Noonrat);
    System.out.printf("Night     %10d        %8d        %6d        %.4f%n",NightAcc, NightVec, NightDea, Nightrat);
    System.out.println("-------------------------------------------------------------------");
    if(Morningrat>Noonrat && Morningrat>Nightrat){
        System.out.println("The Morning time has the highest vehicle to accident  \n" +//
                           "ration which means more vehicles are involved in each  \n" + //
                           "accident in the morning than in any other time spans.\n");
    }
    else if(Noonrat>Morningrat && Noonrat>Nightrat){
        System.out.println("The Afternoon time has the highest vehicle to accident  \n" + //
                           "ration which means more vehicles are involved in each  \n" + //
                           "accident in the AfterNoon than in any other time spans\n");
    }
    else if(Nightrat>Morningrat && Nightrat>Noonrat){
        System.out.println("The Night time has the highest vehicle to accident  \\n" + //
                           "ration which means more vehicles are involved in each  \\n" + //
                           "accident in the Night than in any other time spans\n");

    }
       
    }

}