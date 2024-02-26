import java.util.ArrayList;

class ArraysAndLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> al = new ArrayList<>();

        // Create and add the inner ArrayLists
        ArrayList<String> innerList1 = new ArrayList<>();
        innerList1.add("generate aaa 1");
        al.add(innerList1);

        ArrayList<String> innerList2 = new ArrayList<>();
        innerList2.add("count 1");
        al.add(innerList2);

        ArrayList<String> innerList3 = new ArrayList<>();
        innerList3.add("revoke bbb 2");
        al.add(innerList3);


        //To run operations on the arrayList
        runListOps(al);
    }

    private static void runListOps(ArrayList<ArrayList<String>> al) {
        for(ArrayList<String> e : al) {
            for(String s : e) {
                if(!(s.indexOf(' ') == s.lastIndexOf(' ')))
                System.out.println(s.substring(s.indexOf(' '), s.lastIndexOf(' ')));
                else 
                System.out.println(s.substring(s.indexOf(' '), s.length()));
            }
        }
    }
    

    
}