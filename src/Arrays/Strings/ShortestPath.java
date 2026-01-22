package Arrays.Strings;

public class ShortestPath {

    public static double Path(String str){
        int x=0,y=0;double dist;int x1=x,y1=y;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='W'){
                x1--;
            }
            else if(str.charAt(i)=='E'){
                x1++;
            }
            else if(str.charAt(i)=='S'){
                y1--;
            }
            else {
                y1++;
            }
        }
        dist=Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
        return dist;
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(Path(str));
    }
}
