public class Main {

    public static int[] repeatingNumbers(int[] arr){
        int[] repetitive = new int[arr.length/2+1];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    repetitive[count++] = arr[i];
                }
            }
        }
        return repetitive;
    }

    public static int[] repeatingCoupleNumbers(int[] arr){
        int[] coupleNumbers = new int[arr.length/2];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j] && arr[i]%2 == 0){
                    coupleNumbers[count++] = arr[i];
                }
            }
        }
        return coupleNumbers;
    }

    public static void main(String[] args) {

        int[] arr1 = {1234, 23, 53, 23, 44, 44, 159, 1234};

        System.out.println("arr1 dizisindeki Tekrarlayan Sayılar : ");
        int[] repeatingArr1 = repeatingNumbers(arr1);
        for(int i : repeatingArr1){
            if(i != 0){
                System.out.print(i + " - ");
            }
        }
        System.out.println("\n***********************");
        int[] repeatingCouples = repeatingCoupleNumbers(arr1);
        for(int i : repeatingCouples){
            if(i != 0){
                System.out.print(i + " - ");
            }
        }
    }
}
