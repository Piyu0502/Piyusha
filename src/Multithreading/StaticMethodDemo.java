package Multithreading;

public class StaticMethodDemo {
    class Table{
       synchronized public void printTable(int no){
            for(int i = 1;i<=10;i++){
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(no * 1);
                }
            }
        }
    }

    class ThreadTableOne extends Thread{
        Table table;
        ThreadTableOne(Table table){
            this.table=table;
        }
        public void run() {
            table.printTable(5);
        }
    }
    class ThreadTableTwo extends Table{
        Table table;
        ThreadTableTwo(Table table){
            this.table=table;
        }
        public void run(){
            table.printTable(7);
        }
    }
    public class SynchronisedMethodDemo{
        public void main(String[] args) {
           Table table = new Table();

        }
    }
}
