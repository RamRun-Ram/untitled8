package geekbrains.lesson;

public class Cat extends Animal {

    Cat(int runLength,float jumpHeight) {
        super(runLength, jumpHeight);
    }

        boolean run(int runLength)
        {
            if (runLength <= 200)
            {
                return true;
            }
            return false;
        }
    boolean jump(double jumpHeight)
    {
        if (jumpHeight <= 2)
        {
            return true;
        }
        return false;
    }
    boolean swim(int swimLenght){
        if(swimLenght==0){
            return true;
        }return false;

    }
    }

