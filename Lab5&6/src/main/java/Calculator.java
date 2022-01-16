public class Calculator {
private int firstNum;
private int secondNum;

    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        if(firstNum<0 || secondNum<0){
            throw new IllegalArgumentException();
        }
    }
    public int sum(){
        return this.firstNum + this.secondNum;
    }
    public int dif(){
        return this.firstNum - this.secondNum;
    }
    public int mul(){
        return this.firstNum * this.secondNum;
    }
    public int div(){

        if (firstNum == 0 || secondNum == 0){
            throw new IllegalArgumentException();
        }
        else{
            return this.firstNum / this.secondNum;
        }
    }


    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }
}
