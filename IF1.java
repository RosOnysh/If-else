package iIElse;

public class IF1 {
    public static void main(String[] args) {
        int salary = 100 ;
       if (salary < 200){
           System.out.println("Низкая Зарплата");
       }
       else if ( salary < 400){
           System.out.println("Средняя Зарплата");
       }
       else if(salary < 600){
           System.out.println("Высокая Зарплата");
       }
       else{
           System.out.println("Чоткая Зарплата");
       }
    }
}
