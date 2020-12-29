/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contfileall;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Adam
 */
public class ContFileAll 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
       // TODO code application logic here
        System.out.println("--------------File Allocation Simulator--------------");
        System.out.println("Press 1 for contiguous file allocation, Press 2 for Linked file allocation, Press 3 for Indexed file allocation");
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        System.out.println("Enter Size of Disk");
        Simulator s=new Simulator();
       s.dspace=sc.nextInt();
               s.ref=new String[s.dspace];

       s.disk=new int[s.dspace];
       
      String name;

  
        System.out.println("Size of disk="+s.dspace);
              System.out.println("Enter Number of files");
                      s.nfiles=sc.nextInt();
             
      
              TheFile a[]=new TheFile[s.nfiles];
              s.emp();
              for(int i=0;i<s.nfiles;i++){
                  a[i]=new TheFile();
                     System.out.println("Enter file name");
                     
                        
                name=sc.next();
            
            
                   System.out.println("Enter size of file");
                s.len1=sc.nextInt();
//              int x;
//                if (i==s.nfiles-1)
//                    x = 0;
                // s.emp();
                if(in==1)
                {
                int check;
                check=s.allocate();
              if(check!=-1){
                    a[i].name=name;
                             a[i].len=s.len1;
                             a[i].start=check;
                              a[i].end=a[i].start+a[i].len-1;
                }
                
               else{
                   
                   a[i].name=name;
                              a[i].len=s.len1;
                              a[i].start=-1;
                             a[i].end=-1;
               }
//               
                }
     if(in==2){
                         s.Lallocate(name);
        
                   a[i].name=name;
                              a[i].len=s.len1;
                              a[i].start=s.st;
                              a[i].end=s.last;
     }
     if(in==3){
                         s.Indallocate(name);
        
                   a[i].name=name;
                              a[i].len=s.len1;
                              a[i].start=s.st;
                              a[i].end=s.last;
     }
       
              }
       ;

              for(int i=0;i<s.nfiles;i++)
              {
                  System.out.print("Name: "+a[i].name+"      ");
                  System.out.print("Size: "+a[i].len+"      ");
                   System.out.print("Starting block "+a[i].start+"      ");
                  System.out.print("Ending block "+a[i].end+"      \n");
                  
     

              }
              
              if (in==3){
             for(int j=0;j<s.nfiles;j++)
                  {
                   
              }            
              }
                      
             if (in==2)
              {
              for(int j=0;j<s.nfiles;j++)
                  {
                   
         s.poin(a[j].name);
              }
              }

}
         
}
