import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
    Calculator calc = new Calculator(5, 6);

        Gson gson = new Gson();
        String calcJson = gson.toJson(calc);

        System.out.println(calcJson);
    }
}
