import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng thứ nhất: ");
        int size1 = scanner.nextInt();
        System.out.println("Nhập số lượng phần tử mảng thứ hai: ");
        int size2 = scanner.nextInt();
        int size3 = size1 +size2;
        int array1[] = new int[size1];
        int array2[] = new int[size2];
        int array3[] = new int[size3];
        int temp = size1;
        int count=0;
        for (int i = 0; i < size1; i++) {
            System.out.println("Nhập giá trị phần tử thứ " + i + ": ");
            array1[i] = scanner.nextInt();
            array3[count++] = array1[i];
        }
        for(int i=0;i<size2;i++){
            System.out.println("Nhập giá trị phần tử thứ " + i + ": ");
            array2[i] = scanner.nextInt();

            array3[count++] = array2[i];
        }
        System.out.println("Phần tử mảng 3: ");
        for (int i = 0; i < size3; i++) {
            System.out.println(array3[i] + "\t");
        }
    }
}
