public class main {
    public static void main(String[] args){
        double springTotal = 575;
        double summerTotal = 727.37;
        double fallTotal = 1026.21;
        double winterTotal = 843.74;
        double yearlyTotal = 0;
        yearlyTotal = springTotal + summerTotal + fallTotal + winterTotal;
        System.out.println("Your spring costs were $" + springTotal + ", your summer costs were $" + summerTotal + ", your fall costs were $" + fallTotal + ", your winter costs were $" + winterTotal + ", for a yearly maintenance cost of $" + yearlyTotal);
    }
}
