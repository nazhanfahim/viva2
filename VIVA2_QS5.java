/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package viva2.viva2_qs5;

/**
 *
 * @author TenZo
 */
public class VIVA2_QS5 {

    public static void main(String[] args) {
        String[] studentID = {"S0001", "S0002", "S0003", "S0004", "S0005", "S0006"};
 String[] studentName = {"John", "Cindy", "Alex", "Ali", "Rosli", "Roger"};
 int[] mark = {59, 62, 21, 36, 85, 74};
String[][] studentInfo = getStudentInfo(studentID, studentName, mark);
        
 System.out.println("List of Students and their Marks: ");
 printStudentInfo(studentInfo);
 System.out.println("Student with highest marks: ");
 findStudentWithHighestMarks(studentInfo);
 double average = findAverage(mark);
 System.out.println("Average mark: " + average);
 System.out.println("Students scoring below the average:");
 listStudentsBelowAverage(studentInfo, average);


    }
   public static String [][] getStudentInfo(String [] studentID, String[] studentName,int[] mark){
       
       String[][] studentInfo = new String[studentID.length][mark.length];
       for(int i=0;i<studentID.length;i++){
             studentInfo[i][0]= studentID[i];
             studentInfo[i][1]= studentName[i];
             studentInfo[i][2]= Integer.toString(mark[i]);
             
          } return studentInfo;
}
   public static void printStudentInfo(String [][] studentInfo){ 
      for(int i=0;i<studentInfo.length;i++){
             System.out.print(studentInfo[i][0]+" - ");
             System.out.print(studentInfo[i][1]);
             System.out.printf("\t"+": "+studentInfo[i][2]);
             System.out.println();
      }
   }
     public static void findStudentWithHighestMarks(String[][] studentInfo){
       int high =Integer.parseInt(studentInfo[0][2]) ;
       String studentHighest = studentInfo[0][1];
       for(int i =1; i<studentInfo.length;i++){
         int num =  Integer.parseInt(studentInfo[i][2]) ;
         if(num>high){
             high=num;
             studentHighest = studentInfo[i][1];
         }
       }
         System.out.println(studentHighest+": "+ high);
       
   }
     public static double findAverage(int[] mark){
         double sum=0;
         for(int i=0;i<mark.length;i++){
              sum+=mark[i];
        }
        double avg = sum/mark.length;
        return avg;
         
     }
     public static void listStudentsBelowAverage(String[][] studentInfo, double average){
         String name;
         int below;
         for(int i=0;i<studentInfo.length;i++){
            if(Integer.parseInt(studentInfo[i][2])<average) {
               below= Integer.parseInt(studentInfo[i][2]);
               name=studentInfo[i][1];
               System.out.println(name+" : "+below); }
             
            
        } 
        
     }

           

}
