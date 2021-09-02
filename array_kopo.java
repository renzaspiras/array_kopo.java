public class array_kopo {
    public static void main(String[] args) {
        int [][] matrix={ 
            {0,1,1,1,1,100},
            {5,6,5,4,45,98}, 
            {8,8,87,78},
            {85,84,86,84,84,85,86,86,88,84,78,84,84,98,98,87,89,89,84,90,85},
            {5,3,5,4,5,100},
            {85,86,84,85}, 
        };

    int sum0=0;
    int sum1=0;
    int sum2=0;
    int sum3=0;
    int sum4=0;
    int sum5=0;

    double average0 = 0.0;
    double average1 = 0.0;
    double average2 = 0.0;
    double average3 = 0.0;
    double average4 = 0.0;
    double average5 = 0.0;

    for(int index=0;index<matrix[0].length;index=index+1)
          {
              sum0 = sum0 + matrix[0][index];
          }
    for(int index=0;index<matrix[1].length;index=index+1)
          {
              sum1 = sum1 + matrix[1][index];
          }
    for(int index=0;index<matrix[2].length;index=index+1)
          {
              sum2 = sum2 + matrix[2][index];
          }
    for(int index=0;index<matrix[3].length;index=index+1)
          {
              sum3 = sum3 + matrix[3][index];
          }
    for(int index=0;index<matrix[4].length;index=index+1)
          {
              sum4 = sum4 + matrix[4][index];
          }
    for(int index=0;index<matrix[5].length;index=index+1)
          {
              sum5 = sum5 + matrix[5][index];
          }

    average0 = sum0/matrix[0].length;
    average1 = sum1/matrix[1].length;
    average2 = sum2/matrix[2].length;
    average3 = sum3/matrix[3].length;
    average4 = sum4/matrix[4].length;
    average5 = sum5/matrix[5].length;

    System.out.println("----------------------------------------------------");
    System.out.println("Matrix  |    SUM   |  Average");
    System.out.println("----------------------------------------------------");
    System.out.println("Matrix0 |    "+sum0+"   |  " + average0);
    System.out.println("Matrix1 |    "+sum1+"   |  " + average1);
    System.out.println("Matrix2 |    "+sum2+"   |  " + average2);
    System.out.println("Matrix3 |   "+sum3+"   |  " + average3);
    System.out.println("Matrix4 |    "+sum4+"   |  " + average4);
    System.out.println("Matrix5 |    "+sum5+"   |  " + average5);
    System.out.println("----------------------------------------------------");
    System.out.print("     |Total Average: ");
    System.out.println((average0 + average1 + average2 + average3 + average4 + average5)/6);
    System.out.println("----------------------------------------------------");
    System.out.println("           By Renz Cruz Aspiras");
    System.out.println("----------------------------------------------------");
    }
}
