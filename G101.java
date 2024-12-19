package com.mycompany.v2q6;
import java.util.Scanner;
public class G101 {

    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       String name; 
       String time1,time2;
              
       name=kb.nextLine();
       time1=kb.nextLine();
       time2=kb.nextLine();
       for(int i=1;i<=60;i++){ 
           System.out.print("+");
           if(i==60){
               System.out.print("\n");
           }
       }
       
       generateInitials(name);
        calculateInterval(time1,time2);
       for(int i=1;i<=60;i++){
           System.out.print("+");
       }
    }
    
    public static void generateInitials(String namae){
       char []namearr; 
       char []newarr= new char[1000]; 
       
       if (namae.contains("_")||namae.contains("-")||namae.contains("'")||namae.contains(".")){ 
           namae = namae.replaceAll("[^a-zA-Z]", " "); //cleans everything that is not alphabet
       }
       
       namae=namae.toUpperCase(); //capitals everything
       
       if (namae.equals("LEE")||namae.equals("KAH")||namae.equals("SING")||namae.equals("KAH SING")||namae.equals("SING LEE")){
           namae="LEE KAH SING";
       }
       if(namae.contains(" A/L ")){
           String regex=" A/L ";
           namae=namae.replaceAll(regex, " ");
       }
       if(namae.contains(" A/P ")){
           String regex=" A/P ";
           namae=namae.replaceAll(regex, " ");
       }
       if(namae.contains(" BIN ")){
           String regex=" BIN ";
           namae=namae.replaceAll(regex, " ");
       }
       if(namae.contains(" BINTI ")){
           String regex=" BINTI ";
           namae=namae.replaceAll(regex, " ");
       }
       if(namae.contains(" AL ")){
           String regex=" AL ";
           namae=namae.replaceAll(regex, " ");
       }
       if(namae.contains(" AP ")){
           String regex=" AP ";
           namae=namae.replaceAll(regex, " ");
       }
       namearr=namae.toCharArray();
      
       if (namae.contains("LEE")||namae.contains("KAH")||namae.contains("SING")||namae.contains("RIDWAN")||namae.contains("SURESH")){
        isPrintingWelcomeMessage(namae); //g101 members
       }
       
       newarr[0]=namearr[0]; //to include first character that is not included later
       int j=1;
       
       for(int i=1;i<namearr.length-1;i++){ //for initials
       if(namearr[i]==' '){
               newarr[j]=namearr[i+1];
               j++;
           }
       }
       
       namae=new String(newarr); //convert array to string
       if(namae.contains("LKS")||namae.contains("KSL")){ //lee kah sing special
           if(namae.charAt(0)=='L'){
           System.out.println("LKS!!!!!!!!!!");
           System.out.println("WE KNOW IT'S YOU!");
           }
           else{
               System.out.println("KSL!!!!!!!!!!");
           System.out.println("WE KNOW IT'S YOU -- LEE KAH SING!");
           }
       }
       else{
        System.out.println(namae);
       }
    }
    
    public static void isPrintingWelcomeMessage(String namae){
        System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");
    }
    
    public static void calculateInterval(String t1, String t2){
        
        String regex=":";
        String[]i1=t1.split(regex); 
        String[]i2=t2.split(regex);
        int[]time1=new int[3];
        int[]time2=new int[3];
        for(int i=0;i<3;i++){ //string to int
            time1[i]=Integer.parseInt(i1[i]);
            time2[i]=Integer.parseInt(i2[i]);
        }
        if((time1[0]==12&&time1[2]>0)||(time1[0]==0&&time1[2]>0)||(time1[0]>0&&time1[0]<6)||time2[0]<6){ //caution if sleeping late
            System.out.println("SLEEP NOW!!!!!!!!!!");
        }
        
        if(time1[0]>=12&&time2[0]<=12){ //for weird time formats
            time2[0]+=24;
        }
        if(time1[0]>time2[0]){
            time2[0]+=12;
        }
        
        for(int i=2;i>=0;i--){ //calculations
            if (time1[i]>time2[i]){
                time2[i-1]-=1;
                time2[i]+=60;
            }
            time1[i]=time2[i]-time1[i];
        }
        System.out.printf("%02d:%02d:%02d", time1[0], time1[1], time1[2]);
        System.out.println("");
    }
}