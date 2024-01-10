//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        burger burgerorder = new burger();
        FrozenCustard FCorder = new FrozenCustard();
        Drinks DrinkOrder = new Drinks();
        ShoppingCart Cart = new ShoppingCart();
        Cart.Mapping();
        int price=0;


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
                        Cart.Scart.put("ShackBurger",Cart.Scart.get("ShackBurger")+1);


                    }else if(confirm==2){continue;}

                }
                else if(burger==2){
                    System.out.println(burgerorder.dish2);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=burgerorder.SmokeShack;
                        Cart.Scart.put("SmokeShack",Cart.Scart.get("SmokeShack")+1);

                    }else if(confirm==2){continue;}

                }
                else if(burger==3){
                    System.out.println(burgerorder.dish3);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=burgerorder.ShroomBurger;
                        Cart.Scart.put("ShroomBurger",Cart.Scart.get("ShroomBurger")+1);

                    }else if(confirm==2){continue;}

                }
                else if(burger==4){
                    System.out.println(burgerorder.dish4);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=burgerorder.Cheeseburger;
                        Cart.Scart.put("Cheeseburger",Cart.Scart.get("Cheeseburger")+1);

                    }else if(confirm==2){continue;}

                }
                else if(burger==5){
                    System.out.println(burgerorder.dish5);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=burgerorder.Hamburger;

                        Cart.Scart.put("Hamburger",Cart.Scart.get("Hamburger")+1);
                    }else if(confirm==2){continue;}

                }




            }
            if(num==2){
                FCorder.FrozenCustardlist();
                int FC =  sc.nextInt();
                if(FC==1){
                    System.out.println(FCorder.dish1);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=FCorder.Shake;
                        Cart.Scart.put("Shake",Cart.Scart.get("Shake")+1);

                    }else if(confirm==2){continue;}

                }
                if(FC==2){
                    System.out.println(FCorder.dish2);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=FCorder.ShakeOfTheWeek ;
                        Cart.Scart.put("ShakeOfTheWeek",Cart.Scart.get("ShakeOfTheWeek")+1);

                    }else if(confirm==2){continue;}

                }
                if(FC==3){
                    System.out.println(FCorder.dish3);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=FCorder.RedBean ;
                        Cart.Scart.put("RedBean",Cart.Scart.get("RedBean")+1);

                    }else if(confirm==2){continue;}

                }
                if(FC==4){
                    System.out.println(FCorder.dish4);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=FCorder.Float ;
                        Cart.Scart.put("Float",Cart.Scart.get("Float")+1);

                    }else if(confirm==2){continue;}

                }




            }
            if(num==3){
            DrinkOrder.Drinkslist();
                int D =  sc.nextInt();
                if(D==1){
                    System.out.println(DrinkOrder.dish1);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=DrinkOrder.FreshBrewedIcedTea;
                        Cart.Scart.put("FreshBrewedIcedTea",Cart.Scart.get("FreshBrewedIcedTea")+1);

                    }else if(confirm==2){continue;}

                }
                if(D==2){
                    System.out.println(DrinkOrder.dish2);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=DrinkOrder.FiftyFifty;
                        Cart.Scart.put("FiftyFifty",Cart.Scart.get("FiftyFifty")+1);

                    }else if(confirm==2){continue;}

                }
                if(D==3){
                    System.out.println(DrinkOrder.dish3);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=DrinkOrder.FountainSoda ;
                        Cart.Scart.put("FountainSoda",Cart.Scart.get("FountainSoda")+1);

                    }else if(confirm==2){continue;}

                }
                if(D==4){
                    System.out.println(DrinkOrder.dish4);
                    confirmorder();
                    int confirm = sc.nextInt();
                    if(confirm==1){
                        price+=DrinkOrder.AbitaRootBeer ;
                        Cart.Scart.put("AbitaRootBeer",Cart.Scart.get("AbitaRootBeer")+1);

                    }else if(confirm==2){continue;}

                }




            }



            else if(num==5){


                for(String key: Cart.Scart.keySet()){
                    if(Cart.Scart.get(key)!=0) {
                        System.out.print(key + " ");
                        System.out.print(Cart.Scart.get(key).toString() + "개 ");
                    }


                }
                System.out.println();
                System.out.println("결제금액:"+price +"원");
                System.out.println("주문 완료");
                break;}

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