class Main{
    public Integer numOfLegs = 4;
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        System.out.println(Dog.speak);

        Dog labrador = new Dog();
        Dog goldenRetriever = new Dog();
        Dog boarderCollie = new Dog();

        labrador.numOfLegs = 10;
        
        System.out.println(labrador.numOfLegs);
        System.out.println(goldenRetriever.numOfLegs);
    }
}