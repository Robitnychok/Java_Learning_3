package part5_Nested_Classes.local_Inner_Class;

public class Local_Inner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

}

class Math{
    public void getResult(){

        class Division{
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getCastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }
        }

        Division division = new Division();
        division.setDelimoe(21);
        division.setDelitel(4);
        System.out.println("Delimoe = " + division.getDelimoe());
        System.out.println("Delitel = " + division.getDelitel());
        System.out.println("Castnoe = " + division.getCastnoe());
        System.out.println("Ostatok = " + division.getOstatok());
    }
}