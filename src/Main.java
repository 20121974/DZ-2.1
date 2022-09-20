public class Main {
    public int changeValue(int value) {
        value = 22;
        return value;
    }

    public void main(String[] args) {
        int value = 33;
        value = this.changeValue(value);
        System.out.println("value = " + value);
    }
}