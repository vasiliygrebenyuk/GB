public class MetodClass{
	public static void main(String[] args) {
		System.out.println(summ(5,5));
		PrintSomeTest();
		PrintMyText("Vasia");
	}
    public static int summ(int a, int b){
	    return a + b;
    }
    public static void PrintSomeTest(){
    	System.out.println("Hello");
    }
    public static void PrintMyText(String txtToPrint){
    	System.out.println(txtToPrint);
    }
}