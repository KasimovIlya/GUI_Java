/***author Ilya***/

public class IlyaSorts {

    //Ilya Insertion Sort

    public static class InsertionSort implements SortingAlg {

        @Override
        public int[] sort(int[] list) {
            for (int i = 0; i < list.length; i++) {
                int j;
                int num = list[i];

                for (j = i - 1; j >= 0 && list[j] > num; j--) {
                    list[j + 1] = list[j];
                }
                list[j + 1] = num;
            }
            return list;
        }
        @Override
        public String name(int[] list) {
            return "Ilya.InsertionSort";
        }
    }

    //Ilya BubbleSort

    public static class BubbleSort implements SortingAlg {

        @Override
        public int[] sort(int[] list) {
            for (int i = 0; i < list.length; i++) {
                int num = list[i];

                for (int j = i - 1; j >= 0; j--) {
                    int leftNumber = list[j];

                    if (num < leftNumber) {
                        list[j + 1] = leftNumber;
                        list[j] = num;

                    } else {
                        break;
                    }
                }
            }
            return list;
        }
        @Override
        public String name(int[] list) {
            return "Ilya.BubbleSort";
        }
    }

    //Ilya MergeSort

    public static class MergeSort implements SortingAlg {

        @Override
        public int[] sort(int[] list) {



            return list;
        }
        @Override
        public String name(int[] list) {
            return "Ilya.MergeSort";
        }
    }

    //Ilya Quicksort

    public static class QuickSort implements SortingAlg {

        @Override
        public int[] sort(int[] list) {

            return list;
        }
        @Override
        public String name(int[] list) {
            return "Ilya.Quicksort";
        }
    }

    //Ilya SelectionSort
    public static class SelectionSort implements SortingAlg {

        @Override
        public int[] sort(int[] list) {
            for (int i = 0; i < list.length - 1; i++) {
                Integer min = i;
                for (int j = i + 1; j < list.length; j++) {
                    if (list[j] < list[min]) {
                        min = j;
                    }
                }
                ArrayTools.swap(list, i, min);
            }
            return list;
        }
        @Override
        public String name(int[] list) {
            return "Ilya.SelectionSort";
        }
    }
}
