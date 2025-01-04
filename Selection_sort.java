import java.util.*;


public class Main {


static void selectionSort(int arr[],int n){
  
  
  
  
  for(int i=0;i<n-1;i++){
       int mini =i;
  
     
     for(int j=i+1;j<n;j++){
       
       if(arr[mini]>arr[j])
          mini=j;
       
     }
    
  
  
  
     int temp=arr[mini];
     arr[mini]=arr[i];
     arr[i]=temp;
  
  }  
  
      for(int i=0;i<n;i++)
          System.out.println(arr[i]);
  
  
}


    public static void main(String[] args) {
      
      
      int arr[]={ 12,54,67,54,23,54,98,43,66,22,98};
      selectionSort(arr,11);
  }
}
