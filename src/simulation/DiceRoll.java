/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;
 

/**
 *
 * @author greendelta
 */
public class DiceRoll {
    public static void main(String [] args){
      
        double face1 = 1/6.0;
        double face2  = 2/6.0;
        double face3  = 3/6.0;
        double face4  = 4/6.0;
        double face5  = 5/6.0;
        double face6  = 6/6.0;
        
        
        int freq1 = 0;  //number of 1s rolled
        int freq2 = 0;  //number of 2s rolled
        int freq3 = 0; //number of 3s rolled
        int freq4 = 0; //number of 4s rolled
        int freq5 = 0; //number of 5s rolled
        int freq6 = 0; //number of 6s rolled
        double rollValue = 0.0; 
        int count = 0;
        //loop 1000 times
       while(count < 1000){
           rollValue = Math.random();
          // System.out.println(rollValue);
           
           if(rollValue >= 0.0 && rollValue < face1 )
           {freq1++;}
           else if(rollValue >= face1 && rollValue < face2)
           { freq2++;}
           else if( rollValue >= face2 && rollValue < face3)
           { freq3++;}
           else if(rollValue >= face3 && rollValue < face4)
           {freq4++;}
           else if(rollValue >= face4 && rollValue < face5)
           {freq5++;}
           else if(rollValue >= face5 && rollValue < face6)
           {freq6++;}
           count++;
       }
        
         float freq1p = ((float) freq1/1000)*100;
       float freq2p = ((float) freq2/1000)*100;
       float freq3p = ((float) freq3/1000)*100;
       float freq4p = ((float) freq4/1000)*100;
       float freq5p = ((float) freq5/1000)*100;
       float freq6p = ((float) freq6/1000)*100;
        System.out.println("Face\tFrequency\tPercentage %"); //output headers
        System.out.printf("1\t%d\t\t%.2f\n2\t%d\t\t%.2f\n3\t%d\t\t%.2f\n4\t%d\t\t%.2f\n5\t%d\t\t%.2f\n6\t%d\t\t%.2f\n",freq1,freq1p,
                freq2,freq2p,
                freq3,freq3p,freq4,freq4p,freq5,freq5p,freq6,freq6p);
     
       
       
    }
}
