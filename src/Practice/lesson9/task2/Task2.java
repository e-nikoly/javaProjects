package Practice.lesson9.task2;

public class Task2 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10.0, 10.0, 10.0),
                new Triangle("Green", 10.0, 20.0, 30.0),
                new Triangle("Red", 10, 20.0, 15.0),
                new Rectangle("Red", 5.0, 10.0),
                new Rectangle("Orange", 40.0, 15.0),
                new Circle("Red", 4.0),
                new Circle("Red", 10.0),
                new Circle("Blue", 5.0)
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }
        public static double calculateRedPerimeter(Figure[] figures){
            double p = 0;
            for (Figure x: figures) {
                
                if (x.getColor().equals("Red")){
                    p =+x.perimeter();
                }               
            }
           
            return p;
        }
        public static double calculateRedArea(Figure[] figures){
            double p = 0;
            for (Figure x: figures) {

                if (x.getColor().equals("Red")){
                    p =+x.area();
                }
            }

            return p;

        }






}
