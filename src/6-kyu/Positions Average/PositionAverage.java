
public class PositionAverage {
    public static double posAverage(String s) {
        int com = 0, all = 0;
        String[] arr = s.split(", ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char[] tempArr = arr[j].toCharArray();
                char[] currentArr = arr[i].toCharArray();

                for (int z = 0; z < currentArr.length; z++) {
                    if (currentArr[z] == tempArr[z]) {
                        com++;
                    } else {
                        all++;
                    }
                }
            }
        }

        return (com / (double) (all + com)) * 100;
    }

    public static void main(String[] args) {
        System.out
                .println(posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490"));

        System.out
                .println(posAverage("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096"));

        System.out.println(posAverage("6900690040, 4690606946, 9990494604"));
    }
}