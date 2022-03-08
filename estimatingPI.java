

public class estimatingPI{
    //draw mainPanel = new draw();
    public static void main(String[] args) {
        double interval = 0.00000000000001; //This number should be as low as possible so there is less of a distance between points
        double width = interval*150000; //This number should be as high as possible to get a good dataset
        double x = 0;
        double y = 0;
        double radius = width/2;
        double totalCount = 0;
        double inCircleCount = 0;
        double dist;
        

        while(x<width){
            while(y<width){
                dist = ((x - radius)*(x-radius)) + ((y - radius)*(y-radius));
                if (dist <= (radius*radius)){
                    inCircleCount ++;
                }
                y += interval;
                totalCount++;
            }
            System.out.println(x + " " + y);
            x += interval;
            y = 0;  
        }
        System.out.println(4*((double)inCircleCount/totalCount));
       }
    }
 