public class override{
    public static void main(String a[]){
        Rectangle rec = new Rectangle(40,60);
        System.out.println("Rectangle before resizing");
        rec.display();
        rec.resizeWidth(30);
        rec.resizeHeight(40);
        System.out.println("Rectangle after resizing");
        rec.display();
    }
}
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable{
    private int width;
    private int height;
    public Rectangle(int width,int height){
        this.width = width;
        this.height=height;
    }
    @Override
    public void resizeWidth(int width){
        this.width=width;
    }
    @Override
    public void resizeHeight(int height){
        this.height=height;
    }
    public void display(){
        System.out.println("Rectangle width :"+width+"\t Rectangle height : \t "+height);
    }

}
