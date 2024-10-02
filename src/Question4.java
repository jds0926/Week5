public class Question4 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            System.out.println("i = "+i);
            if(i==50){
                break;
            }
        }System.out.println("50을 찾아 중단되었습니다");
    }
}
