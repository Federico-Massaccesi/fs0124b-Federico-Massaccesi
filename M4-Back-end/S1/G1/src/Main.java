//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 10;

        int y= 12;

        int result = moltiplicazione(x,y);

        System.out.println("Il risultato della moltiplicazione è " + result);

        String frase1 = "Benvenuto ";

        String frase2 = "Mario";

        System.out.println(concatena(frase1,frase2));

        String[] arrString ={"uno","due","tre","quattro","cinque"};

        String addedString= "sei";

        System.out.println(pushArr(arrString,addedString));
    }

    public static int moltiplicazione(int a,int b){

        return a*b;

    }

    public static String concatena(String x,String y){

    return x+y;

    }

    public static String[] pushArr(String[]arr,String string){

        String[] pushedArr = arr.set(int 3,string);

        return pushedArr;
    }
}