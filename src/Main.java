public class Main   {
        public static <T extends Comparable<T>> T  max (T [] students) {
            T max = students[0];
            for (T a:students) {
                if (a.compareTo(max)>0){
                    max= a;
                }


            }
            return max;
        }
    public static void main(String[] args) {
            Double[] x= {5.24,8.63,4.56,5.36};
       UserLibrary us=new UserLibrary(568,"Avetis","Sanosyan");
        UserLibrary us1=new UserLibrary(700,"Avetis","Sanosyan");
UserLibrary[] a={us,us1};

            System.out.println( max(a));
    }
}