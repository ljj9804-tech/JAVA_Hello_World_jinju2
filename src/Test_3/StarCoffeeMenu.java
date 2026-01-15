package Test_3;

public class StarCoffeeMenu {
    //변수
    String menuName;
    String size;
    boolean isHot;

        //생성자로 묶기
        public StarCoffeeMenu(String menuName, String size, boolean isHot) {
            this.menuName = menuName;
            this.size = size;
            this.isHot = isHot;
        }

        //메뉴만 정하면, 기본 옵션 : Tall, true
        public StarCoffeeMenu(String menuName) {
            this(menuName,"Tall",true);
        }

        //메뉴와 사이즈 따로 정하면, 기본 옵션 : true
        public StarCoffeeMenu(String menuName, String size) {
            this(menuName,size,true);
        }

    //출력 메서드
    public void showMenu() {
        String tempType = isHot ? "HOT" : "ICE";

        System.out.println("주문한 메뉴 : " + menuName);
        System.out.println("사이즈 : " + size);
        System.out.println("HOT/ICE : " + tempType);
        System.out.println("===========================");
    }
} //class
