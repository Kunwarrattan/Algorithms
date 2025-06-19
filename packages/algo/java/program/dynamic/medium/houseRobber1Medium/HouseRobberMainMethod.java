package packages.algo.java.program.dynamic.medium.houseRobber1Medium;

public class HouseRobberMainMethod {
    public static void main(String[] args) {
        int[] numbs = new int[]{16, 26, 31, 111, 2};//, 101, 102, 10, 29, 112, 32, 54, 65, 65};
        HouseRobber houseRobber = HouseRobberFactory.getHouseRobber("naive");
        assert houseRobber != null;
        System.out.println(houseRobber.rob(numbs));
    }
}
