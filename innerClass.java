// class test{    //correct
//     String name;
//     public test(String name){
//         this.name=name;
//     }

// }


// static class test{  //wrong
//     String name;
//     public test(String name){
//         this.name=name;
//     }

// }
public class innerClass {
    static class test{               //correct,because class test not dependent on the object of the outer class
        String name;
        public test(String name){
            this.name=name;
        }

    }


    //  class test{    //error ,because class test is dependent of outer class and we can not  create object of inner class in static main method (non stactic cannot be accesed in static method)
    //     String name;
    //     public test(String name){
    //         this.name=name;
    //     }

    // }


    public static void main(String[] args) {
        test a =new test("kunal");
    }
}
