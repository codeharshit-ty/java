import java.util.*;
/**
 * average
 */
class average {
    public static void main(String[]args){
        int sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subjects:");
        int noofSubjects = sc.nextInt();
        int marks[] = new int[noofSubjects];
        System.out.println("enter the marks of" +noofSubjects+"Subjects.press Enter to give marks for another subjects");
        for(int i = 0;1<noofSubjects;i++){
            marks[i] = sc.nextInt();}
        for(int j=0;j<noofSubjects;j++){
            sum = sum+marks[j];}
        int percentage= sum/noofSubjects;
        System.out.println(percentage);
        if(percentage>=95){
            result = "you scored outstanding grade .great work!";
        }else if(percentage>=90&& percentage<95){
            result = "you scored A+.well done";
        }
        else{
            result = "you passsed";
        }
        System.out.println(result);
        }
        }
    
