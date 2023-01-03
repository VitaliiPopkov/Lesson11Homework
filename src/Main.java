public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        myOuter.test = 11;
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        myInner.max(50, 15);
        myInner.average(5,7,0);
        myInner.min(35,29);


    }
}