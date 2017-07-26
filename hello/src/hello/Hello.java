package hello;

import java.util.Random;

class Hello
{
	 public static void main(String[]args)throws InterruptedException{

		    final int threads = Integer.parseInt(args[0]);
		    final int length= Integer.parseInt(args[1]);
		    final int balk=(length/threads);
		    Thread[]th = new Thread[threads];

		    final double[]result =new double[length];

		    final double[]array1=getRandomArray(length);
		    final double[]array2=getRandomArray(length);

		    long startingTime =System.nanoTime();
		    for(int i=0;i<threads;i++){
		        final int current=i;
		        

		        th[i]=new Thread(new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int k=current*balk;k<(current+1)*balk;k++){
			               result[k]=array1[k]+array2[k];
				         }
					}});
		        th[i].start();
		        
		    }
		    for(int i=0;i<threads;i++){
		        th[i].join();
		    }
		    System.out.println("Time needed: "+(System.nanoTime()-startingTime));


		}

	 private static double[]getRandomArray(int length){
		    Random random =new Random();
		    double[]array= new double[length];
		    for(int i=0;i<length;i++){
		        array[i]=random.nextDouble();
		    }
		    return array;
		}
}
