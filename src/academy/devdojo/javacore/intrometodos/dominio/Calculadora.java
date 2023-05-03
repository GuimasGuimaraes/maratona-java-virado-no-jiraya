package academy.devdojo.javacore.intrometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtrairDoisNumeros(){

        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros (int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros (double num1, double num2) {
        if(num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    // outra forma
    public double divideDoisNumeros2 (double num1, double num2) {
        if(num2 != 0) {
            return num1 / num2;
        }else {
            return 0;
        }

    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }



    


}




