/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contfileall;
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
     
      public Simulator(){
          last = 0;
      }

   int[]disk;
    File[] a=new File[nfiles];
    
     
   
   public void emp(){
        for(int i=0;i<dspace;i++){  //empty the disk
     disk[i]=-1;
            
   
   }
 

      
    
    
}
    public int allocate(){
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
    public void Lallocate(){
        int count=0; 
        
        for(int x=0; x<len1; x++){
                            Random rand = new Random();
int r = rand.nextInt( Integer.MAX_VALUE )%dspace;

            for(int i=0; i<dspace;i++){
                if(disk[r]==-1){
                    disk[r]=1;
                }
                else 
                    break;
                
      
            }
               count++;             
   
            if (count==1)
               st=r;
            if(count==len1-1)
                last=r;
        }
       
    }
    
    
    
}