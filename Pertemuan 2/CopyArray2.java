public class CopyArray2{
	public static void main(String args[]) {
		int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
		int[] array2 = new int[3];
		System.arraycopy(array1,0,array2,0,3);
		System.out.print("Array1 : ");
		for (int i=0; i<array1.length; i++)
		System.out.print(array1[i] + " ");
		System.out.println();
		System.out.print("Array2 : ");
		for (int i=0; i<array2.length; i++)
		System.out.print(array2[i] + " ");
	}
}/*kode diatas bertujuan untuk membandingkan/menguji kesamaan string
 antara array 1 dan 2*/