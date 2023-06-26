import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Min:");
        int min = sc.nextInt();
        System.out.println("Nhap Max");
        int max = sc.nextInt();
        while (min > max) {
            System.err.println("vui long nhap min<max");
            System.out.println("Nhap Min:");
            min = sc.nextInt();
            System.out.println("Nhap Max");
            max = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=min&&arr[i]<=max){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}