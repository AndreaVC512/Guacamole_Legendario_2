package calculadora;
public class operaciones {
    private float num1;
    private float num2;
    public float getNum1() {
        return num1;
    }
    public void setNum1(float num1) {
        this.num1 = num1;
    }
    public float getNum2() {
        return num2;
    }
    public void setNum2(float num2) {
        this.num2 = num2;
    }
    public float sumar(){
        return num1 + num2;
    }
    public float restar(){
        return num1 - num2;
    }
    public float multiplicar(){
        return num1 * num2;
    }
    public float dividir(){
        return num1 / num2;
    }
}