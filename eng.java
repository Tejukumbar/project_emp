public class eng extends emp {
    double salary;
    double bonus;
    eng(double s,double b){
        salary=s;
        bonus=b;
    }
    void calculate(){
        salary=salary*(bonus/100);
        System.out.println("total:"+salary);
    }
}