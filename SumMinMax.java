//Jeff Blankenship
//CS-151
//loop iteration example

//this code creates an array of doubles and assigns
//random values to the elements, then finds the min, max, 
//and sum.  Finally, it prints the array and the results.
//Each type of loop is used.

public class SumMinMax{

  public static void main (String[] args){
    
    double[] array = new double[10];
    
    //iterate through array assigning random values
    //using a for loop
    for (int index=0; index<array.length; index++){
        array[index] = Math.random() * 10;      
    }
    
    //iterate through the array calculating min,max
    //and sum using a while loop.
    double max = 0.0;
    double min = 999.99;
    double sum = 0.0;
    int index = 0;
    while (index<array.length) {
      //add current element to total
      sum += array[index];  
      //replace max if current element is larger
      if (array[index]>max){
        max = array[index];
      }
      //replace min if current element is larger
      if (array[index]<max){
        min = array[index];
      }
      index++;
    } //while(index<array.length)
      
    //iterate through the array printing the values
    //usind a do loop
    index = 0;
    do{
      System.out.printf("%8.2f", array[index]);
    } while (++index<array.length);
  }
}








