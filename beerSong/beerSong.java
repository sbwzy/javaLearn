public class beerSong {
    public static void main (String[] args){
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){
            if(beerNum == 1){
                word = "bottle"; // 单数的瓶子
            }

            System.out.println(beerNum+" "+word+" of beer on the wall");
            System.out.println(beerNum+" "+word+" of beer");
            System.out.println("Take One down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum > 0){
                // System.out.println(beerNum+" "+word+" of bear on the wall");
                System.out.println("---------------------------------------------");
            }
            else{
                System.out.println("No more bottles of bear on the wall.");
            }// else end
        }// while end
    }// main end
}// class end