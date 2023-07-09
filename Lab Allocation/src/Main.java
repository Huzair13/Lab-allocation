import java.util.*;
public class Main
{
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int allocated_lab_size=-1;
        int allocated_lab_index=-1;
        for (int i=0;i<3;i++){
            if(allocated_lab_size!=-1){
                if(arr[i]<allocated_lab_size && arr[i]>=n){
                    allocated_lab_size=arr[i];
                    allocated_lab_index=i;
                }
            }else{
                if (arr[i]>=n){
                    allocated_lab_size=arr[i];
                    allocated_lab_index=i;
                }

            }

        }
        System.out.println("L"+(allocated_lab_index+1));
    }
}