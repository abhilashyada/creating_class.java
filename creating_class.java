class Rectangle {
    int width;
    int height;
    
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect.width);
        System.out.println(rect.height);
    }
}