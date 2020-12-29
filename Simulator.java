/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contfileall;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Adam
 */

public class Simulator {
   public int dspace;
   public int nfiles;
      public int len1;
      public int last;
     public int st;
     String[]ref;
     
             ArrayList<Integer> pointers; 

      public Simulator(){
          last = 0;
      }

   int[]disk;
    TheFile[] a=new TheFile[nfiles];
    
     
   public void emp()
   {
        for(int i=0;i<dspace;i++) //empty the disk
        {  
          disk[i]=-1;
          ref[i]=null;
        }
 
}
    public int allocate()
    {
           for(int i=0;i<dspace;i++){
             int c=0;
    for(int j=i;j<len1+i;j++){
        if(disk[j]==-1)
            c++;
        else
            break;
        if(c==len1){
            for(int z=i;z<(i+len1);z++){
                 disk[z]=1; 
        }
            return i;
    }
         if(len1+i>dspace){
            break;
        }
    } 
}
               return -1;

}
    public void Lallocate(String name)
    {
        int count=0; 
        
        while(count!=len1)
        {
        Random rand = new Random();
        int r = rand.nextInt( Integer.MAX_VALUE )%dspace;
        while(disk[r]==1)
        {
          r = rand.nextInt( Integer.MAX_VALUE )%dspace;
        }
                    disk[r]=1;
                    ref[r]=name;
                    count++;  
                         
                 if (count==1)
                 st=r;
                 last=r;
      
        }
                        
        }
          public void poin(String n){
              System.out.print(n+ " Has the following pointers:  ");
             for(int i=0;i<dspace;i++) {
                 if(n.equals(ref[i])){
                     System.out.print(i+" ");
                 }
                     
             }
             System.out.println("");
          }           

     public void Indallocate(String name) throws IOException
     {
               File myObj = new File("Indexes.txt");
FileWriter myWriter = new FileWriter("Indexes.txt");
        int count=0;
        int i=0;
        
        while(count!=len1)
        {
       Random rand = new Random();
       int r = rand.nextInt( Integer.MAX_VALUE )%dspace;
       int index = rand.nextInt( Integer.MAX_VALUE )%dspace;
       while(disk[r]==1 || disk[index] == 1 || r == index)
       {
        index = rand.nextInt( Integer.MAX_VALUE )%dspace;
        r = rand.nextInt( Integer.MAX_VALUE )%dspace;
       }
                    disk[r]=1;
                    ref[r]=name;
                     count++; 
                      
                 if (count==1){
               st=r;
              disk[index]=1;
              myWriter.write(new Integer(index).toString() + " ");
                 }
                 last=r;
                      myWriter.write(new Integer(r).toString() + " ");

            }
            myWriter.close();
      
            display();
               
     }
     
           
    

void display() throws FileNotFoundException{

int c = 0;
               File myObj = new File("Indexes.txt");

      Scanner myReader = new Scanner(myObj);            
                while (myReader.hasNext()) {
       
        if(c == 0){
             String data = myReader.next();
            System.out.print("Index Block : ");
        System.out.println(data);
        c++;
       System.out.print(" blocks in order:");
}
        else         
        {
           String data = myReader.nextLine();
            System.out.println(data);
        }
      }
}

}
