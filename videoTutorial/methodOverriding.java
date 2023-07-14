package videoTutorial;
class shape{
  void draw()
    {
        System.out.println("Can't say sape type");
    }
}
  class round extends shape
    {   
        @Override
        void draw(){
            super.draw();
            System.out.println("Round shape");
        }
    }

public class methodOverriding {
        public static void main(String[] args) {
            shape obj = new round();
            obj.draw();


        }
    
}
