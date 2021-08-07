public class Mathematic {
    int x;
    int y;

    public Mathematic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int division() throws Exception{
        int result = 0;
        try {
            result = x / y;
        } catch (Exception e){
            System.out.println("exeption");
        }

        return result;
    }
}
