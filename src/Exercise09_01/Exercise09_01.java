//Author: Tae Soo Kim
//Check: Pass
package Exercise09_01;

public class Exercise09_01 {
    double width = 1;
    double height = 1;
    public Exercise09_01(){}
    public Exercise09_01(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2*width + 2*height;
    }
    public static void main(String[] args) {
        Exercise09_01 rect = new Exercise09_01(4, 40);
        System.out.println(rect.width);
        System.out.println(rect.height);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        Exercise09_01 rect2 = new Exercise09_01(3.5, 35.9);
        System.out.println(rect2.width);
        System.out.println(rect2.height);
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());


    }
}

// Sample Output:
// 4.0
// 40.0
// 160.0
// 88.0

// 3.5
// 35.9
// 125.64999999999999
// 78.8