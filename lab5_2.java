public class lab5_2 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        // Dynamic Method Dispatch
        apple.show();
        banana.show();
        cherry.show();
    }
}

class Apple {
    public void show() {
        System.out.println("Inside Apple class");
    }
}

class Banana extends Apple {
    @Override
    public void show() {
        System.out.println("Inside Banana class");
    }
}

class Cherry extends Apple {
    @Override
    public void show() {
        System.out.println("Inside Cherry class");
    }
}
