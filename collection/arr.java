package collection;

public class arr {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,1,1,1,0,1,1,0,3,3,3,3,5,4,2,6,6,6};

        int tripletCount = 0;
        int quadletCount = 0;

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count == 3) tripletCount++;
                if (count == 4) quadletCount++;
                count = 1;
            }
        }

        // check last group
        if (count == 3) tripletCount++;
        if (count == 4) quadletCount++;

        System.out.println("Triplets: " + tripletCount);
        System.out.println("Quadlets: " + quadletCount);
    }
    }

