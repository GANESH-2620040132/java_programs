
public class StudentMarks {
    public static void main(String[] args){
   int[] marks = {70,45,80,35,90};
   System.out.println("Student marks:");
   for(int i = 0;i< marks.length;i++){
    System.out.println(marks[i]);
   }
   int search = 80;
   for(int i = 0;i<marks.length;i++){
    if(marks[i]== search){
        System.out.println("80 found at index " + i);
    }
}
int count = 0;
for(int i = 0;i<marks.length;i++)
if(marks[i]>=40){
    count++;
}
    }
    System.out.println("Students passed:" + count);
    int highest = [0];
    int lowest = [0];
    for(int i = 0;i<marks.length;i++){
        if(marks[i]>highest){
            highest = marks[i];
        }
        if(marks[i]<lowest){
            lowest = marks[i];
        }
    }
    System.out.println("Highest mark:" + highest);
    System.out.println("Lowest mark:" + lowest);
}
 
    



    