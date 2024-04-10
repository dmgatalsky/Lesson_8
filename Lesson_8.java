package Raznoe;

public class Lesson_8 {
    public static class Cyber {

        public static void main(String[] args) {
            Cyber main = new Cyber();
            String[][] correct = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}
            };
            String[][] incorrect = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}
            };
            String[][] incorrect2 = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}
            };
            try {
                main.stringExceptionTest(correct);
                main.stringExceptionTest(incorrect);
//            main.stringExceptionTest(incorrect2);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }

        public void stringExceptionTest(String[][] arr) throws MyArraySizeException {
            if (arr.length != 4) throw new MyArraySizeException("Несоотвттствие количества строк");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) throw new MyArraySizeException(String.format("Несоотвттствие количества столбцов в " +
                        " строке", i));
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }

    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }
}
