/**edited by ilya**/
interface SortingAlg {
    int[] sort (int[] list);
    String name(int[] list);
}


class TimeTracker implements SortingAlg{

    SortingAlg alg;
    String name;
    double result;


    public TimeTracker(SortingAlg alg, String name) {
        this.alg = alg;
        this.name = name;
    }


    @Override
    public int[] sort(int[] list) {
        long start = System.nanoTime();
        list = alg.sort(list);
        long end = System.nanoTime();
        result = (end - start)/1000000000.0;
        ArrayTools.print(list);
        return list;
    }

    @Override
    public String name(int[] list){
        list = alg.sort(list);
        return name;
    }
}

public class Run extends TimeTracker{


    public Run(SortingAlg alg, String name) {
        super(alg, name);
    }


    static TimeTracker minResult(TimeTracker[] trackers) {
        double min = trackers[0].result;
        TimeTracker bestTracker = trackers[0];
        for (int i = 1; i < trackers.length; i++) {
            if (trackers[i].result < min) {
                min = trackers[i].result;
                bestTracker = trackers[i];
            }
        }
        return bestTracker;
    }

    public static void main (String[] args) {
        int n = Input.getPositiveInt("Введите целое число - размер массива.");
        int[] list = new int[n];
        ArrayTools.fillrandom(list);

        TimeTracker[] algs = new TimeTracker[] {
                new TimeTracker(new IlyaSorts.InsertionSort(), "Ilya.InsertionSort"),
                new TimeTracker(new IlyaSorts.BubbleSort(), "Ilya.BubbleSort"),
                new TimeTracker(new IlyaSorts.MergeSort(), "Ilya.MergeSort"),
                new TimeTracker(new IlyaSorts.QuickSort(), "Ilya.Quicksort"),
                new TimeTracker(new IlyaSorts.SelectionSort(), "Ilya.SelectionSort"),
        };

        for (TimeTracker alg: algs) {
            int[] listt = list.clone();
            alg.sort(listt);
            System.out.println(alg.name);
            System.out.println(alg.result);
        }

    }
}
