// single inhertance


// class bird{
//     void fly(){
//         System.out.println("i can fly high in the sky");
//     }
// }
// class parrot extends bird{
//     void birdname(){
//         System.out.println("hi my name is parrot");
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         parrot obj=new parrot();
//         obj.fly();
//         obj.birdname();
//     }
// }

// multilevel inhertance

// class bird{
//     void fly(){
//         System.out.println("i can fly high in the sky");

//     }

// }
// class parrot extends bird{
//     void birdname(){
//         System.out.println("hi my name is parrot");
//     }
// }
// class species extends parrot{
//     void specie(){
//         System.out.println("i am from the best species");
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         species a=new species();
//         a.birdname();
//         a.specie();
//         a.fly();
//     }
// }

// hierarchical inheritance

// class bird{
//     void fly(){
//         System.out.println("i can fly high in the sky");
//     }
// }
// class parrot extends bird{
//     void birdname(){
//         System.out.println("hi my name is parrot");
//     }
// }
// class hawk extends bird{
//     void birdname(){
//         System.out.println("hi my name is hawkeye");
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         parrot p=new parrot();
//         hawk h=new hawk();
//         p.birdname();
//         p.fly();
//         h.birdname();
//         h.fly();
//     }
// }

// 4.multiple inhertance

// class bird{
//     void fly(){
//         System.out.println("i am bird so its obvious i can fly");
//     }
// }
// class animal{
//     void fly(){
//         System.out.println("i am an animal so i cannot fly");
//     }
// }
// class isfly extends animal,bird{
//     void testrun(){
//         System.out.println("can i fly");
//     }
// }

// 5)-> hybrid mixture of hierarchical and multiple also it is not possible as multiple