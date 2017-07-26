/**
 * Created by kkumar1 on 3/31/17.
 */
public class Prob {

    public static int GetJumpCount(int input1,int input2,int[] input3)
    {
        int count = 0;
        int hieght =0;
        for(int index=0; index< input3.length; index++){
            hieght = input3[index];
            if(hieght <= input1){
                count++;
                continue;
            }
            while(hieght >= input1){
                count++;
                hieght = hieght - input1 + input2;
            }
            count++;
        }
        return count;
    }
    public static  void main(String[] args){
        int arr[] = {5,8};
        System.out.println("res::"+GetJumpCount(5,1,arr));
    }

}
