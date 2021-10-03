import java.util.Stack;
public class StoneWalls {
    public int solution(int[] H) {
        Stack<Integer> zeki = new Stack<>();
        int counter=0;
        for(int i :H){
            while(!zeki.isEmpty() && zeki.peek()>i){
                zeki.pop();
            }
            if(!zeki.isEmpty() && zeki.peek()==i){

            }
            else{
                zeki.push(i);
                counter++;
            }
        }
        return counter;
    }
    public static void main(String [] args){
        StoneWalls stonewalls = new StoneWalls();
        System.out.println(stonewalls.solution(new int[]{8,8,5,7,9,8,7,4,8}));
    }
}
