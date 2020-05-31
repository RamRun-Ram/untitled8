package geekbrains.lesson;

public abstract class Animal {

        int runLength;
        int swimLenght;
        double jumpHeight;

        Animal(int runLength,int swimLenght,double jumpHeight){

                this.runLength = runLength;
                this.swimLenght = swimLenght;
                this.jumpHeight = jumpHeight;

        }
        Animal(int runLength,double jumpHeight){
                this.runLength = runLength;
                this.jumpHeight = jumpHeight;
        }

        abstract boolean run(int runLength);
        abstract boolean jump(double jumpHeight);
        abstract boolean swim(int swimLenght);




    }

