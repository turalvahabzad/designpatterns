package proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = ObjectCreator.createObject(RealImage.class);

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}