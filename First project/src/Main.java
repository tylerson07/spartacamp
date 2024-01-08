//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);

        burger burgerorder = new burger();
        int price=0;
        StringBuilder order = new StringBuilder();

        while(true){
            menuscreen();
            int num =  sc.nextInt();
            if(num==1){
                burgerorder.burgerlist();
                int burger =  sc.nextInt();

                if(burger==1){
                    System.out.println(burgerorder.dish1);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=burgerorder.ShackBurger;
                        order.append("ShackBurger ");

                    }else if(confirm==2){continue;}

                }
                else if(burger==2){
                    System.out.println(burgerorder.dish2);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=burgerorder.SmokeShack;
                        order.append("SmokeShack ");

                    }else if(confirm==2){continue;}

                }
                else if(burger==3){
                    System.out.println(burgerorder.dish3);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=burgerorder.ShroomBurger;
                        order.append("ShroomBurger ");

                    }else if(confirm==2){continue;}

                }
                else if(burger==4){
                    System.out.println(burgerorder.dish4);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=burgerorder.Cheeseburger;
                        order.append("Cheeseburger ");

                    }else if(confirm==2){continue;}

                }
                else if(burger==5){
                    System.out.println(burgerorder.dish5);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=burgerorder.Hamburger;
                        order.append("Hamburger ");

                    }else if(confirm==2){continue;}

                }




            }
            else if(num==5){System.out.println(order+" 가격:"+price+"원"+" 주문완료");break;}

        }













    }
    public static void  menuscreen(){
        System.out.println();
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
        System.out.println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
    }

    public static void confirmorder(){
        System.out.println();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

    }

}