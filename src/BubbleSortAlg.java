
public class BubbleSortAlg {
        public void sort(int[] array) {
            boolean isSorted;
            for (var i = 0; i < array.length; i++) {
                isSorted = true;
                for (var j = 1; j < array.length - i; j++)
                    if (array[j] < array[j - 1]) {
                        swap(array, j, j - 1);
                        isSorted = false;
                    }
                if (isSorted);
                return;
            }
        }

        private void swap(int[] array, int index_1, int index_2){
            var tempVar = array[index_1];
            array[index_1] = array[index_2];
            array[index_2] = tempVar;
        }
}
