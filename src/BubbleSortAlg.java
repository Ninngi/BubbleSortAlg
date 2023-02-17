
public class BubbleSortAlg {
        public void sort(int[] array) {
            
            for (var i = 0; i < array.length; i++) {
                for (var j = 1; j < array.length - i; j++)
                    if (array[j] < array[j - 1]) {
                        swap(array, j, j - 1);
                    }
                if (isSorted);
            }
        }

        private void swap(int[] array, int index_1, int index_2){
            var tempVar = array[index_1];
            array[index_1] = array[index_2];
            array[index_2] = tempVar;
        }
}
