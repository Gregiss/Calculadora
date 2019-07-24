
import java.text.DecimalFormat;

public class CalculatorEngine {
    private float value, keep;
    private int toDo;
 
    void CalculatorEngine(){
        value = keep = 0;
    }
 
    void Operation(int op, String tela){
        keep = Float.parseFloat(tela);
        toDo = op;
        System.out.println(keep + "|" + toDo);
    }
    float Display(String tela){
        DecimalFormat df = new DecimalFormat("#.00");
        value = Float.parseFloat(tela);
        System.out.println(value + "|" + toDo);
        switch(toDo){
            case 0: 
                System.out.println(keep + "|" + value);
                return keep+value;
            case 1: 
                System.out.println(keep + "|" + value);
                return keep-value;
            case 2: 
                System.out.println(keep + "|" + value);
                return keep*value;
            case 3:
                System.out.println(keep + "|" + value);
                return keep/value;
        }
        return 0;
    }
}
