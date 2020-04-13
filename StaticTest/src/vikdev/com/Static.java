package vikdev.com;

public  class Static {
    private static int numInstance = 0;
    private static String name;

    public  Static(String name){
        this.name = name;
        numInstance++;
    }

    public static int getNumInstance(){
        return numInstance;
    }

    public static String getName() {
        return name;
    }
}
