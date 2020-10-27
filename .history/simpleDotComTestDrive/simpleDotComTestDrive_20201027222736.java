public class simpleDotComTestDrive{
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();// 初始化一个SimpleDotCom对象

        int[] locations = {2,3,4};// 创建带有dot com 位置的数组
        dot.setLocationCells(locations);// 调用dot com的setter

        String userGuess = "2";// 假的猜测
        String result = dot.checkYourself(userGuess);// 调用被测方法并传入假的数据
    }
}