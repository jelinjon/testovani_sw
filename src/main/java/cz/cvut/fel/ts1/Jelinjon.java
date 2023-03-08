package cz.cvut.fel.ts1;

public class Jelinjon
{
    public long factorial (int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
