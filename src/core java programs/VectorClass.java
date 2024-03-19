// Vector is a class in java which is used to store objects of any size and type. It is found in java.util package
// We cannot store primitive data types i.e int,float,char,double etc
// We use wrapper classes
// vector functions


import java.util.Vector;
class VectorClass{
    public static void main(String[] args) {
        Vector v= new Vector<>();
        v.addElement("Arjun");
        System.out.println(v);
        v.addElement("Gaurav");
        System.out.println("Vector elements are "+v);
        v.insertElementAt("Shilpi",2);
        System.out.println(v);
        v.insertElementAt("Sneha",3);
        System.out.println(v);
        v.insertElementAt("Sumit",2);
        System.out.println(v);
        // this will give an error(index 9 > 5)  v.insertElementAt("Aarav",9);
        // error   System.out.println(v);
    }
}