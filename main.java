public class main { 
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        init();
    }
    private static void init() {
        renderer window = new renderer(800, 600); // make a new window
        window.drawPoly(new int[]{10, 10, 300, 300,0,100});
        
    }

    
}